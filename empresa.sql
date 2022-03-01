-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 192.168.10.20    Database: curso
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `cargos`
--

DROP TABLE IF EXISTS `cargos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `DESCRIPCION_UNIQUE` (`DESCRIPCION`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargos`
--

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;
INSERT INTO `cargos` VALUES (13,'arquitecto del proyecto'),(1,'director'),(8,'DISEÑADOR 3D'),(11,'Emilio '),(4,'funerario'),(6,'GUARDA FORESTAL'),(7,'Jefe'),(9,'Jefe  Proyecto'),(2,'Mamporrero'),(5,'Programatista'),(12,'Teleflojera'),(10,'TESTIGO/PROTEGIDO');
/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_laborales`
--

DROP TABLE IF EXISTS `datos_laborales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datos_laborales` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `SALARIO` int NOT NULL,
  `cargos_ID` int NOT NULL,
  PRIMARY KEY (`ID`,`cargos_ID`),
  KEY `fk_datos_laborales_cargos1_idx` (`cargos_ID`),
  CONSTRAINT `fk_datos_laborales_cargos1` FOREIGN KEY (`cargos_ID`) REFERENCES `cargos` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_laborales`
--

LOCK TABLES `datos_laborales` WRITE;
/*!40000 ALTER TABLE `datos_laborales` DISABLE KEYS */;
INSERT INTO `datos_laborales` VALUES (1,40000,1),(2,1000,7),(3,20000,7),(4,2000,8),(5,80000,9),(6,1000000,10),(7,46000,9),(8,999999999,7),(9,5500,13),(10,55000,5);
/*!40000 ALTER TABLE `datos_laborales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_personales`
--

DROP TABLE IF EXISTS `datos_personales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datos_personales` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ESTADO_CIVIL_ID` int NOT NULL,
  `hijos_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_DATOS_PERSONALES_ESTADO_CIVIL1_idx` (`ESTADO_CIVIL_ID`),
  KEY `fk_datos_personales_hijos1_idx` (`hijos_ID`),
  CONSTRAINT `fk_DATOS_PERSONALES_ESTADO_CIVIL1` FOREIGN KEY (`ESTADO_CIVIL_ID`) REFERENCES `estado_civil` (`ID`),
  CONSTRAINT `fk_datos_personales_hijos1` FOREIGN KEY (`hijos_ID`) REFERENCES `hijos` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_personales`
--

LOCK TABLES `datos_personales` WRITE;
/*!40000 ALTER TABLE `datos_personales` DISABLE KEYS */;
INSERT INTO `datos_personales` VALUES (1,4,6),(2,5,5),(3,2,3),(4,1,4),(5,1,7),(7,6,2),(8,2,6),(10,5,13),(11,1,3),(12,2,5),(13,2,5),(14,2,2);
/*!40000 ALTER TABLE `datos_personales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) NOT NULL,
  `DNI` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `FECHA_NACIMIENTO` datetime NOT NULL,
  `FECHA_ALTA` datetime NOT NULL,
  `FECHA_BAJA` datetime DEFAULT NULL,
  `datos_personales_ID` int NOT NULL,
  `EMPRESAS_ID` int NOT NULL,
  `datos_laborales_ID` int NOT NULL,
  PRIMARY KEY (`ID`,`EMPRESAS_ID`,`datos_laborales_ID`),
  UNIQUE KEY `DNI_UNIQUE` (`DNI`),
  UNIQUE KEY `TELEFONO_UNIQUE` (`TELEFONO`),
  KEY `fk_empleados_datos_personales1_idx` (`datos_personales_ID`),
  KEY `fk_empleados_EMPRESAS1_idx` (`EMPRESAS_ID`),
  KEY `fk_empleados_datos_laborales1_idx` (`datos_laborales_ID`),
  CONSTRAINT `fk_empleados_datos_laborales1` FOREIGN KEY (`datos_laborales_ID`) REFERENCES `datos_laborales` (`ID`),
  CONSTRAINT `fk_empleados_datos_personales1` FOREIGN KEY (`datos_personales_ID`) REFERENCES `datos_personales` (`ID`),
  CONSTRAINT `fk_empleados_EMPRESAS1` FOREIGN KEY (`EMPRESAS_ID`) REFERENCES `empresas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Justiniano','505050','66666','2021-03-03 00:00:00','2021-03-03 00:00:00','2021-09-09 00:00:00',4,1,3),(2,'REYno','555888','917888607','1993-03-31 00:00:00','2021-03-03 00:00:00',NULL,5,2,3),(3,'JACINTO','08036682E','681050759','1968-10-09 00:00:00','2000-12-12 00:00:00','2012-09-09 00:00:00',7,5,10),(4,'MARCELO','50123456K','666666777','1966-06-13 00:00:00','1988-04-10 00:00:00',NULL,4,4,4),(5,'Hector','52383099B','916888798','2000-02-02 00:00:00','2021-03-03 00:00:00',NULL,2,2,2),(5,'Sergio','5865254A','666666666','1900-05-10 00:00:00','1920-02-10 00:00:00','2021-05-11 00:00:00',5,5,5),(6,'Antonio','11945735','237245987','1965-11-03 00:00:00','1999-03-01 00:00:00',NULL,2,2,2),(7,'Virginia','234569','3445563','1989-04-03 00:00:00','2021-05-24 00:00:00','2021-09-26 00:00:00',10,5,5),(8,'Javi','654651646','6546546546','1985-02-12 00:00:00','1995-04-08 00:00:00',NULL,7,2,3),(9,'REY','666','66666666','2021-05-02 00:00:00','2028-03-03 00:00:00',NULL,5,5,2),(10,'PacoElFlaco','987654','987654','1000-02-02 00:00:00','2020-02-02 00:00:00',NULL,2,6,2),(11,'Anna','656565','3456789','2000-02-03 00:00:00','2022-02-09 00:00:00',NULL,4,2,3);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados_has_vehiculos`
--

DROP TABLE IF EXISTS `empleados_has_vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados_has_vehiculos` (
  `empleados_ID` int NOT NULL,
  `vehiculos_ID` int NOT NULL,
  PRIMARY KEY (`empleados_ID`,`vehiculos_ID`),
  KEY `fk_empleados_has_vehiculos_vehiculos1_idx` (`vehiculos_ID`),
  KEY `fk_empleados_has_vehiculos_empleados1_idx` (`empleados_ID`),
  CONSTRAINT `fk_empleados_has_vehiculos_empleados1` FOREIGN KEY (`empleados_ID`) REFERENCES `empleados` (`ID`),
  CONSTRAINT `fk_empleados_has_vehiculos_vehiculos1` FOREIGN KEY (`vehiculos_ID`) REFERENCES `vehiculos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados_has_vehiculos`
--

LOCK TABLES `empleados_has_vehiculos` WRITE;
/*!40000 ALTER TABLE `empleados_has_vehiculos` DISABLE KEYS */;
INSERT INTO `empleados_has_vehiculos` VALUES (3,1),(4,2),(10,2),(1,3),(5,3),(6,3),(7,3),(10,3),(10,4),(1,5),(6,5),(1,7),(7,7),(9,7),(4,8),(6,8),(7,9),(6,10),(4,12),(7,12),(9,12),(4,15),(9,15);
/*!40000 ALTER TABLE `empleados_has_vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresas`
--

DROP TABLE IF EXISTS `empresas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) NOT NULL,
  `CIF` varchar(9) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresas`
--

LOCK TABLES `empresas` WRITE;
/*!40000 ALTER TABLE `empresas` DISABLE KEYS */;
INSERT INTO `empresas` VALUES (1,'Vendetuercas','50505050'),(2,'Conectrol','51646542'),(3,'REY.S.L','55556666'),(4,'MERCEDES BENZ','666666666'),(5,'BOMBERO','345900678'),(6,'Urgalólogo','12069852'),(7,'Anonymous','B776585'),(8,'serviceweb','19304568h');
/*!40000 ALTER TABLE `empresas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_civil`
--

DROP TABLE IF EXISTS `estado_civil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_civil` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_civil`
--

LOCK TABLES `estado_civil` WRITE;
/*!40000 ALTER TABLE `estado_civil` DISABLE KEYS */;
INSERT INTO `estado_civil` VALUES (1,'soltero'),(2,'casado'),(3,'divorciado'),(4,'separado'),(5,'pareja de hecho'),(6,'viudo'),(7,'2');
/*!40000 ALTER TABLE `estado_civil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hijos`
--

DROP TABLE IF EXISTS `hijos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hijos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NUMERO_CHICOS` int NOT NULL,
  `NUMERO_CHICAS` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hijos`
--

LOCK TABLES `hijos` WRITE;
/*!40000 ALTER TABLE `hijos` DISABLE KEYS */;
INSERT INTO `hijos` VALUES (1,2,3),(2,1,2),(3,4,0),(4,3,8),(5,5,10),(6,0,0),(7,1500,1500),(8,0,3),(9,1,1),(10,2,2),(11,0,5),(12,750,750),(13,3,8),(14,0,1),(15,2,5);
/*!40000 ALTER TABLE `hijos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_carnet`
--

DROP TABLE IF EXISTS `tipo_carnet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_carnet` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_carnet`
--

LOCK TABLES `tipo_carnet` WRITE;
/*!40000 ALTER TABLE `tipo_carnet` DISABLE KEYS */;
INSERT INTO `tipo_carnet` VALUES (1,'carnet A'),(2,'carnet B'),(3,'carnet C'),(4,'carnet D'),(5,'carnet E');
/*!40000 ALTER TABLE `tipo_carnet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `MARCA` varchar(45) NOT NULL,
  `MODELO` varchar(45) NOT NULL,
  `TIPO_CARNET_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_VEHICULOS_TIPO_CARNET1_idx` (`TIPO_CARNET_ID`),
  CONSTRAINT `fk_VEHICULOS_TIPO_CARNET1` FOREIGN KEY (`TIPO_CARNET_ID`) REFERENCES `tipo_carnet` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES (1,'toyota','fiesta',3),(2,'Aston Martin','DBS',2),(3,'Nissan','Juke',2),(4,'SEAT','PANDA',2),(5,'seat','ibiza',4),(6,'renault','five5',2),(7,'Lexus','500',2),(8,'FORD','MONDEO',2),(9,'OPEL','ZAFIRA',2),(10,'Relault','Laguna',2),(11,'RENAULT','MEGANE',5),(12,'BMV','Mini',2),(13,'tesla','noase',2),(14,'600','Mr. Bean Edition',1),(15,'MERCEDES','REY',2);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-01 14:24:14
