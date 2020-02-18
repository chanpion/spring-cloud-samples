package com.chanpion.seata.storage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chanpion.seata.storage.model.Storage;
import org.springframework.stereotype.Repository;

/**
 * @author April Chen
 * @date 2020/2/18 10:12
 */
@Repository
public interface StorageDAO extends BaseMapper<Storage> {
}
