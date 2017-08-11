package com.hai.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {
    private Logger logger = LogManager.getLogger(Log4j2Test.class.getName());

    /* 测试配置文件 */
    @Test
    public void testConfig() {
        logger.trace("qe");
    }
}
