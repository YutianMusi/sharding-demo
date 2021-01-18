package com.sharding.test;

import cn.hutool.core.util.HashUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author leijie.gao
 * @version 1.0.0
 * @ClassName JasptEncryptorTest.java
 * @Description TODO
 * @createTime 2020年12月02日 20:13:00
 */
@SpringBootTest
public class JasptEncryptorTest {
//
//    @Test
//    void Test(){
//
//    }


    public static void main(String[] args) {
        Integer table = HashUtil.fnvHash("54be7cfd-75f4-4d9c-9392-253f772c344a") % 64;
        Integer data = HashUtil.fnvHash("54be7cfd-75f4-4d9c-9392-253f772c344a") % 2;
        System.out.println("表："+table);
        System.out.println("库："+data);
    }
}
