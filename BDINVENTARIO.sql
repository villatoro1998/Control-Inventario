
CREATE DATABASE `inventario` 
USE `inventario` ;

CREATE TABLE IF NOT EXISTS `inventario`.`producto` (
  `idProducto` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreP` VARCHAR(45) NOT NULL,
  `proveedor` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `existencias` INT(11) NOT NULL,
  `precio` DOUBLE(4,2) NOT NULL,
  PRIMARY KEY (`idProducto`)):


CREATE TABLE IF NOT EXISTS `inventario`.`hproducto` (
  `idhProducto` INT(11) NOT NULL AUTO_INCREMENT,
  `idProducto` INT(11) NOT NULL,
  `cantidad` INT(11) NOT NULL,
  `fecha` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idhProducto`),
  INDEX `fk_idProducto` (`idProducto` ASC) VISIBLE,
  CONSTRAINT `fk_idProducto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `inventario`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

