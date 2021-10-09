-- ------------------------------------
-- Table structure for user
-- -------------------------------------
-- ����user��(�û���)
DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id varchar(32) NOT NULL,
	name varchar(20) DEFAULT NULL,
	account varchar(20) DEFAULT NULL,
	PRIMARY KEY (id),
	-- 	MYSQL�������Ĵ洢���������֣�BTREE��HASH,��BTREE��������������߲�ѯЧ��
	KEY user_name_index (name) USING BTREE,
	KEY user_account_index (account) USING BTREE
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	-- -------------------------------------
	-- Table structure for mood
	-- -------------------------------------
	-- ����mood��(˵˵��)
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
		 
 -- ����user_mood_praise_rel(���޹�����)
 CREATE TABLE user_mood_praise_rel(
	id bigint(32) NOT NULL AUTO_INCREMENT,
	user_id varchar(32) DEFAULT NULL,
	mood_id varchar(32) DEFAULT NULL,
	 PRIMARY KEY (id),
	 KEY user_mood_praise_rel_user_id_index (user_id) USING BTREE,
	 KEY user_mood_praise_rel_mood_id_index (mood_id) USING BTREE
	 )ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
	 
	 
	 -- user��ĳ�ʼ������:
	 INSERT INTO user VALUES ('1','����Ѿ','xhy');
	 INSERT INTO user VALUES ('2','����Ѿ','mmy');
	 
	 -- mood��ĳ�ʼ�����ݣ�
	 INSERT INTO mood VALUES ('1','����ssm�ܹ���Ŀ�����','1','2021-05-25 22:09:06',
	 '100');
	 INSERT INTO mood VALUES ('2','����','2','2021-05-30 17:13:04','99');
	 
	
 
	
