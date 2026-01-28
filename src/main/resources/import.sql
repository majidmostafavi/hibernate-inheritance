-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO RECTANGLE (ID,COLOR, WIDTH, LENGTH)
VALUES
(100,0, 10.5, 20.0),   -- RED
(101,1, 5.0,  8.0),    -- GREEN
(102,2, 15.0, 25.5);   -- BLUE

INSERT INTO CIRCLE (ID,COLOR, RADIUS)
VALUES
(100,0, 7.5),    -- RED
(101,1, 12.0),   -- GREEN
(102,2, 4.25);   -- BLUE

INSERT INTO PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, BIRTHDAY, NATIONAL_CODE)
VALUES
(1, 'Ali',  'Ahmadi',  'ali.ahmadi@company.com',   '1990-01-15', '1234567890'),
(2, 'Sara', 'Karimi',  'sara.karimi@company.com', '1988-05-20', '2233445566'),
(3, 'Reza', 'Hosseini','reza@suppliers.com',     '1985-03-10', '3344556677'),
(4, 'Maryam','Fallahi','maryam@suppliers.com',   '1992-09-01', '4455667788');

INSERT INTO EMPLOYEE (ID, EMPLOYEE_CODE)
VALUES
(1, 10001),
(2, 10002);

INSERT INTO SUPPLIER (ID, ECONOMIC_CODE, TAX_CODE)
VALUES
(3, 555001, 99001),
(4, 555002, 99002);

INSERT INTO BANK_ACCOUNT
(ID, ACCOUNT_TYPE, NAME, CODE, BALANCE, INTEREST, BIRTH_DATE, DURATION)
VALUES
-- Junior Account
(1, 'JuniorAccount', 'Alice Junior', 'JR-001', 1000, 0.05, '2010-06-15', NULL),

-- Long Term Account
(2, 'LongTermAccount', 'Bob LongTerm', 'LT-001', 5000, 0.08, NULL, 5),

-- Short Term Account
(3, 'ShortTermAccount', 'Charlie ShortTerm', 'ST-001', 2000, 0.04, NULL, NULL);