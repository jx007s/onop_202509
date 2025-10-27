-- Active: 1759295776133@@127.0.0.1@3306@onop_db
update exam set pw = '1111';


CREATE TABLE `exam` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hakgi` int DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `pid` varchar(100) DEFAULT NULL,
  `reg_date` date DEFAULT NULL,
  `kor` int DEFAULT NULL,
  `eng` int DEFAULT NULL,
  `mat` int DEFAULT NULL,
  `ff` varchar(255) DEFAULT NULL,
  `pw` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3