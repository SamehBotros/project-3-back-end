DROP TABLE IF EXISTS user_details;

CREATE TABLE user_details(
user_id INT NOT NULL GENERATED ALWAYS AS IDENTITY,
email VARCHAR UNIQUE,
username VARCHAR,
password VARCHAR(128),
address VARCHAR,
first_name VARCHAR,
last_name VARCHAR,
contact VARCHAR,
CONSTRAINT uk4d9rdl7d52k8x3etihxlaujvh UNIQUE (email),
CONSTRAINT ukqqadnciq8gixe1qmxd0rj9cyk UNIQUE (username),
PRIMARY KEY(user_id));

DROP TABLE IF EXISTS roles;

CREATE TABLE roles (
	id INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	name varchar NULL,
	CONSTRAINT roles_pk PRIMARY KEY (id)
);

DROP TABLE IF EXISTS user_roles;

CREATE TABLE user_roles (
	uid INT NOT NULL,
	role_id INT NOT NULL
);


DROP TABLE IF EXISTS product_details;

CREATE TABLE product_details(
product_id INT GENERATED ALWAYS AS IDENTITY,
product_name VARCHAR(100),
product_cost DECIMAL(100, 2),
product_category VARCHAR,
product_description VARCHAR,
product_sku VARCHAR,
product_qty INT,
image_url VARCHAR,
product_removed BOOLEAN,
PRIMARY KEY(product_id));

DROP TABLE IF EXISTS image_details;

CREATE TABLE image_details(
image_id INT GENERATED ALWAYS AS IDENTITY,
product_id INT,
image_url VARCHAR,
PRIMARY KEY(image_id),
FOREIGN KEY(product_id) REFERENCES product_details(product_id) ON DELETE CASCADE);


DROP TABLE IF EXISTS cart_details;

CREATE TABLE cart_details(
cart_id INT GENERATED ALWAYS AS IDENTITY,
user_id INT,
cart_total INT,
cart_paid BOOLEAN,
cart_removed BOOLEAN,
PRIMARY KEY(cart_id),
FOREIGN KEY(user_id) REFERENCES user_details(user_id));

DROP TABLE IF EXISTS cart_items;

CREATE TABLE cart_items(
cart_item_id INT GENERATED ALWAYS AS IDENTITY,
cart_id INT,
product_id INT,
cart_qty INT,
PRIMARY KEY(cart_item_id),
FOREIGN KEY(cart_id) REFERENCES cart_details(cart_id),
FOREIGN KEY(product_id) REFERENCES product_details(product_id));

DROP TABLE IF EXISTS transaction_details;

CREATE TABLE transaction_details(
transaction_id INT GENERATED ALWAYS AS IDENTITY,
transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
cart_id INT,
PRIMARY KEY(transaction_id),
FOREIGN KEY(cart_id) REFERENCES cart_details(cart_id));

DROP TABLE IF EXISTS discount_details;

CREATE TABLE discount_details(
discount_id INT GENERATED ALWAYS AS IDENTITY,
product_id INT,
discount_description VARCHAR,
discount_percentage DECIMAL(100, 2),
PRIMARY KEY(discount_id),
FOREIGN KEY(product_id) REFERENCES product_details(product_id) ON DELETE CASCADE);

DROP TABLE IF EXISTS reviews;

CREATE TABLE reviews(
    review_id INT GENERATED ALWAYS AS IDENTITY,
    product_id INT,
    user_id INT,
    date DATE DEFAULT CURRENT_DATE,
    title VARCHAR(100),
    review VARCHAR,
    rating INT,
    PRIMARY KEY(review_id),
    FOREIGN KEY(product_id) REFERENCES product_details(product_id),
    FOREIGN KEY(user_id) REFERENCES user_details(user_id)
);

DROP TABLE IF EXISTS purchased_items;

CREATE TABLE purchased_items(
    item_id INT GENERATED ALWAYS AS IDENTITY,
    product_id INT,
    user_id INT,
    cart_id INT,
    transaction_id INT,
    purchase_date DATE DEFAULT CURRENT_DATE,
    item_qty INT,
    purchase_cost DECIMAL(100, 2),
    PRIMARY KEY(item_id),
    FOREIGN KEY(product_id) REFERENCES product_details(product_id),
    FOREIGN KEY(user_id) REFERENCES user_details(user_id),
    FOREIGN KEY(transaction_id) REFERENCES transaction_details(transaction_id),
    FOREIGN KEY(cart_id) REFERENCES cart_details(cart_id)
);

