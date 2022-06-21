-- Crear

-- crear base de datos
CREATE DATABASE familia;
-- CREATE SCHEMA familia;

-- seleccionar la bd
USE familia;

-- crear tabla de persona, es necesaio poner minímo una columna
-- no es necesario poner NOT NULL en llave primaria
-- por defecto el valor asignado es NULL
-- debemos especificar cual es la llave primaria
-- para agregar valores únicos se utiliza UNIQUE
CREATE TABLE persona(
	persona_id int AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    estado VARCHAR(255) DEFAULT "Desconocido",
    cumpleanios DATE,
    -- DEFAULT NULL
    PRIMARY KEY(persona_id),
    CONSTRAINT email_unico UNIQUE (correo)
);

-- insertar datos en una tabla
-- tienen que ser en el orden indicado
-- el id no se pone porque es un dato auto incrementable
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values
('Monserrat', 'monse@gmail.com', 18, 'Sobreviviendo', '2003-09-07'),
('Amanda', 'mandy@gmail.com', 19, 'Feliz', '2003-09-07');

-- Error 1062: dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values
('Pepe', 'mandy@gmail.com', 23, 'Enojado', '1980-12-09');

-- Error1364: no llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanios) values
('pepe@gmail.com', 23, 'Enojado', '1980-12-09');

-- ingresar datos que no son necesario (no tiene culpleanios)
INSERT INTO persona(nombre, correo, edad, estado) values
('Pepe','pepe@gamil.com',23 ,'Enojado');

-- ingresar dato con valor pordefecto (no tiene el estado)
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Toño', 'toño@gmail.com', 32,'1998-05-19');

CREATE TABLE mascota (
	mascota_id int AUTO_INCREMENT, 
    nombre VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    fk1_persona int NOT NULL,
    PRIMARY KEY (mascota_id),
    FOREIGN KEY (fk1_persona) REFERENCES persona(persona_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

SELECT * FROM mascota;

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Leo', 3, 1);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Tobi', 9, 2);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Beni', 12, 1),
('Patitas', 3, 5);