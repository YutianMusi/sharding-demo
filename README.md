# sharding-demo
SpringBoot通过ShardingSphere 完成分表操作

分片技术：sharding-jdbc 4.0.0
分片策略：自定义 Fnv取模
基础：springboot 2.2.1.RELEASE
接口访问：swagger 

随着业务的增加，数据量再不断增加，表数量超过300~500万，查询速度及Io读取速度瓶颈，严重影响查询及数据插入，该demo 记录如何配置表，进行数据读取分片的

注意:分片支持不同表不同策略，但建议分片策略统一，后期方便操作
