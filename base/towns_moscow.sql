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
-- Table structure for table `moscow`
--

DROP TABLE IF EXISTS `moscow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `moscow` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `moscow`
--

LOCK TABLES `moscow` WRITE;
/*!40000 ALTER TABLE `moscow` DISABLE KEYS */;
INSERT INTO `moscow` VALUES (1,'2023-07-01 00:13:35','satellite 1-6'),(2,'2023-07-01 00:14:25','satellite 1-6'),(3,'2023-07-01 00:15:15','satellite 1-6'),(4,'2023-07-01 00:24:03','satellite 1-7'),(5,'2023-07-01 00:25:30','satellite 1-7'),(6,'2023-07-01 00:26:58','satellite 1-7'),(7,'2023-07-01 00:34:48','satellite 1-8'),(8,'2023-07-01 00:36:36','satellite 1-8'),(9,'2023-07-01 00:38:26','satellite 1-8'),(10,'2023-07-01 00:46:01','satellite 1-1'),(11,'2023-07-01 00:47:44','satellite 1-1'),(12,'2023-07-01 00:49:48','satellite 1-1'),(13,'2023-07-01 00:57:16','satellite 1-2'),(14,'2023-07-01 00:58:51','satellite 1-2'),(15,'2023-07-01 01:01:05','satellite 1-2'),(16,'2023-07-01 01:08:32','satellite 1-3'),(17,'2023-07-01 01:10:00','satellite 1-3'),(18,'2023-07-01 01:12:20','satellite 1-3'),(19,'2023-07-01 01:19:48','satellite 1-4'),(20,'2023-07-01 01:21:10','satellite 1-4'),(21,'2023-07-01 01:23:32','satellite 1-4'),(22,'2023-07-01 01:31:04','satellite 1-5'),(23,'2023-07-01 01:32:21','satellite 1-5'),(24,'2023-07-01 01:34:41','satellite 1-5'),(25,'2023-07-01 01:42:20','satellite 1-6'),(26,'2023-07-01 01:43:33','satellite 1-6'),(27,'2023-07-01 01:45:47','satellite 1-6'),(28,'2023-07-01 01:53:36','satellite 1-7'),(29,'2023-07-01 01:54:46','satellite 1-7'),(30,'2023-07-01 01:56:50','satellite 1-7'),(31,'2023-07-01 02:04:52','satellite 1-8'),(32,'2023-07-01 02:05:59','satellite 1-8'),(33,'2023-07-01 02:07:47','satellite 1-8'),(34,'2023-07-01 02:16:09','satellite 1-1'),(35,'2023-07-01 02:17:15','satellite 1-1'),(36,'2023-07-01 02:18:36','satellite 1-1'),(37,'2023-07-02 00:15:25','satellite 1-6'),(38,'2023-07-02 00:16:23','satellite 1-6'),(39,'2023-07-02 00:17:22','satellite 1-6'),(40,'2023-07-02 00:25:58','satellite 1-7'),(41,'2023-07-02 00:27:29','satellite 1-7'),(42,'2023-07-02 00:29:01','satellite 1-7'),(43,'2023-07-02 00:36:46','satellite 1-8'),(44,'2023-07-02 00:38:35','satellite 1-8'),(45,'2023-07-02 00:40:28','satellite 1-8'),(46,'2023-07-02 00:48:03','satellite 1-1'),(47,'2023-07-02 00:49:43','satellite 1-1'),(48,'2023-07-02 00:51:49','satellite 1-1'),(49,'2023-07-02 00:59:18','satellite 1-2'),(50,'2023-07-02 01:00:51','satellite 1-2'),(51,'2023-07-02 01:03:06','satellite 1-2'),(52,'2023-07-02 01:10:34','satellite 1-3'),(53,'2023-07-02 01:12:00','satellite 1-3'),(54,'2023-07-02 01:14:20','satellite 1-3'),(55,'2023-07-02 01:21:50','satellite 1-4'),(56,'2023-07-02 01:23:10','satellite 1-4'),(57,'2023-07-02 01:25:31','satellite 1-4'),(58,'2023-07-02 01:33:06','satellite 1-5'),(59,'2023-07-02 01:34:21','satellite 1-5'),(60,'2023-07-02 01:36:40','satellite 1-5'),(61,'2023-07-02 01:44:22','satellite 1-6'),(62,'2023-07-02 01:45:33','satellite 1-6'),(63,'2023-07-02 01:47:46','satellite 1-6'),(64,'2023-07-02 01:55:38','satellite 1-7'),(65,'2023-07-02 01:56:46','satellite 1-7'),(66,'2023-07-02 01:58:47','satellite 1-7'),(67,'2023-07-02 02:06:54','satellite 1-8'),(68,'2023-07-02 02:08:00','satellite 1-8'),(69,'2023-07-02 02:09:43','satellite 1-8'),(70,'2023-07-02 02:18:11','satellite 1-1'),(71,'2023-07-02 02:19:15','satellite 1-1'),(72,'2023-07-02 02:20:29','satellite 1-1'),(73,'2023-07-03 00:17:16','satellite 1-6'),(74,'2023-07-03 00:18:22','satellite 1-6'),(75,'2023-07-03 00:19:28','satellite 1-6'),(76,'2023-07-03 00:27:52','satellite 1-7'),(77,'2023-07-03 00:29:28','satellite 1-7'),(78,'2023-07-03 00:31:04','satellite 1-7'),(79,'2023-07-03 00:38:48','satellite 1-8'),(80,'2023-07-03 00:40:34','satellite 1-8'),(81,'2023-07-03 00:42:29','satellite 1-8'),(82,'2023-07-03 00:50:05','satellite 1-1'),(83,'2023-07-03 00:51:43','satellite 1-1'),(84,'2023-07-03 00:53:50','satellite 1-1'),(85,'2023-07-03 01:01:20','satellite 1-2'),(86,'2023-07-03 01:02:50','satellite 1-2'),(87,'2023-07-03 01:05:06','satellite 1-2'),(88,'2023-07-03 01:12:36','satellite 1-3'),(89,'2023-07-03 01:13:59','satellite 1-3'),(90,'2023-07-03 01:16:20','satellite 1-3'),(91,'2023-07-03 01:23:52','satellite 1-4'),(92,'2023-07-03 01:25:09','satellite 1-4'),(93,'2023-07-03 01:27:31','satellite 1-4'),(94,'2023-07-03 01:35:08','satellite 1-5'),(95,'2023-07-03 01:36:21','satellite 1-5'),(96,'2023-07-03 01:38:39','satellite 1-5'),(97,'2023-07-03 01:46:24','satellite 1-6'),(98,'2023-07-03 01:47:33','satellite 1-6'),(99,'2023-07-03 01:49:44','satellite 1-6');
/*!40000 ALTER TABLE `moscow` ENABLE KEYS */;
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
