create DATABASE cms DEFAULT CHARSET utf8;
use cms;
CREATE TABLE t_cms_check(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  check_id VARCHAR(32) NOT NULL UNIQUE COMMENT '审核唯一标识',
  check_state TINYINT(1) NOT NULL COMMENT '审核状态：0:未审核 1：审核中 2：审核通过 3：审核失败',
  check_remark VARCHAR(500) COMMENT '审核备注',
  del TINYINT(1) not NULL COMMENT '是否删除：0未删除 1：已删除'
) CHARACTER SET 'utf8' COMMENT '审核表';

CREATE TABLE t_cms_picture(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  picture_id VARCHAR(32) NOT NULL UNIQUE COMMENT '图片唯一标识',
  picture_url VARCHAR(50) NOT NULL COMMENT '图片地址',
  source VARCHAR(10) COMMENT '图片源：0：news',
  del TINYINT(1) NOT NULL COMMENT '删除状态：0未删除 1：已删除'
) CHARACTER SET 'utf8' COMMENT '图片表';

create table t_cms_news(
  id BIGINT not null auto_increment primary key COMMENT '主键',
  title varchar(45) not null COMMENT '新闻标题',
  description varchar(45) null COMMENT '新闻简介',
  category int null COMMENT '新闻种类',
  content mediumtext null,
  picture_id  varchar(32) not NULL COMMENT '新闻图片地址',
  check_id VARCHAR(32) COMMENT '审核id',
  create_date datetime null,
  update_date datetime null,
  create_user_id VARCHAR(32) NOT NULL COMMENT '创建者id',
  update_user_id VARCHAR(32) NOT NULL COMMENT '更新者id',
  del int null comment '1，正常 2，删除',
  browses_count int null comment '浏览数',
  likes_count int null comment '喜欢数',
  comments_count int null comment '回复数'
) CHARACTER SET 'utf8' COMMENT '新闻咨询表';

