/*
 Navicat Premium Data Transfer

 Source Server         : dev
 Source Server Type    : MySQL
 Source Server Version : 50638
 Source Host           : 172.21.16.52:3306
 Source Schema         : release_degree

 Target Server Type    : MySQL
 Target Server Version : 50638
 File Encoding         : 65001

 Date: 02/12/2020 20:00:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sh_in_log_0
-- ----------------------------
DROP TABLE IF EXISTS `sh_in_log_0`;
CREATE TABLE `sh_in_log_0`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业主键',
  `req_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '请求参数',
  `rep_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '返回参数',
  `type` tinyint(1) NULL DEFAULT NULL COMMENT '调用类型 1 申请统计 2 撤销统计 3 统计结果查询 4 汇总签名 5 历史属期统计',
  `is_deleted` int(1) NULL DEFAULT 0 COMMENT '是否删除, 0:未删除  1:已删除',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改日期',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_invoice_auth_log`(`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '发票认证错误日志' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sh_in_log_0
-- ----------------------------
INSERT INTO `sh_in_log_0` VALUES ('1308365791434899456', '99999999999999999999', 'fddfdfdfdfdfddf', NULL, 0, 0, '2020-09-22 19:21:43', '2020-09-22 19:21:43');

-- ----------------------------
-- Table structure for sh_in_log_1
-- ----------------------------
DROP TABLE IF EXISTS `sh_in_log_1`;
CREATE TABLE `sh_in_log_1`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业主键',
  `req_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '请求参数',
  `rep_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '返回参数',
  `type` tinyint(1) NULL DEFAULT NULL COMMENT '调用类型 1 申请统计 2 撤销统计 3 统计结果查询 4 汇总签名 5 历史属期统计',
  `is_deleted` int(1) NULL DEFAULT 0 COMMENT '是否删除, 0:未删除  1:已删除',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改日期',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_invoice_auth_log`(`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '发票认证错误日志' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sh_in_log_1
-- ----------------------------
INSERT INTO `sh_in_log_1` VALUES ('1308366133618802688', '99999999999999999999', 'fddfdfdfdfdfddf', NULL, 0, 0, '2020-09-22 19:22:58', '2020-09-22 19:22:58');
INSERT INTO `sh_in_log_1` VALUES ('1308366216837988352', '888888888888888888', 'fddfdfdfdfdfddf', NULL, 0, 0, '2020-09-22 19:23:12', '2020-09-22 19:23:12');
INSERT INTO `sh_in_log_1` VALUES ('1308366248655978496', '77777777777777777777777', 'fddfdfdfdfdfddf', NULL, 0, 0, '2020-09-22 19:23:17', '2020-09-22 19:23:17');

-- ----------------------------
-- Table structure for sh_in_log_2
-- ----------------------------
DROP TABLE IF EXISTS `sh_in_log_2`;
CREATE TABLE `sh_in_log_2`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业主键',
  `req_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '请求参数',
  `rep_parameter` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '返回参数',
  `type` tinyint(1) NULL DEFAULT NULL COMMENT '调用类型 1 申请统计 2 撤销统计 3 统计结果查询 4 汇总签名 5 历史属期统计',
  `is_deleted` int(1) NULL DEFAULT 0 COMMENT '是否删除, 0:未删除  1:已删除',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改日期',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_invoice_auth_log`(`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '发票认证错误日志' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sh_in_log_2
-- ----------------------------
INSERT INTO `sh_in_log_2` VALUES ('1308366320089169920', '222222222222222222222', 'fddfdfdfdfdfddf', NULL, 0, 0, '2020-09-22 19:23:34', '2020-09-22 19:23:34');

-- ----------------------------
-- Table structure for sh_in_toll_0
-- ----------------------------
DROP TABLE IF EXISTS `sh_in_toll_0`;
CREATE TABLE `sh_in_toll_0`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `company_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司id',
  `user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `invoice_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发票主键id',
  `biz_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务ID 发票代码-发票号码',
  `traffic_fee_flag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '通行费标志;Y-可抵扣通行费，N-不可抵扣通行费',
  `is_deleted` int(1) NULL DEFAULT 0 COMMENT '是否删除, 0:未删除  1:已删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `pk_invoice_id`(`invoice_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通行费发票扩展表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sh_in_toll_0
-- ----------------------------
INSERT INTO `sh_in_toll_0` VALUES ('1308373945296093184', '5555555555555', NULL, '333333333333333', 'abc-defffffff', 'N', 0, NULL, NULL);

-- ----------------------------
-- Table structure for sh_in_toll_1
-- ----------------------------
DROP TABLE IF EXISTS `sh_in_toll_1`;
CREATE TABLE `sh_in_toll_1`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
  `company_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司id',
  `user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `invoice_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发票主键id',
  `biz_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务ID 发票代码-发票号码',
  `traffic_fee_flag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '通行费标志;Y-可抵扣通行费，N-不可抵扣通行费',
  `is_deleted` int(1) NULL DEFAULT 0 COMMENT '是否删除, 0:未删除  1:已删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `pk_invoice_id`(`invoice_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通行费发票扩展表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sh_in_toll_1
-- ----------------------------
INSERT INTO `sh_in_toll_1` VALUES ('1308373856313933824', '5555555555555', NULL, '333333333333333', 'abc-de', 'N', 0, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
