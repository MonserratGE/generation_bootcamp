-- LEER
-- muestra las bases de datos que nosotros tenemos 
SHOW DATABASES;

-- seleccionar la base de datos a usar
USE sakila;

-- leer todos los datos de una tabla
SELECT * FROM actor;

-- leer partes de una tabla 
SELECT nombre, edad FROM alumno;

-- limitar la cantidad de datos
SELECT * FROM actor LIMIT 10;

-- Ordenar los datos dependiendo de una columna
SELECT * FROM city ORDER BY country_id ASC;

-- Ordenar los datos dependiendo de una columna de una forma descendiente
SELECT * FROM city ORDER BY country_id DESC LIMIT 10;

/*
Operadores de comparación

	Igual   =
	Distinto !=
    Mayor >
    Menor <
    Mayor o igual >=
    Menor o igual <=
    Como LIKE
*/

SELECT * FROM city WHERE city = "Cuman";
SELECT * FROM actor WHERE first_name = "Penelope";

SELECT * FROM actor WHERE first_name != 'Penelope';

SELECT * FROM actor WHERE actor_id > 50;
SELECT * FROM actor WHERE actor_id < 100;
SELECT * FROM actor WHERE actor_id >= 50;
SELECT * FROM actor WHERE actor_id <= 100;

SELECT * FROM actor WHERE first_name LIKE 'Penlope';

-- se utiliza para realizar busquedas
-- selecciona de la tabla todas las personas que terminen su firtname con ope
SELECT * FROM actor WHERE first_name LIKE '%an';

-- Seleccionar de la tabla todas las personas cuyo first_name empiece con "an"
SELECT * FROM actor WHERE first_name LIKE 'an%';

-- Seleccionar de la tabla todas las personas cuyo first_name contengan "n"
SELECT * FROM actor WHERE first_name LIKE "%nn%";

-- Seleccionar un patrón
SELECT * FROM actor WHERE first_name LIKE "%a__e%";

-- NOT LIKE
SELECT * FROM actor WHERE first_name LIKE "%a__e%";

-- Uniendo todo 
SELECT * FROM actor WHERE first_name LIKE "%nn%" ORDER BY last_name ASC LIMIT 5;

/* 
	Operadores lógicos
    AND debe cumplir ambas condiciones
    OR basta con que cumpla una de ellas 
*/

SELECT * FROM actor WHERE actor_id >50 AND first_name LIKE '%n%';
SELECT * FROM actor WHERE first_name LIKE '%n%' OR first_name LIKE '%M%';
