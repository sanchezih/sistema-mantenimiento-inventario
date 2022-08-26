DROP DATABASE IF EXISTS springapp;
CREATE DATABASE springapp; USE springapp;

DROP TABLE IF EXISTS products;
CREATE TABLE products (
 id INTEGER PRIMARY KEY,
 description VARCHAR(255),
 price DECIMAL(15,2)
);
CREATE INDEX products_description ON products(description);

INSERT INTO products (id, description, price) VALUES(1, 'Lamp', 5.78);
INSERT INTO products (id, description, price) VALUES(2, 'Table', 75.29);
INSERT INTO products (id, description, price) VALUES(3, 'Chair', 22.81);