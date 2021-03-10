CREATE TABLE user1 (
    id INT,
    First_Name VARCHAR(100),
    Last_Name VARCHAR(80),
    DateofBirth DATE,
    Age INT,
    user_status VARCHAR(40)
);

CREATE TABLE address (
    Street_No INT,
    District VARCHAR(100),
    State VARCHAR(80),
    Country VARCHAR(40)
);

CREATE TABLE contact_details (
    Mob_No DOUBLE,
    Official_MailId VARCHAR(80),
    Personal_MailId VARCHAR(40)
);