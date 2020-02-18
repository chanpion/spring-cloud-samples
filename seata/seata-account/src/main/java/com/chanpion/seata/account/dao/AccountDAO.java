package com.chanpion.seata.account.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chanpion.seata.account.model.Account;
import org.springframework.stereotype.Repository;

/**
 * @author April Chen
 * @date 2020/2/18 10:28
 */
@Repository
public interface AccountDAO extends BaseMapper<Account> {
    Account findByUserId(String userId);
}
