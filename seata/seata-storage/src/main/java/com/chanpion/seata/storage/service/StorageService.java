package com.chanpion.seata.storage.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chanpion.seata.storage.dao.StorageDAO;
import com.chanpion.seata.storage.model.Storage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/18 10:14
 */
@Service
public class StorageService {

    @Resource
    private StorageDAO storageDAO;

    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     */
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        if (commodityCode.equals("product-2")) {
            throw new RuntimeException("异常:模拟业务异常:Storage branch exception");
        }

        QueryWrapper<Storage> wrapper = new QueryWrapper<>();
        wrapper.setEntity(new Storage().setCommodityCode(commodityCode));
        Storage storage = storageDAO.selectOne(wrapper);
        storage.setCount(storage.getCount() - count);

        storageDAO.updateById(storage);
    }
}
