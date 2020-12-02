package com.sharding.test.biz.service;

import com.sharding.test.biz.dto.request.ShInLogRequest;
import com.sharding.test.biz.entity.ShInLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author test
 * @since 2020-09-28
 */
public interface IShInLogService extends IService<ShInLog> {
     boolean saveShInLog(ShInLogRequest request);

     List<ShInLog> queryShInLog(String companyId);
}
