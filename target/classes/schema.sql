create table Trade(id bigint not null, name varchar(255) not null,price double not null,primary key (id));
create table Customer(id bigint not null,name varchar(255) not null,balance double not null,primary key (id));
create table Marketdata(id bigint not null,name varchar(255) not null,bidprice double not null, askprice double not null,primary key (id));