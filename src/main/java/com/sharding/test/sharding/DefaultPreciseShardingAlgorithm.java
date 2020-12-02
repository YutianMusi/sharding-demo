package com.sharding.test.sharding;

import cn.hutool.core.util.HashUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author qijun.hou
 * @since 2020-05-27
 */
public class DefaultPreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

  /**
   * @param targetTableNames sharding 逻辑表 分表规则
   * @param shardingVal      PreciseShardingValue(logicTableName=真实表, columnName=company_id, value=company_id_value)
   * @return {{@link String}}
   */
  @Override
  public String doSharding(Collection<String> targetTableNames, PreciseShardingValue<String> shardingVal) {
    final String[] tables = targetTableNames.toArray(new String[targetTableNames.size()]);
    return ArrayUtils.isEmpty(tables) ? tables[0] : tables[HashUtil.fnvHash(shardingVal.getValue()) % targetTableNames.size()];
  }
}
