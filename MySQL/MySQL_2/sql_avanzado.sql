USE word;
SELECT * FROM country;

SELECT `Name`, Population FROM country ORDER BY Population DESC;

SELECT * FROM country WHERE `Name` = 'Mexico';

SELECT population FROM country WHERE `Name` = 'Mexico';

SELECT * FROM country WHERE Population > 50000000 AND Population < 70000000 ORDER BY Population DESC;

-- Between regresa datos dentro de un rango que nosotros especifiquemos
SELECT * FROM country WHERE Population NOT BETWEEN 50000000 AND 70000000 ORDER BY Population;

SELECT * FROM country WHERE continent = 'Asia' OR continent = 'North America' OR continent = 'Oceania' ORDER BY Continent;

-- IN nos permite especificar condiciones
SELECT * FROM country WHERE Continent IN ('Asia', 'North America', 'Oceania') ORDER BY continent;

SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;

-- Like buscar un patrón especifico
SELECT * FROM country WHERE `Name` LIKE '%and';
SELECT * FROM country WHERE `Name` like '%e__a';

-- DICTINCT seleccionar los elementos distintos dentro de una lista de valores repetidos
SELECT Continent FROM country;
SELECT DISTINCT Continent FROM country;



