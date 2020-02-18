package com.chanpion.seata.account.controller;

import com.chanpion.seata.account.service.AccountService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author April Chen
 * @date 2020/2/18 10:27
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    public void  reduce(@RequestParam String userId, @RequestParam BigDecimal orderMoney){
        accountService.reduce(userId,orderMoney);
    }
}
