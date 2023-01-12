create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer (
    customer_id int primary key not null auto_increment,
    customer_name varchar(50) not null,
    customer_age int
);
select * from customer;

create table `order` (
    order_id int primary key not null auto_increment,
    customer_id int not null,
    oder_date datetime,
    order_total_price int,
    foreign key (customer_id) references customer (customer_id)
); 
select * from `order`;
create table `product`(
	product_id int primary key not null auto_increment,
    product_name varchar(50) not null,
    product_price int default 0
);
select * from `product`;
create table order_detail (
    order_id int not null,
    product_id int not null,
    od_QTY int default 0,
    primary key (order_id , product_id),
    foreign key (order_id) references `order` (order_id),
    foreign key (product_id) references `product` (product_id)
);
select * from order_detail;

drop database quan_ly_ban_hang;