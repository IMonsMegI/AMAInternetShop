--   USER_ROLE TABLE
INSERT INTO user_role (id, name) VALUES(1,"admin");
INSERT INTO user_role (id, name) VALUES(2,"user");


--   USERS TABLE
INSERT INTO users (id, name, surname, email, password, imageURL, userRole) VALUES(1,"Michael","Andr","michael@gmail.com","qwerty","default-user-avatar-30x30.jpg",1);
INSERT INTO users (id, name, surname, email, password, imageURL, userRole) VALUES(2,"Oleg","Olegovich","oleg@gmail.com","asdfgh","default-user-avatar-30x30.jpg",2);



--   PRODUCT STATUS TABLE
INSERT INTO product_status(id, name) VALUES(1,"available");
INSERT INTO product_status(id, name) VALUES(2,"expiring");
INSERT INTO product_status(id, name) VALUES(3,"not available");



--   PRODUCT MANUFACTURE TABLE
INSERT INTO product_manufacture(id, name) VALUES(1,"LG");
INSERT INTO product_manufacture(id, name) VALUES(2,"Sony");
INSERT INTO product_manufacture(id, name) VALUES(3,"Samsung");
INSERT INTO product_manufacture(id, name) VALUES(4,"Lenovo");
INSERT INTO product_manufacture(id, name) VALUES(5,"Asus");



--   PRODUCT CATEGORY TABLE
INSERT INTO product_category(id, name) VALUES(1,"TV");
INSERT INTO product_category(id, name) VALUES(2,"Phone");
INSERT INTO product_category(id, name) VALUES(3,"Laptop");



--   PRODUCTS TABLE
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(1,"LG 43UK6200PLA", 17000,14, 1,1,1);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(2,"Sony KDL43WF805BR Black",15000,4, 2,2,1);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(3,"Samsung UE43NU7120UXUA", 22000,13, 1,3,1);

INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(4,"Asus ZenFone 4 Max", 6000,17, 1,5,2);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(5,"Samsung Galaxy A7 2017 Duos", 5000,0, 3,3,2);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(6,"LG V30+ Raspberry Rose", 5500,2, 2,1,2);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(7,"Sony Xperia XZ2 Dual Black", 11000,11, 1,2,2);

INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(8,"ASUS VivoBook", 12300,16, 1,5,3);
INSERT INTO products(id, name, cost, count, productStatus, productManufacture, productCategory) VALUES(9,"Lenovo IdeaPad 330", 15000,23, 1,4,3);



--   TV TABLE
INSERT INTO tv(id,diagonal,bright,countOfColors) VALUES(1,36,300,16.9);
INSERT INTO tv(id,diagonal,bright,countOfColors) VALUES(2,40,350,16.9);
INSERT INTO tv(id,diagonal,bright,countOfColors) VALUES(3,42,300,16.9);



--   PHONES TABLE
INSERT INTO phones(id,camera,memory,operatingSystem,battery) VALUES(1,12,16,"Android 7.0",4000);
INSERT INTO phones(id,camera,memory,operatingSystem,battery) VALUES(2,16,32,"Android 5.0",2700);
INSERT INTO phones(id,camera,memory,operatingSystem,battery) VALUES(3,8,16,"Android 6.5",2500);
INSERT INTO phones(id,camera,memory,operatingSystem,battery) VALUES(4,20,64,"Android 8.2",4200);



--   LAPTOPS TABLE
INSERT INTO laptops(id,processor,videoMemory,ram) VALUES(1,"Core i3 4300",2,6);
INSERT INTO laptops(id,processor,videoMemory,ram) VALUES(2,"Core i5 6700",4,8);

