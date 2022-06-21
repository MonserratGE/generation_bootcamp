USE sakila;
SELECT * FROM payment;

-- COUNT() contar los elementos o las celdas de una columna
-- AS nos permite darle un alias onobre temporal a la columna
SELECT COUNT(*) AS cantidad_filas FROM payment;

SELECT COUNT(*) AS cantidad_filas FROM payment WHERE staff_id = 2;

SELECT COUNT(distinct customer_id) FROM payment ;

-- contar fila de la tabla word.country
SELECT COUNT(*) FROM word.country;

-- SUM() realiza la suma de los valores de una columna
SELECT sum(amount) as total from payment where staff_id = 2;

-- ¿Cual es el cliente que gasto más en rentas?
SELECT count(*) from payment group by customer_id;  

SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id;
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id order by total desc;
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY amount;

-- GROUP BY agrupa filas que contengan el mismo valor 
-- Normalmente se usa en conjunto con COUNT(), AVG(), SUM()
SELECT customer_id, amount FROM payment GROUP BY customer_id;

-- AVG() nos permite obtener un promedio de cantidades en una columna
SELECT avg(amount) as Promedio FROM payment where customer_id = 248;