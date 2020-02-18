package com.chanpion.seata.storage.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author April Chen
 * @date 2020/2/17 16:17
 */
@Data
@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage {
    private Long id;
    private String commodityCode;
    private Long count;
}
