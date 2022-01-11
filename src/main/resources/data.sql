--INSERT INTO user_details(user_email, user_name, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed)
--VALUES('admin@email.com', 'Admin1', 123456, 'Jane', 'Doe', '16 Main St, San Diego, CA 92037', '555-555-5555', 'Admin', FALSE);

--INSERT INTO user_details(user_email, user_name, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed)
--VALUES('customer1@email.com', 'Customer1', 123456, 'John', 'Doe', '35 Enterprise Ln, Los Angeles, CA 90001', '555-222-5555', 'Customer', FALSE);

--INSERT INTO user_details(user_email, user_name, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed)
--VALUES('customer2@email.com', 'Customer2', 123456, 'James', 'Doe', '35 Enterprise Ln, Los Angeles, CA 90001', '555-222-5555', 'Customer', FALSE);


INSERT INTO roles(name)
VALUES('ROLE_USER');

INSERT INTO roles(name)
VALUES('ROLE_ADMIN');

INSERT INTO user_roles(uid, role_id)
VALUES(1, 2);

INSERT INTO user_details(user_id, email, username, password, first_name, last_name, address, contact)
VALUES('1','admin@email.com','admin', '$2a$10$MPZozc4ZGXGAPYfcahvwZusPR9opwnWomMoIXYFB0Dk6hpdi0ZCde', 'John', 'Doe', '35 Enterprise Ln, Los Angeles, CA 90001','555-222-5555');

INSERT INTO user_details(email, username, password, first_name, last_name, address, contact)
VALUES('customer@email.com','customer', '$2a$10$KgNaOf.aVTq7oiig9Wq6vuYlvz09H34Vb0FIUOr/cBhJaYESRYgGm', 'normal', 'guy', '101 consumer Ln, riverside, CA 90010','222-222-9999');

-- #------- PRODUCT DATA --------

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/xbox-one-picture-id472044719?k=20&m=472044719&s=612x612&w=0&h=CXhGzWN2fZsw0IrHMbYc6kShj1klOkfkmLcHeD4Nopw=',
'Gaming', 249.99, 'Xbox One. Rated #1 by gamers worldwide.', 'Xbox One', 10, FALSE, 'A0XB34XBOX00234');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=',
'Phones', 1099.99, 'Lastest Model - 6.7 inch display', 'iPhone 13 Pro', 100, FALSE, 'A0XB34GPHONE00234');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/apple-macbook-pro-picture-id1359231245?k=20&m=1359231245&s=612x612&w=0&h=IcpoP3WnypK72bZXnWIRebNilg5t_eUd0KiHGmvN5iI=',
'Laptops', 1999.99, 'Lastest Model - M1 Chip', 'Macbook Pro', 30, FALSE, 'A0XB34GLAPTOP00234');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/isolated-laptop-on-white-background-stock-photo-picture-id1294325987?k=20&m=1294325987&s=612x612&w=0&h=xZItYJyt0dk3HToR3gQF72PnA2XSulp6GqcoYCpNXFo=',
'Laptops', 699.99, 'Lastest Model - Intel Processor', 'HP Envy', 20, FALSE, 'A0XB34GLAPTOPHP1334');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/red-headphones-isolated-picture-id835148968?k=20&m=835148968&s=612x612&w=0&h=L9OS6ZB9ztvS04ehgSAAbFI4O6x39vDRXy17lWbOzU4=',
'Headphones', 199.99, 'Wireless Noise Cancelling Headphones', 'Beats Wireless Studio Headphones', 40, FALSE, 'A0XAB223AUDIOZ');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/apple-airpods-pro-on-white-background-incuding-clipping-path-wireless-picture-id1350672425?k=20&m=1350672425&s=612x612&w=0&h=7UK4MzAyYBD0p76lkLnpri7KZSz8vo3RmKvGzLRv5Xc=',
'Earbuds', 249.99, 'Wireless Noise Cancelling Earbuds', 'AirPod Pro', 100, FALSE, 'A0XAB223AUDIOPROT');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/xbox-one-controller-picture-id472036153?k=20&m=472036153&s=612x612&w=0&h=353Bz7VHG7lr8MdBbse9OkBT3wBFoFKl0Vqm2ivGwAE=',
'Gaming', 49.99, 'Wireless Gaming Controller (Black)', 'Xbox One Controller', 10, FALSE, 'A0XB3SLXBOXOP00234');

-- #------- CART DATA --------

INSERT INTO cart_details(user_id, cart_paid, cart_removed, cart_total) VALUES ( 1, FALSE, FALSE, 100000);

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 1, 2 );

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 2, 1 );

-- #------- DISCOUNT DATA --------

INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 1, 'Deal of the Day', 20 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 3, 'Deal of the Day', 10 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 4, 'Deal of the Day', 10 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 6, 'Deal of the Day', 10 );

