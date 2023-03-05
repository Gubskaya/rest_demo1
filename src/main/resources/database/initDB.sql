CREATE TABLE customers(
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    address varchar(500) NOT NULL,
    budget decimal NOT NULL
);