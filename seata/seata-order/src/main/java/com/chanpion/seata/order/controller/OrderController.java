package com.chanpion.seata.order.controller;

import com.chanpion.seata.order.feign.StorageFeignClient;
import com.chanpion.seata.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/17 15:56
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private StorageFeignClient storageFeignClient;


    /**
     * 下单：插入订单表、扣减库存，模拟提交
     *
     * @return
     */
    @RequestMapping("/placeOrder/commit")
    public Boolean placeOrderCommit() {
        orderService.placeOrder("1", "product-1", 1);
        return true;
    }

    /**
     * 下单：插入订单表、扣减库存，模拟回滚
     *
     * @return
     */
    @RequestMapping("/placeOrder/rollback")
    public Boolean placeOrderRollback() {
        // product-2 扣库存时模拟了一个业务异常,
        orderService.placeOrder("1", "product-2", 1);
        return true;
    }


    @RequestMapping("/placeOrder")
    public Boolean placeOrder(String userId, String commodityCode, Integer count) {
        orderService.placeOrder(userId, commodityCode, count);
        return true;
    }
}
