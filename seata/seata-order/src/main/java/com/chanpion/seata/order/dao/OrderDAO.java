package com.chanpion.seata.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chanpion.seata.order.model.Order;
import org.springframework.stereotype.Repository;

/**
 * @author April Chen
 * @date 2020/2/17 16:00
 */
@Repository
public interface OrderDAO extends BaseMapper<Order> {
}
