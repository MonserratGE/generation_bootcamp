CREATE DATABASE generation_bootcamp;

USE generation_bootcamp;

-- CREATE TABLE cohorte12 (cohorte12_id int NOT NULL auto_increment, alumnos_id int NOT NULL, PRIMARY KEY (cohorte12_id));

-- Este es un comentario de una linea

/*
Comentario
de más de una linea
*/

/*INSERT INTO `generation_bootcamp`.`cohorte12` (`alumnos_id`) VALUES ('123');
INSERT INTO generation_bootcamp.cohorte12 (alumnos_id) VALUES ('40');

ALTER TABLE `generation_bootcamp`.`cohorte12` 
ADD COLUMN `instructor_id` INT NOT NULL AFTER `alumnos_id`,
ADD COLUMN `numero_alumnos` INT NOT NULL AFTER `instructor_id`,
ADD COLUMN `horario` CHAR(10) NOT NULL AFTER `numero_alumnos`,
ADD COLUMN `tipo_sesiones` VARCHAR(255) NOT NULL AFTER `horario`,
ADD COLUMN `ciudad` VARCHAR(255) NOT NULL AFTER `tipo_sesiones`;*/

/*CREATE TABLE `cohorte12` (
  `cohorte12_id` int NOT NULL AUTO_INCREMENT,
  `alumnos_id` int NOT NULL,
  `instructor_id` int NOT NULL,
  `numero_alumnos` int NOT NULL,
  `horario` char(10) NOT NULL,
  `tipo_sesiones` varchar(255) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  PRIMARY KEY (`cohorte12_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci*/

CREATE TABLE `alumno` (
  `alumno_id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `edad` varchar(45) NOT NULL,
  `RFC` char(13) DEFAULT NULL,
  `nivel_ingles` varchar(255) NOT NULL,
  `amonestaciones` int NOT NULL,
  PRIMARY KEY (`alumno_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabla alumno creada'