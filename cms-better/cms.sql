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

CREATE TABLE t_cms_dict(
  id BIGINT NOT NULL AUTO_INCREMENT UNIQUE COMMENT '主键',
  dict_id VARCHAR(32) NOT NULL UNIQUE COMMENT '字典唯一标识',
  dict_name VARCHAR(20) NOT NULL COMMENT '字典类别名称',
  parent_id VARCHAR(32) NOT NULL COMMENT '父级唯一标识',
  create_time DATETIME COMMENT '创建时间',
  create_user_id VARCHAR(32) COMMENT '创建者用户id',
  update_time DATETIME COMMENT '更新时间',
  update_user_id VARCHAR(32) COMMENT '更新者用户id'
) CHARACTER SET 'utf8' COMMENT '资讯类别表';

create table t_cms_news(
  id BIGINT not null auto_increment primary key COMMENT '主键',
  title varchar(50) not null COMMENT '新闻标题',
  description varchar(45) null COMMENT '新闻简介',
  category int null COMMENT '新闻种类',
  content mediumtext null,
  picture_id  varchar(32) not NULL COMMENT '新闻图片地址',
  check_id VARCHAR(32) COMMENT '审核id',
  create_date datetime null,
  update_date datetime null,
  create_user_id VARCHAR(32) NOT NULL COMMENT '创建者id',
  update_user_id VARCHAR(32) NOT NULL COMMENT '更新者id',
  del tinyint null comment '1，正常 2，删除',
  browses_count int null comment '浏览数',
  likes_count int null comment '喜欢数',
  comments_count int null comment '回复数'
) CHARACTER SET 'utf8' COMMENT '新闻咨询表';

alter TABLE t_cms_news RENAME t_cms_information;
ALTER TABLE t_cms_information add COLUMN sort INT(5) DEFAULT 0 COMMENT '排序字段' AFTER comments_count;
ALTER TABLE t_cms_information add COLUMN keywords VARCHAR(50) DEFAULT '' COMMENT '关键词' AFTER sort;
ALTER TABLE t_cms_information add COLUMN classified_column VARCHAR(50) DEFAULT '' COMMENT '栏目类别' AFTER keywords;
ALTER TABLE t_cms_information add COLUMN big_title VARCHAR(100) DEFAULT '' COMMENT '大标题' AFTER title;
ALTER TABLE t_cms_information add COLUMN source VARCHAR(20) DEFAULT '' COMMENT '文章来源' AFTER classified_column;
ALTER TABLE t_cms_information add COLUMN allow_comment TINYINT(1) DEFAULT 0 COMMENT '是否允许评论 0:允许 1:不允许' AFTER comments_count;
ALTER TABLE t_cms_information add COLUMN comment_start_time TIMESTAMP COMMENT '评论开始时间' AFTER allow_comment;
ALTER TABLE t_cms_information add COLUMN comment_end_time TIMESTAMP COMMENT '评论结束时间' AFTER comment_start_time;
ALTER TABLE t_cms_information add COLUMN author VARCHAR(20) COMMENT '文章作者' AFTER classified_column;
ALTER TABLE t_cms_dict add COLUMN del TINYINT(1) DEFAULT 0 COMMENT '是否删除';
ALTER TABLE t_cms_check add COLUMN check_name VARCHAR(40) DEFAULT '' COMMENT '审核单名称' AFTER check_id;
ALTER TABLE t_cms_check add COLUMN create_time TIMESTAMP COMMENT '创建时间' AFTER del;
ALTER TABLE t_cms_check add COLUMN create_user_id VARCHAR(32) COMMENT '创建者' AFTER create_time;
ALTER TABLE t_cms_check add COLUMN check_time TIMESTAMP COMMENT '审核时间' AFTER create_user_id;
ALTER TABLE t_cms_check add COLUMN check_user_id VARCHAR(32) COMMENT '审核者' AFTER check_time;


