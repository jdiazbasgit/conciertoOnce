-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema CURSO
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema CURSO
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `CURSO` DEFAULT CHARACTER SET utf8 ;
USE `CURSO` ;

-- -----------------------------------------------------
-- Table `CURSO`.`cargos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`cargos` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`datos_laborales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`datos_laborales` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `SALARIO` INT NOT NULL,
  `cargos_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `cargos_ID`),
  INDEX `fk_datos_laborales_cargos1_idx` (`cargos_ID` ASC) VISIBLE,
  CONSTRAINT `fk_datos_laborales_cargos1`
    FOREIGN KEY (`cargos_ID`)
    REFERENCES `CURSO`.`cargos` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`estado_civil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`estado_civil` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`hijos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`hijos` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NUMERO_CHICOS` INT NOT NULL,
  `NUMERO_CHICAS` INT NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`datos_personales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`datos_personales` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `ESTADO_CIVIL_ID` INT NOT NULL,
  `hijos_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `ESTADO_CIVIL_ID`, `hijos_ID`),
  INDEX `fk_DATOS_PERSONALES_ESTADO_CIVIL1_idx` (`ESTADO_CIVIL_ID` ASC) VISIBLE,
  INDEX `fk_datos_personales_hijos1_idx` (`hijos_ID` ASC) VISIBLE,
  CONSTRAINT `fk_DATOS_PERSONALES_ESTADO_CIVIL1`
    FOREIGN KEY (`ESTADO_CIVIL_ID`)
    REFERENCES `CURSO`.`estado_civil` (`ID`),
  CONSTRAINT `fk_datos_personales_hijos1`
    FOREIGN KEY (`hijos_ID`)
    REFERENCES `CURSO`.`hijos` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`EMPRESAS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`EMPRESAS` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(45) NOT NULL,
  `CIF` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CURSO`.`empleados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`empleados` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(45) NOT NULL,
  `DNI` VARCHAR(45) NOT NULL,
  `TELEFONO` VARCHAR(45) NOT NULL,
  `FECHA_NACIMIENTO` DATETIME NOT NULL,
  `FECHA_ALTA` DATETIME NOT NULL,
  `FECHA_BAJA` DATETIME NOT NULL,
  `datos_personales_ID` INT NOT NULL,
  `EMPRESAS_ID` INT NOT NULL,
  `datos_laborales_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `EMPRESAS_ID`, `datos_laborales_ID`),
  UNIQUE INDEX `DNI_UNIQUE` (`DNI` ASC) VISIBLE,
  UNIQUE INDEX `TELEFONO_UNIQUE` (`TELEFONO` ASC) VISIBLE,
  INDEX `fk_empleados_datos_personales1_idx` (`datos_personales_ID` ASC) VISIBLE,
  INDEX `fk_empleados_EMPRESAS1_idx` (`EMPRESAS_ID` ASC) VISIBLE,
  INDEX `fk_empleados_datos_laborales1_idx` (`datos_laborales_ID` ASC) VISIBLE,
  CONSTRAINT `fk_empleados_datos_personales1`
    FOREIGN KEY (`datos_personales_ID`)
    REFERENCES `CURSO`.`datos_personales` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleados_EMPRESAS1`
    FOREIGN KEY (`EMPRESAS_ID`)
    REFERENCES `CURSO`.`EMPRESAS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleados_datos_laborales1`
    FOREIGN KEY (`datos_laborales_ID`)
    REFERENCES `CURSO`.`datos_laborales` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `CURSO`.`TIPO_CARNET`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`TIPO_CARNET` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CURSO`.`VEHICULOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`VEHICULOS` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `MARCA` VARCHAR(45) NOT NULL,
  `MODELO` VARCHAR(45) NOT NULL,
  `TIPO_CARNET_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `TIPO_CARNET_ID`),
  INDEX `fk_VEHICULOS_TIPO_CARNET1_idx` (`TIPO_CARNET_ID` ASC) VISIBLE,
  CONSTRAINT `fk_VEHICULOS_TIPO_CARNET1`
    FOREIGN KEY (`TIPO_CARNET_ID`)
    REFERENCES `CURSO`.`TIPO_CARNET` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CURSO`.`table2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`table2` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CURSO`.`empleados_has_VEHICULOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CURSO`.`empleados_has_VEHICULOS` (
  `empleados_ID` INT NOT NULL,
  `empleados_EMPRESAS_ID` INT NOT NULL,
  `empleados_datos_laborales_ID` INT NOT NULL,
  `VEHICULOS_ID` INT NOT NULL,
  PRIMARY KEY (`empleados_ID`, `empleados_EMPRESAS_ID`, `empleados_datos_laborales_ID`, `VEHICULOS_ID`),
  INDEX `fk_empleados_has_VEHICULOS_VEHICULOS1_idx` (`VEHICULOS_ID` ASC) VISIBLE,
  INDEX `fk_empleados_has_VEHICULOS_empleados1_idx` (`empleados_ID` ASC, `empleados_EMPRESAS_ID` ASC, `empleados_datos_laborales_ID` ASC) VISIBLE,
  CONSTRAINT `fk_empleados_has_VEHICULOS_empleados1`
    FOREIGN KEY (`empleados_ID` , `empleados_EMPRESAS_ID` , `empleados_datos_laborales_ID`)
    REFERENCES `CURSO`.`empleados` (`ID` , `EMPRESAS_ID` , `datos_laborales_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleados_has_VEHICULOS_VEHICULOS1`
    FOREIGN KEY (`VEHICULOS_ID`)
    REFERENCES `CURSO`.`VEHICULOS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
