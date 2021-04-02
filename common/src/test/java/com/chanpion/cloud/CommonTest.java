package com.chanpion.cloud;

import com.chanpion.cloud.common.utils.LogUtils;
import org.junit.Test;

/**
 * @author April Chen
 * @date 2021/4/2 10:57
 */
public class CommonTest {

    @Test
    public void testLogUtil(){
        LogUtils.monitor().add("mark","test").submit();
    }
}
