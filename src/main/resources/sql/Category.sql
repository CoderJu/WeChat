  /*图书目录表*/
  create table `category`(
     `cid` INT NOT NULL AUTO_INCREMENT COMMENT '目录唯一主键',
     `cname`  VARCHAR(500) NOT NULL COMMENT '目录名称',
     `iconurl` VARCHAR(500) NOT NULL COMMENT '图片链接',
     PRIMARY KEY (`cid`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
  ALTER TABLE category COMMENT='图书目录表';


-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '文学', '/');
INSERT INTO `category` VALUES ('2', '计算机', '/');
INSERT INTO `category` VALUES ('3', '外语', '/');
INSERT INTO `category` VALUES ('4', '法律', '/');
INSERT INTO `category` VALUES ('5', '艺术', '/');
INSERT INTO `category` VALUES ('6', '考试', '/');
INSERT INTO `category` VALUES ('7', '建筑', '/');
INSERT INTO `category` VALUES ('8', '电子', '/');
INSERT INTO `category` VALUES ('9', '机械', '/');
INSERT INTO `category` VALUES ('10', '生化', '/');
INSERT INTO `category` VALUES ('11', '教育', '/');
INSERT INTO `category` VALUES ('12', '经管', '/');
INSERT INTO `category` VALUES ('13', '环境', '/');
INSERT INTO `category` VALUES ('14', '理科', '/');
INSERT INTO `category` VALUES ('15', '其它', '/');