#DDL COMMANDS

create table address (id bigint(20) primary key auto_increment,street_name varchar(45) not null,city varchar(45) not null,state varchar(45) not null,country varchar(45) not null);

create table company (id bigint(20)primary key auto_increment,name varchar(45) not null,description varchar(45) not null,createdBy varchar(25));

create table role (id bigint(20) primary key auto_increment,name varchar(45),description varchar(45));

create table senior (id bigint(20) primary key auto_increment,designation varchar(45), yearOfPassing int(11),department varchar(45),company_id bigint(20),foreign key (company_id) references company(id)) ;

create table user (id bigint(20) primary key auto_increment,first_name varchar(45),last_name varchar(45),password varchar(45),email varchar(45),mobile_number varchar(45),gender varchar(45),date_of_birth date,address_id bigint(20),role_id bigint(20),foreign key (address_id) references address(id),foreign key (role_id) references role(id));

#DML COMMANDS

insert into address (street_name,city,state,country) values ('37, NGR Street','Udayampalayam','Tamil Nadu','India');
insert into address (street_name,city,state,country) values ('37, NGR Street','Washington','Tamil Nadu','India');
insert into address (street_name,city,state,country) values ('7th Cross Street','Washington','London','United Status');
insert into address (street_name,city,state,country) values ('37, NGR Street','Udayampalayam','Tamil Nadu','India');

insert into company (name,description,createdBy) values ('dummy','dummy','dummy');

insert into role (name,description) values ('Placement Officer','Placement Officer');
insert into role (name,description) values ('Junior','Junior');
insert into role (name,description) values ('Senior','Senior');
insert into role (name,description) values ('Faculty','Faculty');

insert into senior (id,designation,yearOfPassing,department,company_id) values (4,'Backend Developer','2019','EEE',1);