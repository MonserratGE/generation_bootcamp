-- Borrar

SELECT * FROM mascotita;

-- Borrar una fila
DELETE FROM mascotita WHERE mascota_id = 8;

-- Borrar una columna
ALTER TABLE mascotita DROP COLUMN cumpleanios;
ALTER TABLE mascotita DROP COLUMN especie;

-- Borrar una tabla
DROP TABLE persona;

-- Borrar la base de datos
DROP DATABASE familia;