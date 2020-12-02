package com.sharding.test.biz.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leijie.gao
 * @version 1.0.0
 * @ClassName JasptEncryptorController.java
 * @Description TODO
 * @createTime 2020年12月01日 16:19:00
 */
@Slf4j
@RestController
@RequestMapping("/sharding/jaspt")
public class JasptEncryptorController {

    @Autowired
    private StringEncryptor stringEncryptor;

    @ApiOperation(value = "通过Jasypt方式对内容加密")
    @PostMapping(value = "/jasyptEncrypt")
    public String jasyptEncrypt(@RequestParam("content") String content) {
        log.info("通过Jasypt方式对内容加密,加密内容:{}", JSONObject.toJSONString(content));
        String cn = stringEncryptor.encrypt(content);
        return cn;
    }

    @ApiOperation(value = "通过Jasypt方式对内容解密")
    @PostMapping(value = "/jasyptDecrypt")
    public String jasyptDecrypt(@RequestParam("content") String content) {
        log.info("通过Jasypt方式对内容解密,解密内容:{}", JSONObject.toJSONString(content));
        String cn = stringEncryptor.decrypt(content);
        return cn;
    }
}
