package com.sharding.test.biz.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sharding.test.biz.dto.request.ShInLogRequest;
import com.sharding.test.biz.service.IShInLogService;
import com.sharding.test.biz.entity.ShInLog;
import com.sharding.test.biz.mapper.ShInLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author test
 * @since 2020-09-28
 */
@Service
public class ShInLogServiceImpl extends ServiceImpl<ShInLogMapper, ShInLog> implements IShInLogService {

    /**
     * 保存
     * @param request
     * @return
     */
    public boolean saveShInLog(ShInLogRequest request){
        ShInLog shInLog =new ShInLog();
        BeanUtil.copyProperties(request,shInLog);
        Snowflake snowflake = IdUtil.createSnowflake(0, 0);
        shInLog.setId(snowflake.nextIdStr());
        return this.save(shInLog);
    }

    /**
     * 查询
     * @param companyId
     * @return
     */
    public List<ShInLog> queryShInLog(String companyId){
        QueryWrapper<ShInLog> wrappers = new QueryWrapper();
        wrappers.eq(ShInLog.COMPANY_ID,companyId);
        return list(wrappers);
    }
}
