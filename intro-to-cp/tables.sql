CREATE TABLE if not exists orders (
    id INT PRIMARY KEY,
    order_date TIMESTAMP NOT NULL
);

CREATE TABLE Products (
    ID INTEGER PRIMARY KEY,
    Name VARCHAR(45) NOT NULL,
    description VARCHAR(45),
    Price INTEGER NOT NULL
);

CREATE TABLE Order_Line (
    orders_ID INT NOT NULL,
    products_ID INT NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    line_total DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (orders_ID, products_ID),
    FOREIGN KEY (orders_ID) REFERENCES orders(id) ON DELETE CASCADE,
    FOREIGN KEY (products_ID) REFERENCES products(id) ON DELETE RESTRICT
);
