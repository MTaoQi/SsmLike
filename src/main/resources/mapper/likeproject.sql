-- ------------------------------------
-- Table structure for user
-- -------------------------------------
-- 创建user表(用户表)
DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id varchar(32) NOT NULL,
	name varchar(20) DEFAULT NULL,
	account varchar(20) DEFAULT NULL,
	PRIMARY KEY (id),
	-- 	MYSQL中索引的存储类型有两种：BTREE和HASH,用BTREE来创建索引，提高查询效率
	KEY user_name_index (name) USING BTREE,
	KEY user_account_index (account) USING BTREE
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	-- -------------------------------------
	-- Table structure for mood
	-- -------------------------------------
	-- 创建mood表(说说表)
	DROP TABLE IF EXISTS mood;
	CREATE TABLE mood (
		id varchar(32) NOT NULL,
		content varchar(256) DEFAULT NULL,
		user_id varchar(32) DEFAULT NULL,
		publish_time datetime DEFAULT NULL,
		praise_num int(11) DEFAULT NULL,
		 PRIMARY KEY (id),
		 KEY mood_user_id_index (user_id) USING BTREE
		 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
		 
 -- 创建user_mood_praise_rel(点赞关联表)
 CREATE TABLE user_mood_praise_rel(
	id bigint(32) NOT NULL AUTO_INCREMENT,
	user_id varchar(32) DEFAULT NULL,
	mood_id varchar(32) DEFAULT NULL,
	 PRIMARY KEY (id),
	 KEY user_mood_praise_rel_user_id_index (user_id) USING BTREE,
	 KEY user_mood_praise_rel_mood_id_index (mood_id) USING BTREE
	 )ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
	 
	 
	 -- user表的初始化数据:
	 INSERT INTO user VALUES ('1','晓惠丫','xhy');
	 INSERT INTO user VALUES ('2','慢慢丫','mmy');
	 
	 -- mood表的初始化数据：
	 INSERT INTO mood VALUES ('1','今天ssm架构项目答辩啦','1','2021-05-25 22:09:06',
	 '100');
	 INSERT INTO mood VALUES ('2','加油','2','2021-05-30 17:13:04','99');
	 
	
 
	
