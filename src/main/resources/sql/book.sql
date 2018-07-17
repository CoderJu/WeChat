  /*图书表*/
  create table `book`(
     `bid` INT NOT NULL AUTO_INCREMENT COMMENT '图书唯一主键',
     `bname`  VARCHAR(1000) NOT NULL COMMENT '图书名称',
     `imageurl` VARCHAR(500)  COMMENT '图片链接',
			`bdesc` VARCHAR(4000)  COMMENT '图书描述',
			`author` VARCHAR(500) NOT NULL COMMENT '作者',
			`cid` INT NOT NULL COMMENT '目录ID',
     PRIMARY KEY (`bid`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
  ALTER TABLE book COMMENT='图书表';