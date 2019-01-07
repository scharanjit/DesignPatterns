---- DATABASE CREATION ----

create database if not exists cascadedb;

use cascadedb;


---- STUDENT TABLE CREATION ----

create table student (s_id integer not null AUTO_INCREMENT, age integer not null, name varchar(255), subj_s_id integer, primary key (s_id));



---- SUBJECT TABLE CREATION ----

create table subject (s_id integer not null AUTO_INCREMENT, marks integer not null, name varchar(255), primary key (s_id));



---- ADD FOREIGN KEY CONSTRAINT TO THE STUDENT TABLE ----

alter table student add constraint FK8ngu5xmekwnx1882pmvgxwak foreign key (subj_s_id) references subject (s_id);



---- INSERT DATA IN SUBJECT TABLE ----

insert into subject (s_id, marks, name) values ('101', '90', 'Science'), ('102', '100', 'Mathematics');


---- INSERT DATA IN STUDENT TABLE ----

insert into student (s_id, age, name, subj_s_id) values ('1', '24', 'Michael', '101'), ('2', '22', 'John', '102');
