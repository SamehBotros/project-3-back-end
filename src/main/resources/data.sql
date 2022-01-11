INSERT INTO roles(name)
VALUES('ROLE_USER');

INSERT INTO roles(name)
VALUES('ROLE_ADMIN');

INSERT INTO user_roles(uid, role_id)
VALUES(1, 2);

INSERT INTO user_details(user_id, email, username, password, first_name, last_name, address, contact)
VALUES(1 ,'admin@example.com', 'admin', '$2a$10$MPZozc4ZGXGAPYfcahvwZusPR9opwnWomMoIXYFB0Dk6hpdi0ZCde', 'John', 'Doe', '35 Enterprise Ln, Los Angeles, CA 90001','555-222-5555');

-- #------- PRODUCT DATA --------

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/xbox-one-picture-id472044719?k=20&m=472044719&s=612x612&w=0&h=CXhGzWN2fZsw0IrHMbYc6kShj1klOkfkmLcHeD4Nopw=',
'Video Games', 249.99, 'Xbox One. Rated #1 by gamers worldwide.', 'Xbox One', 10, FALSE, 'M33A1R28XC7IPIAKM23EBS6');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=',
'Phones', 1099.99, 'Lastest Model - 6.7 inch display', 'iPhone 13 Pro', 100, FALSE, 'SMA87ILY2XPMCSIA386AL7X');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/apple-macbook-pro-picture-id1359231245?k=20&m=1359231245&s=612x612&w=0&h=IcpoP3WnypK72bZXnWIRebNilg5t_eUd0KiHGmvN5iI=',
'Laptops', 1999.99, 'Lastest Model - M1 Chip', 'Macbook Pro', 30, FALSE, '4537RKYK1L768BREXE2HB2P');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/isolated-laptop-on-white-background-stock-photo-picture-id1294325987?k=20&m=1294325987&s=612x612&w=0&h=xZItYJyt0dk3HToR3gQF72PnA2XSulp6GqcoYCpNXFo=',
'Laptops', 699.99, 'Lastest Model - Intel Processor', 'Dell Inspiron', 20, FALSE, '76E78I3CKB3RIB26BE48CMH');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/red-headphones-isolated-picture-id835148968?k=20&m=835148968&s=612x612&w=0&h=L9OS6ZB9ztvS04ehgSAAbFI4O6x39vDRXy17lWbOzU4=',
'Headphones', 199.99, 'Wireless Noise Cancelling Headphones', 'Beats Wireless Studio Headphones', 40, FALSE, 'KB35KPBC85I5RBS1LX566XC');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/apple-airpods-pro-on-white-background-incuding-clipping-path-wireless-picture-id1350672425?k=20&m=1350672425&s=612x612&w=0&h=7UK4MzAyYBD0p76lkLnpri7KZSz8vo3RmKvGzLRv5Xc=',
'Headphones', 249.99, 'Wireless Noise Cancelling Earbuds', 'AirPod Pro', 100, FALSE, '77L4S95C28698CLMSP88L31');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/xbox-one-controller-picture-id472036153?k=20&m=472036153&s=612x612&w=0&h=353Bz7VHG7lr8MdBbse9OkBT3wBFoFKl0Vqm2ivGwAE=',
'Video Games', 49.99, 'Wireless Gaming Controller (Black)', 'Xbox One Controller', 10, FALSE, 'I9P5XCXP1R913LC2PKEA693');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/digital-camera-with-clipping-path-picture-id96826250?k=20&m=96826250&s=612x612&w=0&h=K7XKMtkYAwNQ3uEkMLSA9X7Y7UuGlREVjZlzFon202I=',
'Cameras', 599.99, 'Digital Camera w/ 24-105mm Lens', 'Cannon DSLR Camera', 25, FALSE, '75ERRE69HIL14A3B721L838');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/red-compact-digital-camera-isolated-on-white-picture-id157684451?k=20&m=157684451&s=612x612&w=0&h=7usS8tN8NkQAmFq7RmA9Fc6AsSxiwrWMcIyzUAuOSKg=',
'Cameras', 199.99, 'Point and Shoot Digital Camera (Red)', 'Kodak Compact Digital Camera', 15, FALSE, '7IIE8LHXRS9SS5S6B5SB693');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/leica-m3-picture-id458406169?k=20&m=458406169&s=612x612&w=0&h=HRzpimFjHYKi08-0ueChNK4Y2rpZadfpsPWrIVDXYEU=',
'Cameras', 1499.99, 'New Heritage - Pro Digital Camera', 'Leica Vintage Digital Camera', 20, FALSE, 'ILK7II615RRLL51733EYP9C');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/digital-camera-picture-id182508808?k=20&m=182508808&s=612x612&w=0&h=heAbftUM6tqesXkVk1P7SCKk2_xWy9M-4UJiItKXcCs=',
'Cameras', 399.99, 'Point and Shoot Digital Camera (Silver)', 'Sony Pro Digital Camera', 30, FALSE, 'PP467R2RMISCAI2XPKLL17A');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/nikon-d5100-camera-with-35mm-lens-picture-id458565153?k=20&m=458565153&s=612x612&w=0&h=UjqW18DYXX_j4aNb4VTcdRVd2XPTg9Td_y8BGPmbRZE=',
'Cameras', 499.99, 'Professional DSLR Camera w/ 35mm Lens', 'Nikon DSLR D5100 Camera', 25, FALSE, 'LSLRBYC915BSA57XBAEH7B3');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/january-10-2017-bose-quietcomfort-35-picture-id639837434?k=20&m=639837434&s=612x612&w=0&h=X_a0EfIif7sIK5AxwpKAyIcHjT1mKEpV4FTzcSbHt_Y=',
'Headphones', 299.99, 'Wireless Noise Cancelling Headphones (White)', 'Bose QuietComfort 35 II Headphones', 55, FALSE, 'RSKRYYYE41K3C8MBPSI3675');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/white-screen-led-tv-television-isolated-on-white-background-picture-id1144975137?k=20&m=1144975137&s=612x612&w=0&h=x7kDw8A6wgIngdpYG7RTXUEqs05op4YQXqtKPpIbp6k=',
'TV & Video', 799.99, 'Latest Model - UHD6500 Series', '65" Samsung 4K UHD Smart TV', 40, FALSE, '3KKIY6RX3H76YI8912KH7R2');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/curved-tv-isolated-on-white-picture-id614142568?k=20&m=614142568&s=612x612&w=0&h=Mxjsv8xGggmlB4a463UdURZDRYNLjv4o6_5wpEaDN24=',
'TV & Video', 649.99, 'Latest Model - UHD5500 Series', '55" Samsung 4K UHD Curved TV', 40, FALSE, 'E5344H84KA61ER687B3R3KC');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/freestanding-computer-widescreen-picture-id175471094?k=20&m=175471094&s=612x612&w=0&h=MVtmPMWnSKbHjp_TP_wTIn2hOka1n4ZLlMlAhAYfrKo=',
'TV & Video', 1299.99, 'Latest Model - iMac', 'iMac Desktop/Monitor', 40, FALSE, 'E5344H84KA61ER687B3R3KC');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/flat-screen-lcd-or-oled-plasma-realistic-illustration-white-blank-hd-picture-id944512054?k=20&m=944512054&s=612x612&w=0&h=ia8YwDwykDFtpoW6S5kix_1_o1kUt6cPvu__wVElXKs=',
'TV & Video', 249.99, 'Latest Model - OLED Flat-Screen', 'Dell OLED Monitor', 40, FALSE, 'H174IPHP513AH8MCEHB4H6E');

INSERT INTO product_details(image_url, product_category, product_cost, product_description, product_name, product_qty, product_removed, product_sku)
VALUES('https://media.istockphoto.com/photos/gamer-laptop-with-video-game-picture-id511210673?k=20&m=511210673&s=612x612&w=0&h=xyABPpFDd_PDH1dMJKG3e2ghy041JoPc5FoyDJz4TsI=',
'Laptops', 1199.99, 'Latest Model w/ Updated Graphics', 'Generic Gaming Laptop', 20, FALSE, '7SX3PB2K92M9PI5R82RCARY');


-- #------- CART DATA --------

INSERT INTO cart_details(user_id, cart_paid, cart_removed, cart_total) VALUES ( 1, FALSE, FALSE, 100000);

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 1, 2 );

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 2, 1 );

-- #------- DISCOUNT DATA --------

INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 1, 'Deal of the Day', 20 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 3, 'Deal of the Day', 10 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 4, 'Deal of the Day', 10 );
INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 6, 'Deal of the Day', 10 );

