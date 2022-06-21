use tienda;

-- JOINS nos permite combinar datos de distintas tablas

-- Inner Join
select
categoria.nombre as categoria,
producto.nombre as producto
from producto
inner join categoria on categoria.idCategoria = producto.idCategoria;

select 
p.idProducto as clave,
p.nombre as producto,
p.idCategoria,
c.nombre 
from producto p
inner join categoria c 
on p.idCategoria = c.idCategoria
order by clave;

-- Mostrar direcciones de cada país
/*
address - address / countr
city - city_id / city/ country_id
coountry - country / country_id
*/

select 
country.country_id as clave_Pais,
country.country as Pais,
city.city_id as clave_Ciudad,
city.city as Ciudad,
address.address as Direccion
from country
inner join city on city.country_id = country.country_id
inner join address on address.city_id = city.city_id;

-- LEFT JOIN
select 
cliente.nombre as nombre,
factura.idFactura
from cliente
left join factura on cliente.idCliente = factura.idCliente
order by nombre;

-- Right join
select 
cliente.nombre as nombre,
factura.idFactura
from cliente
right join factura on cliente.idCliente = factura.idCliente
order by nombre;