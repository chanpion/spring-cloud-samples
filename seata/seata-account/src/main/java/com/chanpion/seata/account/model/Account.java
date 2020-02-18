package com.chanpion.seata.account.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author April Chen
 * @date 2020/2/18 10:28
 */
@Data
public class Account {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
