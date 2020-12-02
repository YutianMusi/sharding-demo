package com.sharding.test.biz.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sharding.test.biz.dto.request.ShInLogRequest;
import com.sharding.test.biz.dto.request.ShInTollRequest;
import com.sharding.test.biz.entity.ShInLog;
import com.sharding.test.biz.mapper.ShInTollMapper;
import com.sharding.test.biz.service.IShInTollService;
import com.sharding.test.biz.entity.ShInToll;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author test
 * @since 2020-09-28
 */
@Service
public class ShInTollServiceImpl extends ServiceImpl<ShInTollMapper, ShInToll> implements IShInTollService {
    /**
     * 保存
     * @param request
     * @return
     */
    public boolean saveShInToll(ShInTollRequest request){
        ShInToll toll =new ShInToll();
        BeanUtil.copyProperties(request,toll);
        Snowflake snowflake = IdUtil.createSnowflake(0, 0);
        toll.setId(snowflake.nextIdStr());
        return this.save(toll);
    }

    /**
     * 查询
     * @param bizId
     * @return
     */
    public List<ShInToll> queryShInToll(String bizId){
        QueryWrapper<ShInToll> wrappers = new QueryWrapper();
        wrappers.eq(ShInToll.BIZ_ID,bizId);
        return list(wrappers);
    }
}
