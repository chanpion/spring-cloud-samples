package com.chanpion.seata.account.service;

import com.chanpion.seata.account.dao.AccountDAO;
import com.chanpion.seata.account.model.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author April Chen
 * @date 2020/2/18 10:27
 */
@Service
public class AccountService {
    @Resource
    private AccountDAO accountDAO;

    @Transactional(rollbackFor = Exception.class)
    public void reduce(String userId, BigDecimal num) {
        Account account = accountDAO.findByUserId(userId);
        accountDAO.insert(account);
    }
}
