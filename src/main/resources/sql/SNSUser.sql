/*用户通过微信授权表*/
create table `snsuser`(
   `id` INT NOT NULL AUTO_INCREMENT COMMENT '网页授权主键(自增长)',
   `openid`  VARCHAR(255) NOT NULL COMMENT '用户的唯一标识',
   `nickname` VARCHAR(100) NOT NULL COMMENT '用户昵称',
   `sex` VARCHAR(5)   COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
   `country` VARCHAR(100)   COMMENT '用户个人资料填写的国家',
   `province` VARCHAR(100)   COMMENT '普通用户个人资料填写的省份',
   `city` VARCHAR(200)   COMMENT '普通用户个人资料填写的城市',
   `headimgurl` text   COMMENT '用户头像',
   `privilegeid` VARCHAR(255)   COMMENT '用户特权信息表id',
   `unionid` VARCHAR(200)   COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
   `createdate` VARCHAR(50) COMMENT '创建日期',
   `createtime` VARCHAR(50) COMMENT '创建时间',
   `lastoperatedate` VARCHAR(50) COMMENT '最后操作日期',
   `lastoperatetime` VARCHAR(50) COMMENT '最后操作日期',
   `lastname` VARCHAR(100)   COMMENT '用户姓名',
   `telephone` VARCHAR(100)   COMMENT '用户手机号码',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE snsuser COMMENT='用户通过微信授权表';


/*特权信息表*/
create table `privilege`(
 `id` INT NOT NULL AUTO_INCREMENT COMMENT '用户特权信息表id',
 `snsuserid` INT NOT NULL COMMENT '网页授权用户id',
 `privilege` VARCHAR(200) NOT NULL COMMENT '特权信息',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE privilege COMMENT='特权信息表';
