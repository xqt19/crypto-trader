create table Trade(id bigint not null, name varchar(255) not null,price double not null, customer_id integer, primary key (id));
create table Customer(id bigint not null,name varchar(255) not null,balance double not null,primary key (id));
create table Marketdata(id bigint not null,name varchar(255) not null,bidprice double not null, askprice double not null,primary key (id));
create table MarketdataBinance(symbol varchar(255), bidPrice double, bidQty double, askPrice double, askQty double);
