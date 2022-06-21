use sakila;

-- Ejercicio 1
select title, language_id from film;

-- Ejercicio 2 

CREATE TABLE recibo_pago(
id_recibo int NOT NULL,
texto text,
cliente int NOT NULL,
created_at DATETIME,
PRIMARY KEY (`id_recibo`)
 );


