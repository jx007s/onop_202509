-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: onop_db
-- ------------------------------------------------------
-- Server version	8.4.6

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (1,1,'semi','aaa','2025-05-04',77,79,69,NULL,'1111'),(3,1,'semi','ccc','2025-05-04',57,59,59,'aaa.jpg','1111'),(5,1,'final','aaa','2025-07-11',97,92,90,NULL,'1111'),(7,1,'final','ccc','2025-07-11',79,97,11,NULL,'1111'),(8,1,'final','ddd','2025-07-11',70,41,21,NULL,'1111'),(9,2,'semi','aaa','2025-10-15',74,92,13,NULL,'1111'),(10,2,'semi','bbb','2025-10-15',70,64,73,NULL,'1111'),(11,2,'semi','ccc','2025-10-15',80,93,79,NULL,'1111'),(13,2,'final','aaa','2025-12-19',NULL,82,86,NULL,'1111'),(14,2,'final','bbb','2025-12-19',NULL,104,64,NULL,'1111'),(15,2,'final','ccc','2025-12-19',97,59,29,NULL,'1111'),(17,1,'final','aaa','2025-07-17',78,92,52,NULL,'1111'),(18,1,'final','bbb','2025-07-17',58,67,96,NULL,'1111'),(19,2,'semi','ccc','2025-10-24',33,56,78,'20240212_1410041761294010235.jpg','1111'),(20,2,'semi','ccc','2025-10-24',33,56,78,'ANPA65681761294108109.JPG','1111'),(21,2,'semi','ccc','2025-10-24',33,56,78,'ANPA65681761295176677.JPG','1111'),(22,1,'final','eee','2025-10-24',12,34,56,'ê·¸ë¤31761295489668.jpg','1111'),(26,1,'semi','aaa',NULL,11,28,53,NULL,'1111'),(27,1,'semi','bbb',NULL,31,29,32,NULL,'1111'),(28,1,'final','bbb',NULL,41,24,3,NULL,'1111'),(29,2,'semi','aaa',NULL,51,23,3,NULL,'1111'),(30,2,'final','aaa',NULL,61,26,3,NULL,'1111'),(31,2,'semi','bbb',NULL,71,23,3,NULL,'1111'),(32,2,'final','bbb',NULL,81,27,3,NULL,'1111'),(33,1,'semi','ccc',NULL,91,24,3,NULL,'1111'),(34,1,'final','ddd',NULL,11,24,3,NULL,'1111'),(35,1,'semi','eee',NULL,12,26,3,NULL,'1111'),(36,1,'final','fff',NULL,13,82,3,NULL,'1111'),(37,2,'semi','ccc',NULL,14,62,3,NULL,'1111'),(38,2,'final','ddd',NULL,15,32,3,NULL,'1111'),(39,2,'semi','eee',NULL,16,52,3,NULL,'1111'),(40,2,'final','fff',NULL,17,27,3,NULL,'1111');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-10-27 16:57:35
