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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (1,1,'semi','aaa','2025-05-04',77,79,69,NULL,'1111'),(2,1,'semi','bbb','2025-05-04',88,104,94,NULL,'1111'),(3,1,'semi','ccc','2025-05-04',57,59,59,'aaa.jpg','1111'),(4,1,'semi','ddd','2025-05-04',NULL,49,71,NULL,'1111'),(5,1,'final','aaa','2025-07-11',97,92,90,NULL,'1111'),(6,1,'final','bbb','2025-07-11',70,83,25,NULL,'1111'),(7,1,'final','ccc','2025-07-11',79,97,11,NULL,'1111'),(8,1,'final','ddd','2025-07-11',70,41,21,NULL,'1111'),(9,2,'semi','aaa','2025-10-15',74,92,13,NULL,'1111'),(10,2,'semi','bbb','2025-10-15',70,64,73,NULL,'1111'),(11,2,'semi','ccc','2025-10-15',80,93,79,NULL,'1111'),(12,2,'semi','ddd','2025-10-15',80,69,74,NULL,'1111'),(13,2,'final','aaa','2025-12-19',NULL,82,86,NULL,'1111'),(14,2,'final','bbb','2025-12-19',NULL,104,64,NULL,'1111'),(15,2,'final','ccc','2025-12-19',97,59,29,NULL,'1111'),(16,2,'final','fff','2025-12-19',85,99,78,NULL,'1111'),(17,1,'final','aaa','2025-07-17',78,92,52,NULL,'1111'),(18,1,'final','bbb','2025-07-17',58,67,96,NULL,'1111'),(19,2,'semi','ccc','2025-10-24',33,56,78,'20240212_1410041761294010235.jpg','1111'),(20,2,'semi','ccc','2025-10-24',33,56,78,'ANPA65681761294108109.JPG','1111'),(21,2,'semi','ccc','2025-10-24',33,56,78,'ANPA65681761295176677.JPG','1111'),(22,1,'semi','ddd','2025-10-24',78,56,92,'ê·¸ë¤31761295489668.jpg','1111'),(23,1,'final','ddd','2025-10-27',67,78,89,'TAVH74671761525544430.JPG','1111');
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

-- Dump completed on 2025-10-27 10:47:41
