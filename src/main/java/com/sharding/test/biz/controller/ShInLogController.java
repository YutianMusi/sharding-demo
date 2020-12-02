package com.sharding.test.biz.controller;


import com.sharding.test.biz.dto.request.ShInLogRequest;
import com.sharding.test.biz.dto.request.ShInTollRequest;
import com.sharding.test.biz.entity.ShInLog;
import com.sharding.test.biz.entity.ShInToll;
import com.sharding.test.biz.service.IShInLogService;
import com.sharding.test.biz.service.IShInTollService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 日志 前端控制器
 * </p>
 *
 * @author test
 * @since 2020-09-28
 */
@RestController
@RequestMapping("/sharding/inlog")
public class ShInLogController {

    @Autowired
    private IShInLogService inLogService;
    @Autowired
    private IShInTollService tollService;

    @ApiOperation(value = "Log保存")
    @PostMapping(value = "/saveShInLog", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boolean saveShInLog(@RequestBody ShInLogRequest request) {
        return inLogService.saveShInLog(request);
    }


    @ApiOperation(value = "Log读取")
    @PostMapping(value = "/queryShInLog")
    public List<ShInLog> queryShInLog(@RequestParam("companyId") String companyId) {
        return inLogService.queryShInLog(companyId);
    }

    @ApiOperation(value = "Toll保存")
    @PostMapping(value = "/saveShInToll", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boolean saveShInToll(@RequestBody ShInTollRequest request) {
        return tollService.saveShInToll(request);
    }


    @ApiOperation(value = "Toll读取")
    @PostMapping(value = "/queryShInToll")
    public List<ShInToll> queryShInToll(@RequestParam("bizId") String bizId) {
        return tollService.queryShInToll(bizId);
    }
}
