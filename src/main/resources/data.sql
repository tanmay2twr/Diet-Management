insert into USERS
(username,name,BATCH_GROUP,BATCH_MONTH,batchname,BATCH_STATUS,Mobile,password,role)
values
('roger@gmail.com','Roger Kutcher','NA','NA','NA','NA','7052221444','wipro@123','admin'),
('steve@gmail.com','Steve Martin','NA','NA','NA','NA','7052221444','wipro@123','admin'),
('rahul@gmail.com','Rahul','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan@gmail.com','Aryan','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan1@gmail.com','Aryan1','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan2@gmail.com','Aryan2','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan3@gmail.com','Aryan3','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan4@gmail.com','Aryan4','NA','NA','NA','NA','7052221444','wipro@123','mentor'),
('aryan5@gmail.com','Aryan5','NA','NA','NA','NA','7052221444','wipro@123','mentor');
insert into BATCHDETAILS
(BATCHID,BATCHCATEGORY,BATCHSTARTDATE,BATCHENDDATE,BATCHGROUP,BATCHTENURE,BATCHSTATUS,BATCHSTRENGTH)
values
('1','AboveBMI25','1-JULY-2020','31-September-2020','Bangalore','July-Sept','Ongoing',10),
('2','AboveBMI25','1-JULY-2020','31-September-2020','Delhi','July-Sept','Ongoing',10),
('3','AboveBMI25','1-JULY-2020','31-September-2020','Kanpur','July-Sept','Ongoing',25),
('4','AboveBMI25','1-JULY-2020','31-September-2020','Lucknow','July-Sept','Ongoing',25),
('5','BelowBMI25','1-JULY-2020','31-September-2020','Bangalore','July-Sept','Ongoing',10),
('6','BelowBMI25','1-JULY-2020','31-September-2020','Delhi','July-Sept','Ongoing',10),
('7','BelowBMI25','1-JULY-2020','31-September-2020','Kanpur','July-Sept','Ongoing',25),
('8','BelowBMI25','1-JULY-2020','31-September-2020','Lucknow','July-Sept','Ongoing',25),
('9','AboveBMI25','1-APRIL-2020','31-JUNE-2020','Kanpur','April-June','Ended',25),
('10','BelowBMI25','1-APRIL-2020','31-JUNE-2020','Lucknow','July-Sept','Ended',25);