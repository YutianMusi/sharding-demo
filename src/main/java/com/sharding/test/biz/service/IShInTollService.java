package com.sharding.test.biz.service;

import com.sharding.test.biz.dto.request.ShInTollRequest;
import com.sharding.test.biz.entity.ShInToll;
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
public interface IShInTollService extends IService<ShInToll> {
    boolean saveShInToll(ShInTollRequest request);
    List<ShInToll> queryShInToll(String bizId);

}
