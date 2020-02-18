package com.chanpion.seata.order.service;

import com.chanpion.seata.order.dao.OrderDAO;
import com.chanpion.seata.order.feign.AccountFeignClient;
import com.chanpion.seata.order.feign.StorageFeignClient;
import com.chanpion.seata.order.model.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author April Chen
 * @date 2020/2/17 16:00
 */
@Service
public class OrderService {
    @Resource
    private OrderDAO orderDAO;
    @Resource
    private AccountFeignClient accountFeignClient;
    @Resource
    private StorageFeignClient storageFeignClient;

    /**
     * 下单，减库存
     *
     * @param userId
     * @param commodityCode
     * @param count
     */
    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public void placeOrder(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order().setUserId(userId).setCommodityCode(commodityCode).setCount(count);
        orderDAO.insert(order);
        storageFeignClient.deduct(commodityCode, count);
    }

    @Transactional(rollbackFor = Exception.class)
    public void create(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order()
                .setUserId(userId)
                .setCommodityCode(commodityCode)
                .setCount(count)
                .setMoney(orderMoney);
        orderDAO.insert(order);
        accountFeignClient.reduce(userId, orderMoney);
    }
}
