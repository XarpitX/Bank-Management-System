create database bankSystem;
use bankSystem;
create table signup (form_no varchar(10), name varchar(30), father_name varchar(30), DOB varchar(30), gender varchar(30), email varchar(60), marital_status varchar(30), address varchar(200), city varchar(50), pin_code varchar(30), state varchar(60)); 
select * from signup;

create table signup2 (form_no varchar(10), religion varchar(30), category varchar(30), income varchar(30), education varchar(50), occupation varchar(50), pan_no varchar(30), aadhar_no varchar(30), senior_citizen varchar(30), existing_acc varchar(30));
select * from signup2;

create table signup3 ( form_no varchar(10), account_Type varchar(40), card_no varchar(30), pin varchar(30), services  varchar(200) );
select * from signup3;

create table login (form_no varchar(30), card_no varchar(50), pin varchar(30) );
select * from login;
