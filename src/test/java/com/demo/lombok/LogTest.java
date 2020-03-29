package com.demo.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 类名称：LogTest
 * ********************************
 * <p>
 * 类描述：@Slf4j注解
 *
 * @author zhangxiaoxi
 * @date 下午6:00
 */
@Slf4j
public class LogTest {

    @Test
    public void func() {
        log.error("日志！！！");
    }

}
