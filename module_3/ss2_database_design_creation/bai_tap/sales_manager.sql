create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table Customer (
    customerID int primary key not null auto_increment,
    customerName varchar(50) not null,
    customerAge int
);
select * from Customer;

create table `Order` (
    orderID int primary key not null auto_increment,
    customerID int not null,
    oderDate datetime,
    orderTotalPrice int,
    foreign key (customerID) references customer (customerID)
); 
select * from `Order`;
create table `Product`(
	productID int primary key not null auto_increment,
    productName varchar(50) not null,
    productPrice int default 0
);
select * from `Product`;
create table OrderDetail (
    orderID int not null,
    productID int not null,
    odQTY int default 0,
    primary key (orderID , productID),
    foreign key (orderID) references `Order` (orderID),
    foreign key (productID) references `Product` (productID)
);
select * from OrderDetail;