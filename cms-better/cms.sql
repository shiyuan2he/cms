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
alter TABLE t_cms_picture MODIFY COLUMN source VARCHAR(20) DEFAULT '' NULL COMMENT '来源';
ALTER TABLE t_cms_picture MODIFY COLUMN picture_url VARCHAR(100) NOT NULL COMMENT '图片地址' DEFAULT '';

create table t_crm_user
(
  id bigint(19) default '0' not null comment '主键' primary key,
  user_code varchar(10) default '' null comment '用户编码',
  user_name varchar(19) null comment '用户名称',
  password varchar(19) null comment '用户密码',
  password_encryption_type varchar(10) null comment '密码加密类型',
  mobile bigint(11) default '0' null comment '用户手机号',
  email varchar(30) null comment '邮箱',
  sex tinyint(1) default '0' null comment '性别：0 保密，1男2女',
  remark varchar(100) null comment '备注',
  source varchar(20) null comment '用户来源',
  is_del tinyint(1) default '0' null comment '是否逻辑删除 0：启用 1：禁用',
  creater bigint(19) default '0' not null comment '创建者',
  create_time timestamp default '0000-00-00 00:00:00' not null comment '创建时间',
  updater bigint(19) default '0' null comment '更新者',
  update_time timestamp default '0000-00-00 00:00:00' not null comment '更新时间',
  age smallint(6) null,
  picture varchar(255) null,
  real_name varchar(255) null,
  constraint user_code unique (user_code),
  constraint user_name unique (user_name),
  constraint mobile unique (mobile),
  constraint email unique (email)
) comment '统一用户表'
;

create table t_crm_permission
(
  id bigint(19) auto_increment comment '主键id'
    primary key,
  auth_address varchar(100) default '' not null comment '权限地址',
  auth_description varchar(100) default '' not null comment '权限描述',
  parent_id bigint(19) default '0' not null comment '父级id',
  auth_type varchar(10) default '' not null comment '权限类型：BUTTON:按钮 MENU:菜单',
  creater bigint(19) default '0' not null comment '创建者',
  create_time timestamp default '0000-00-00 00:00:00' not null comment '创建时间',
  updater bigint(19) default '0' null comment '更新者',
  update_time timestamp default '0000-00-00 00:00:00' not null comment '更新时间',
  constraint auth_address
  unique (auth_address),
  constraint t_crm_permission_ibfk_1
  foreign key (creater) references t_crm_user (id)
)
  comment '用户权限表'
;

create index creater
  on t_crm_permission (creater)
;

create table t_crm_role
(
  id bigint(19) auto_increment comment '主键id'
    primary key,
  role_name varchar(20) default '' not null comment '角色名称',
  role_description varchar(20) default '' not null comment '角色描述',
  creater bigint(19) default '0' not null comment '创建者',
  create_time timestamp default '0000-00-00 00:00:00' not null comment '创建时间',
  updater bigint(19) default '0' null comment '更新者',
  update_time timestamp default '0000-00-00 00:00:00' not null comment '更新时间',
  constraint role_name
  unique (role_name),
  constraint t_crm_role_ibfk_1
  foreign key (creater) references t_crm_user (id)
)
  comment '用户角色表'
;

create index creater
  on t_crm_role (creater)
;

create table t_crm_role_permission
(
  id bigint(19) auto_increment comment '主键'
    primary key,
  role_id bigint(19) default '0' not null comment '关联角色表主键',
  permission_id bigint(19) default '0' not null comment '关联角色表主键',
  constraint idx_uqi_roleId_permissionId
  unique (role_id, permission_id),
  constraint t_crm_role_permission_ibfk_1
  foreign key (role_id) references t_crm_role (id),
  constraint t_crm_role_permission_ibfk_2
  foreign key (permission_id) references t_crm_permission (id)
)
  comment '角色权限表'
;

create index permission_id
  on t_crm_role_permission (permission_id)
;

create table t_crm_user_role
(
  id bigint(19) auto_increment comment '主键'
    primary key,
  user_id bigint(19) default '0' not null comment '关联用户表主键',
  role_id bigint(19) default '0' not null comment '关联角色表主键',
  constraint idx_uqi_userId_roleId
  unique (user_id, role_id),
  constraint t_crm_user_role_ibfk_1
  foreign key (user_id) references t_crm_user (id),
  constraint t_crm_user_role_ibfk_2
  foreign key (role_id) references t_crm_role (id)
)
  comment '用户角色表'
;

create index role_id
  on t_crm_user_role (role_id)
;


