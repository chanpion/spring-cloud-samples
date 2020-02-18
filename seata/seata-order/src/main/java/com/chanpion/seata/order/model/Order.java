package com.chanpion.seata.order.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author April Chen
 * @date 2020/2/17 15:53
 */
@Data
@Accessors(chain = true)
public class Order {

    private Integer id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private BigDecimal money;
}
