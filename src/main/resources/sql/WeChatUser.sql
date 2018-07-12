/*关注用户信息表*/
create table `wechatuser`(
   `id` INT NOT NULL AUTO_INCREMENT COMMENT '关注用户主键(自增长)',
	 `subscribe`  VARCHAR(5) NOT NULL COMMENT '用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。',
	 `openid`  VARCHAR(255) NOT NULL COMMENT '用户的唯一标识',
   `nickname` VARCHAR(100) NOT NULL COMMENT '用户昵称',
   `sex` VARCHAR(5)  COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
   `country` VARCHAR(100)   COMMENT '用户个人资料填写的国家',
   `province` VARCHAR(100)   COMMENT '普通用户个人资料填写的省份',
   `city` VARCHAR(200)   COMMENT '普通用户个人资料填写的城市',
	 `language` VARCHAR(20)   COMMENT '用户的语言，简体中文为zh_CN',
   `headimgurl` text   COMMENT '用户头像',
   `subscribe_time` VARCHAR(255)   COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
   `unionid` VARCHAR(200)   COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
	 `remark` VARCHAR(50) COMMENT '公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注',
	 `groupid` VARCHAR(50) COMMENT '用户所在的分组ID（兼容旧的用户分组接口）',
	 `tagid` VARCHAR(255) COMMENT '用户被打上的标签ID列表',
	 `subscribe_scene` VARCHAR(255) COMMENT '返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，ADD_SCENE_PROFILE_CARD 名片分享，ADD_SCENE_QR_CODE 扫描二维码，ADD_SCENEPROFILE LINK 图文页内名称点击，ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，ADD_SCENE_PAID 支付后关注，ADD_SCENE_OTHERS 其他',
	 `qr_scene` VARCHAR(255) COMMENT '二维码扫码场景（开发者自定义）',
	 `qr_scene_str` text COMMENT '二维码扫码场景（开发者自定义）',
	 `createdate` VARCHAR(50) COMMENT '创建日期',
   `createtime` VARCHAR(50) COMMENT '创建时间',
   `lastname` VARCHAR(100)  COMMENT '用户姓名',
   `telephone` VARCHAR(100)   COMMENT '用户手机号码',
   `unsubscribedate` VARCHAR(100)   COMMENT '取消关注日期',
   `unsubscribetime` VARCHAR(50) COMMENT '取消关注时间',
   `lastoperatedate` VARCHAR(100)   COMMENT '上次操作日期',
   `lastoperatetime` VARCHAR(50) COMMENT '上次操作时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE wechatuser COMMENT='关注用户信息表';



/*用户被打上的标签明细表*/
create table `tag`(
 `id` INT NOT NULL AUTO_INCREMENT COMMENT '用户被打上的标签明细表',
 `wechatuserid` INT NOT NULL COMMENT '关注用户信息表id',
 `tag` VARCHAR(200) NOT NULL COMMENT '标签ID',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE tag COMMENT='用户被打上的标签明细表';