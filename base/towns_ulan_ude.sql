-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: towns
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `ulan_ude`
--

DROP TABLE IF EXISTS `ulan_ude`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ulan_ude` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ulan_ude`
--

LOCK TABLES `ulan_ude` WRITE;
/*!40000 ALTER TABLE `ulan_ude` DISABLE KEYS */;
INSERT INTO `ulan_ude` VALUES (1,'2023-06-30 19:53:06','satellite 1-7'),(2,'2023-06-30 19:54:06','satellite 1-7'),(3,'2023-06-30 19:55:26','satellite 1-7'),(4,'2023-06-30 20:04:22','satellite 1-8'),(5,'2023-06-30 20:05:12','satellite 1-8'),(6,'2023-06-30 20:06:59','satellite 1-8'),(7,'2023-06-30 20:15:38','satellite 1-1'),(8,'2023-06-30 20:16:20','satellite 1-1'),(9,'2023-06-30 20:18:24','satellite 1-1'),(10,'2023-06-30 20:26:53','satellite 1-2'),(11,'2023-06-30 20:27:27','satellite 1-2'),(12,'2023-06-30 20:29:41','satellite 1-2'),(13,'2023-06-30 20:38:09','satellite 1-3'),(14,'2023-06-30 20:38:36','satellite 1-3'),(15,'2023-06-30 20:40:56','satellite 1-3'),(16,'2023-06-30 20:49:25','satellite 1-4'),(17,'2023-06-30 20:49:46','satellite 1-4'),(18,'2023-06-30 20:52:07','satellite 1-4'),(19,'2023-06-30 21:00:41','satellite 1-5'),(20,'2023-06-30 21:00:57','satellite 1-5'),(21,'2023-06-30 21:03:15','satellite 1-5'),(22,'2023-06-30 21:11:57','satellite 1-6'),(23,'2023-06-30 21:12:09','satellite 1-6'),(24,'2023-06-30 21:14:18','satellite 1-6'),(25,'2023-06-30 21:23:13','satellite 1-7'),(26,'2023-06-30 21:23:22','satellite 1-7'),(27,'2023-06-30 21:25:16','satellite 1-7'),(28,'2023-06-30 21:34:29','satellite 1-8'),(29,'2023-06-30 21:34:36','satellite 1-8'),(30,'2023-06-30 21:36:05','satellite 1-8'),(31,'2023-06-30 21:45:46','satellite 1-1'),(32,'2023-06-30 21:45:52','satellite 1-1'),(33,'2023-06-30 21:46:32','satellite 1-1'),(34,'2023-07-01 19:44:21','satellite 1-6'),(35,'2023-07-01 19:45:00','satellite 1-6'),(36,'2023-07-01 19:45:38','satellite 1-6'),(37,'2023-07-01 19:55:08','satellite 1-7'),(38,'2023-07-01 19:56:05','satellite 1-7'),(39,'2023-07-01 19:57:31','satellite 1-7'),(40,'2023-07-01 20:06:24','satellite 1-8'),(41,'2023-07-01 20:07:11','satellite 1-8'),(42,'2023-07-01 20:09:01','satellite 1-8'),(43,'2023-07-01 20:17:40','satellite 1-1'),(44,'2023-07-01 20:18:19','satellite 1-1'),(45,'2023-07-01 20:20:25','satellite 1-1'),(46,'2023-07-01 20:28:55','satellite 1-2'),(47,'2023-07-01 20:29:26','satellite 1-2'),(48,'2023-07-01 20:31:42','satellite 1-2'),(49,'2023-07-01 20:40:11','satellite 1-3'),(50,'2023-07-01 20:40:36','satellite 1-3'),(51,'2023-07-01 20:42:56','satellite 1-3'),(52,'2023-07-01 20:51:27','satellite 1-4'),(53,'2023-07-01 20:51:46','satellite 1-4'),(54,'2023-07-01 20:54:07','satellite 1-4'),(55,'2023-07-01 21:02:43','satellite 1-5'),(56,'2023-07-01 21:02:57','satellite 1-5'),(57,'2023-07-01 21:05:14','satellite 1-5'),(58,'2023-07-01 21:13:59','satellite 1-6'),(59,'2023-07-01 21:14:09','satellite 1-6'),(60,'2023-07-01 21:16:16','satellite 1-6'),(61,'2023-07-01 21:25:15','satellite 1-7'),(62,'2023-07-01 21:25:22','satellite 1-7'),(63,'2023-07-01 21:27:13','satellite 1-7'),(64,'2023-07-01 21:36:31','satellite 1-8'),(65,'2023-07-01 21:36:36','satellite 1-8'),(66,'2023-07-01 21:37:59','satellite 1-8'),(67,'2023-07-02 19:46:07','satellite 1-6'),(68,'2023-07-02 19:46:58','satellite 1-6'),(69,'2023-07-02 19:47:49','satellite 1-6'),(70,'2023-07-02 19:57:09','satellite 1-7'),(71,'2023-07-02 19:58:04','satellite 1-7'),(72,'2023-07-02 19:59:34','satellite 1-7'),(73,'2023-07-02 20:08:25','satellite 1-8'),(74,'2023-07-02 20:09:10','satellite 1-8'),(75,'2023-07-02 20:11:04','satellite 1-8'),(76,'2023-07-02 20:19:42','satellite 1-1'),(77,'2023-07-02 20:20:18','satellite 1-1'),(78,'2023-07-02 20:22:26','satellite 1-1'),(79,'2023-07-02 20:30:57','satellite 1-2'),(80,'2023-07-02 20:31:26','satellite 1-2'),(81,'2023-07-02 20:33:42','satellite 1-2'),(82,'2023-07-02 20:42:13','satellite 1-3'),(83,'2023-07-02 20:42:35','satellite 1-3'),(84,'2023-07-02 20:44:56','satellite 1-3'),(85,'2023-07-02 20:53:29','satellite 1-4'),(86,'2023-07-02 20:53:45','satellite 1-4'),(87,'2023-07-02 20:56:06','satellite 1-4'),(88,'2023-07-02 21:04:45','satellite 1-5'),(89,'2023-07-02 21:04:57','satellite 1-5'),(90,'2023-07-02 21:07:12','satellite 1-5'),(91,'2023-07-02 21:16:01','satellite 1-6'),(92,'2023-07-02 21:16:09','satellite 1-6'),(93,'2023-07-02 21:18:14','satellite 1-6'),(94,'2023-07-02 21:27:17','satellite 1-7'),(95,'2023-07-02 21:27:22','satellite 1-7'),(96,'2023-07-02 21:29:09','satellite 1-7'),(97,'2023-07-02 21:38:33','satellite 1-8'),(98,'2023-07-02 21:38:37','satellite 1-8'),(99,'2023-07-02 21:39:53','satellite 1-8');
/*!40000 ALTER TABLE `ulan_ude` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-03 15:17:07
