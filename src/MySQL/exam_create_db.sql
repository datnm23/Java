create table Categories (
	category_id int primary key auto_increment,
    category_name varchar(50)
);

insert into Categories(category_name)
values
("iPhone"),
("SamSung"),
("Xiaomi"),
("Sony"),
("Kindle"),
("Oppo")
;

truncate table Categories;

create table Products (
	product_id  int primary key auto_increment,
    product_name varchar(50),
    category_id int,
    price int,
    foreign key (category_id) references Categories(category_id)
);

insert into Products(product_name,category_id,price)
values
("iPhone 15",1,19190000),
("iPhone 15 Pro",1,25600000),
("iPhone 15 Plus",1,22090000),
("iPhone 15 Pro Max",1,36190000),
("iPhone 14 Pro Max ",1,26590000),
("iPhone 14 Pro",1,23590000),
("iPhone 14 Plus",1,19390000),
("iPhone 14",1,16490000),
("iPhone 13 Pro Max",1,22990000),
("iPhone 13 Pro",1,21990000),
("iPhone 13",1,13490000),
("iPhone 13 Mini",1,17490000),
("Samsung Galaxy S24 Ultra",2,29990000),
("Samsung Galaxy M34",2,5790000),
("Samsung Galaxy A15",2,4490000),
("Samsung Galaxy A54",2,8290000),
("Samsung Galaxy S23",2,13790000),
("Samsung Galaxy Z Flip5",2,19990000),
("Samsung Galaxy Z Fold5",2,34990000),
("Xiaomi 14 Ultra 5G",3,29990000),
("Xiaomi 14",3,19990000),
("Xiaomi 13T Pro 5G",3,14790000),
("Sony Xperia 1V",4,27990000),
("Sony Xperia 10 V",4,9190000),
("Kindle Kids 2022",5,3090000),
("Kindle Paperwhite 5",5,4990000),
("Kindle Oasis 3",5,6690000),
("OPPO Find N3",6,41990000),
("OPPO Find N3 Flip",6,22990000),
("OPPO Find X5 Pro",6,17490000),
("OPPO Reno10 Pro Plus 5G",6,15990000);

create table Customers (
	customer_id  int primary key auto_increment,
    customer_name varchar(50),
    email varchar(50)
);

insert into Customers (
	customer_name,
    email
)
values
("Shad Hansen","jvpFaiy@QuDpYYE.edu"),
("Presley Treutel","clLwSch@yDbdjbx.org"),
("Dimitri Gerlach","SqhFebb@bbLaFlv.edu"),
("Reginald Barrows","yfITWsP@dVrBmYm.com"),
("Marcos Funk","tAOlnSm@aRDrwyc.net"),
("Leopoldo Stiedemann","koQjCJX@NdTYFZG.ru"),
("Adriel Reichert","nHqQFgS@mgVfAKl.org"),
("Terrill Fritsch","iPDcgDU@oqQFWPj.ru"),
("Melvina Frami","UtfhnSh@NAPQtuo.ru"),
("Uriah Bogan","bgLvKLx@VwLpYHN.org");

create table Orders (
	order_id int primary key auto_increment,
    customer_id int,
    order_date date,
    foreign key (customer_id) references Customers(customer_id)
);

insert into Orders (customer_id,order_date)
values 
(1,'2024-06-01'),
(2,'2024-06-01'),
(2,'2024-06-02'),
(4,'2024-06-03'),
(5,'2024-06-02'),
(6,'2024-06-03'),
(7,'2024-05-30'),
(8,'2024-05-30'),
(2,'2024-05-30'),
(3,'2024-06-04'),
(3,'2024-06-03'),
(9,'2024-04-30'),
(4,'2024-06-02'),
(10,'2024-06-04');

create table OrderDetails  (
	order_detail_id  int primary key auto_increment,
    order_id int,
    product_id int,
    quantity int,
    foreign key (order_id) references Orders(order_id),
    foreign key (product_id ) references Products(product_id)
);

insert into OrderDetails (order_id,product_id,quantity)
values
(1,1,1),
(1,2,1),
(1,4,1),
(1,3,1),
(2,4,2),
(3,5,1),
(3,5,3),
(4,7,2),
(5,31,1),
(5,29,1),
(6,26,3),
(7,20,1),
(7,21,1),
(8,11,1),
(9,18,1),
(9,1,1),
(10,7,1),
(10,8,1),
(11,16,1),
(11,15,1),
(12,22,1),
(13,9,1),
(13,8,2),
(14,3,2);
