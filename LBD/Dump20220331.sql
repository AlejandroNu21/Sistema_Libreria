CREATE DATABASE  IF NOT EXISTS `libreriabd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `libreriabd`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: libreriabd
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `Categoria` varchar(20) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idClientes` int NOT NULL AUTO_INCREMENT,
  `CodigoCliente` char(8) NOT NULL,
  `NombreCliente` varchar(45) NOT NULL,
  `ApellidoCliente` varchar(45) NOT NULL,
  `Edad` int NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  PRIMARY KEY (`idClientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `idCompras` int NOT NULL AUTO_INCREMENT,
  `idLibro` int NOT NULL,
  `idEditorial` int NOT NULL,
  `Fecha_Compra` date NOT NULL,
  `idFormadePago` int NOT NULL,
  `Cantidad_Libros` int NOT NULL,
  `Precio_UnitarioCompra` double NOT NULL,
  PRIMARY KEY (`idCompras`),
  KEY `fk_compras_editorial1_idx` (`idEditorial`),
  KEY `fk_compras_libro1_idx` (`idLibro`),
  KEY `fk_compras_forma_de_pago1_idx` (`idFormadePago`),
  CONSTRAINT `fk_compras_editorial1` FOREIGN KEY (`idEditorial`) REFERENCES `editorial` (`idEditorial`),
  CONSTRAINT `fk_compras_forma_de_pago1` FOREIGN KEY (`idFormadePago`) REFERENCES `forma_de_pago` (`idForma_De_Pago`),
  CONSTRAINT `fk_compras_libro1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_escritor`
--

DROP TABLE IF EXISTS `datos_escritor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datos_escritor` (
  `idDatos_Escritor` int NOT NULL AUTO_INCREMENT,
  `idEscritor` int NOT NULL,
  `Fecha_Nacimiento` varchar(15) NOT NULL,
  `Lugar_Nacimiento` varchar(45) NOT NULL,
  `Fecha_Deceso` varchar(15) NOT NULL,
  `Lugar_Deceso` varchar(45) NOT NULL,
  `Biografia` varchar(700) NOT NULL,
  PRIMARY KEY (`idDatos_Escritor`),
  KEY `fk_datos_escritor_escritor1_idx` (`idEscritor`),
  CONSTRAINT `fk_datos_escritor_escritor1` FOREIGN KEY (`idEscritor`) REFERENCES `escritor` (`idEscritor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_escritor`
--

LOCK TABLES `datos_escritor` WRITE;
/*!40000 ALTER TABLE `datos_escritor` DISABLE KEYS */;
/*!40000 ALTER TABLE `datos_escritor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_libro`
--

DROP TABLE IF EXISTS `datos_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datos_libro` (
  `idDatos_Libro` int NOT NULL AUTO_INCREMENT,
  `idLibro` int NOT NULL,
  `Reseña` varchar(700) NOT NULL,
  `Precio` double NOT NULL,
  `Cantidad` int NOT NULL,
  `Disponible` varchar(2) NOT NULL,
  `Año_Publicacion` varchar(12) NOT NULL,
  PRIMARY KEY (`idDatos_Libro`),
  KEY `fk_datos_libro_libro1_idx` (`idLibro`),
  CONSTRAINT `fk_datos_libro_libro1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_libro`
--

LOCK TABLES `datos_libro` WRITE;
/*!40000 ALTER TABLE `datos_libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `datos_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `idEditorial` int NOT NULL AUTO_INCREMENT,
  `CodigoEditorial` char(8) NOT NULL,
  `Nombre_Editorial` varchar(45) NOT NULL,
  `Direccion_Editorial` varchar(100) NOT NULL,
  `Telefono_Editorial` varchar(15) NOT NULL,
  PRIMARY KEY (`idEditorial`),
  UNIQUE KEY `CodigoEditorial_UNIQUE` (`CodigoEditorial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escritor`
--

DROP TABLE IF EXISTS `escritor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escritor` (
  `idEscritor` int NOT NULL AUTO_INCREMENT,
  `Codigo_Escritor` char(8) NOT NULL,
  `Nombre_Escritor` varchar(45) NOT NULL,
  `Apellido_Escritor` varchar(45) NOT NULL,
  `Pais_Escritor` varchar(45) NOT NULL,
  PRIMARY KEY (`idEscritor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escritor`
--

LOCK TABLES `escritor` WRITE;
/*!40000 ALTER TABLE `escritor` DISABLE KEYS */;
/*!40000 ALTER TABLE `escritor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_libros`
--

DROP TABLE IF EXISTS `estado_libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_libros` (
  `idEstado_Libros` int NOT NULL AUTO_INCREMENT,
  `idLibro` int NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstado_Libros`),
  KEY `fk_estado_libros_libro1_idx` (`idLibro`),
  CONSTRAINT `fk_estado_libros_libro1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_libros`
--

LOCK TABLES `estado_libros` WRITE;
/*!40000 ALTER TABLE `estado_libros` DISABLE KEYS */;
/*!40000 ALTER TABLE `estado_libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forma_de_pago`
--

DROP TABLE IF EXISTS `forma_de_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `forma_de_pago` (
  `idForma_De_Pago` int NOT NULL AUTO_INCREMENT,
  `Pago` varchar(15) NOT NULL,
  PRIMARY KEY (`idForma_De_Pago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forma_de_pago`
--

LOCK TABLES `forma_de_pago` WRITE;
/*!40000 ALTER TABLE `forma_de_pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `forma_de_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero_literario`
--

DROP TABLE IF EXISTS `genero_literario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero_literario` (
  `idGenero_Literario` int NOT NULL AUTO_INCREMENT,
  `Genero_Literario` varchar(15) NOT NULL,
  PRIMARY KEY (`idGenero_Literario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero_literario`
--

LOCK TABLES `genero_literario` WRITE;
/*!40000 ALTER TABLE `genero_literario` DISABLE KEYS */;
/*!40000 ALTER TABLE `genero_literario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lector`
--

DROP TABLE IF EXISTS `lector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lector` (
  `idLector` int NOT NULL AUTO_INCREMENT,
  `CodigoLector` varchar(25) NOT NULL,
  `Nombre_Lector` varchar(25) NOT NULL,
  `Apellido_Lector` varchar(45) NOT NULL,
  `Edad` int NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  PRIMARY KEY (`idLector`),
  UNIQUE KEY `CodigoLector_UNIQUE` (`CodigoLector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lector`
--

LOCK TABLES `lector` WRITE;
/*!40000 ALTER TABLE `lector` DISABLE KEYS */;
/*!40000 ALTER TABLE `lector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `idLibro` int NOT NULL AUTO_INCREMENT,
  `Codigo_Libro` char(8) NOT NULL,
  `idEditorial` int NOT NULL,
  `Titulo` varchar(45) NOT NULL,
  `idEscritor` int NOT NULL,
  `idCategoria` int NOT NULL,
  `idGenero_Literario` int NOT NULL,
  `idSubgenero_Literario` int NOT NULL,
  `Clasificacion` varchar(5) NOT NULL,
  PRIMARY KEY (`idLibro`),
  KEY `fk_libro_categoria1_idx` (`idCategoria`),
  KEY `fk_libro_genero_literario1_idx` (`idGenero_Literario`),
  KEY `fk_libro_subgenero_literario1_idx` (`idSubgenero_Literario`),
  KEY `fk_libro_escritor1_idx` (`idEscritor`),
  CONSTRAINT `fk_libro_categoria1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`),
  CONSTRAINT `fk_libro_escritor1` FOREIGN KEY (`idEscritor`) REFERENCES `escritor` (`idEscritor`),
  CONSTRAINT `fk_libro_genero_literario1` FOREIGN KEY (`idGenero_Literario`) REFERENCES `genero_literario` (`idGenero_Literario`),
  CONSTRAINT `fk_libro_subgenero_literario1` FOREIGN KEY (`idSubgenero_Literario`) REFERENCES `subgenero_literario` (`idSubgenero_Literario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `idPrestamo` int NOT NULL AUTO_INCREMENT,
  `idLector` int NOT NULL,
  `idLibro` int NOT NULL,
  `Fecha_Prestamo` varchar(15) NOT NULL,
  `Fecha_Devolucion` varchar(15) DEFAULT NULL,
  `Devuelto` varchar(2) NOT NULL,
  PRIMARY KEY (`idPrestamo`),
  KEY `fk_prestamo_lector1_idx` (`idLector`),
  KEY `fk_prestamo_libro1_idx` (`idLibro`),
  CONSTRAINT `fk_prestamo_lector1` FOREIGN KEY (`idLector`) REFERENCES `lector` (`idLector`),
  CONSTRAINT `fk_prestamo_libro1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `idRol` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(15) NOT NULL,
  `Contrasenia` varchar(25) NOT NULL,
  PRIMARY KEY (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subgenero_literario`
--

DROP TABLE IF EXISTS `subgenero_literario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subgenero_literario` (
  `idSubgenero_Literario` int NOT NULL AUTO_INCREMENT,
  `Subgenero_Literario` varchar(25) NOT NULL,
  PRIMARY KEY (`idSubgenero_Literario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subgenero_literario`
--

LOCK TABLES `subgenero_literario` WRITE;
/*!40000 ALTER TABLE `subgenero_literario` DISABLE KEYS */;
/*!40000 ALTER TABLE `subgenero_literario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `idVentas` int NOT NULL AUTO_INCREMENT,
  `idLibro` int NOT NULL,
  `idCliente` int NOT NULL,
  `Fecha_Venta` varchar(25) NOT NULL,
  `idForma_De_Pago` int NOT NULL,
  `Cantidad_Libros` varchar(45) NOT NULL,
  `Precio_Unitario` varchar(45) NOT NULL,
  PRIMARY KEY (`idVentas`),
  KEY `fk_ventas_clientes_idx` (`idCliente`),
  KEY `fk_ventas_forma_de_pago1_idx` (`idForma_De_Pago`),
  KEY `fk_ventas_libro1_idx` (`idLibro`),
  CONSTRAINT `fk_ventas_clientes` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idClientes`),
  CONSTRAINT `fk_ventas_forma_de_pago1` FOREIGN KEY (`idForma_De_Pago`) REFERENCES `forma_de_pago` (`idForma_De_Pago`),
  CONSTRAINT `fk_ventas_libro1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'libreriabd'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-31 11:02:11
