CREATE TABLE teacher ( teacherId INTEGER, firstName VARCHAR(50), lastName VARCHAR(50), salary DECIMAL);

VALUES
(1,	'Jumbo'	'Jim',	42,	65000,
2,	'Sasha'	'Fierce',	52,	66000,
3,	'Blue'	'Witt',	27,	62000);




CREATE TABLE student ( studentId INTEGER, firstName VARCHAR(50), lastName VARCHAR(50), grade INTEGER, gpa DECIMAL);

VALUES
(1,	'Saca'	'Tooya',	11,	3.9,
2,	'Tim'	'Lewis',	11,	2.9,
3,	'Mario'	'Wick',	9, 1.9,
4,	'Susan'	'Grim',	8,	0.9,
5,	'Tanner'	'Bright',	9,2.5,
6,	'Tim'	'Edwards',	8,	1.5,
7,	'Mark'	'Value',	12,	3.5,
8,	'Clem'	'Dixon',	12,	3.3,
9,	'Rodney'	'Dangerfield',	9,	1.3);


CREATE TABLE classStudent ( classStudentId INT, classId INT, studentId INT);

 VALUES
 (1,1,1,
  1,2,1,
  2,3,2,
  2,4,2,
  3,2,3,
  3,6,3,
  4,1,4,
  4,5,4,
  5,5,5,
  5,1,5,
  6,2,6,
  6,3,6,
  7,1,7,
  7,4,7,
  8,4,8,
  8,5,8,
  9,3,9,
  9,1,9,
  10,4,10,
  10,5,10);


CREATE TABLE class ( classId INTEGER, name VARCHAR(50), description VARCHAR(50), teacherId INTEGER);

VALUES
(1,'Bubble Blowing 101',	'Terminology', 1,
2,'DOT',	'Law',	1,
3,'Carrier', 'Qualifications',	'Structure',	2,
4,'Hours Of Service',	'Driver', 'Utilization',	2,
5,'Logistics', 'Equipment',	'Specifications',	3,
6,'Diesel Technology',	'Enviornmental', 'Compliance', 3);


-- CREATE 'JOINED' TABLE class;
SELECT
 teacher.firstName,
 teacher.lastName,
 class.Name
FROM
 class,
 teacher

WHERE
 class.teacherId = teacher.teacherINTEGER; );