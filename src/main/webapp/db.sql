CREATE TABLE nov22_member(
	m_id varchar2(20 char) PRIMARY KEY,
	m_pw varchar2(24 char) not null,
	m_name varchar2(10 char) not null,
	m_phone varchar2(13 char) not null,
	m_birth Date not null,
	m_photo varchar2(256 char) not null
);

DROP TABLE nov22_member cascade constraint purge;

truncate table nov22_member;

select * from nov22_member;

INSERT INTO nov22_member VALUES('Respina','sdj7524','Ji','010-7151-7524',to_date('19950222','YYYYMMDD'),'1.png');