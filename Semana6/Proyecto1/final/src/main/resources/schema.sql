DROP TABLE product IF EXISTS;

CREATE TABLE product (
    productId VARCHAR(20) NOT NULL,
    productName VARCHAR(20),
    price VARCHAR(30),
    stock INT,
    department VARCHAR(30)

);
