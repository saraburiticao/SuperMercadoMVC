DROP DATABASE IF EXISTS supermercado_db;
CREATE DATABASE supermercado_db;
USE supermercado_db;
CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL
);
INSERT INTO empleados (nombre, cargo) VALUES ('Camilo Cordoba', 'Gerente');
INSERT INTO empleados (nombre, cargo) VALUES ('Carlos Díaz', 'Cajero');
INSERT INTO empleados (nombre, cargo) VALUES ('Sara Buriticá', 'Administrador');
INSERT INTO empleados (nombre, cargo) VALUES ('Ana Suarez', 'Cajero');
INSERT INTO empleados (nombre, cargo) VALUES ('Juan Rincon', 'Almacenista');
INSERT INTO empleados (nombre, cargo) VALUES ('Laura Rivas', 'Responsable de sección');
INSERT INTO empleados (nombre, cargo) VALUES ('Ricardo Fonseca', 'Seguridad privada');
INSERT INTO empleados (nombre, cargo) VALUES ('Carolina Molina', 'Asistente de Gerente');
INSERT INTO empleados (nombre, cargo) VALUES ('Astrid Pineda', 'Atención al Cliente');
INSERT INTO empleados (nombre, cargo) VALUES ('Estefanía Olaya', 'Auxiliar de Limpieza');
INSERT INTO empleados (nombre, cargo) VALUES ('Daniela Ramírez', 'Auxiliar de Limpieza');
INSERT INTO empleados (nombre, cargo) VALUES ('Vanessa Alfonso', 'Especialista en Compras');
INSERT INTO empleados (nombre, cargo) VALUES ('María González', 'Vendedor');
INSERT INTO empleados (nombre, cargo) VALUES ('Ernesto Jaramillo', 'Contador');
INSERT INTO empleados (nombre, cargo) VALUES ('Jaime Restrepo', 'Marketing y Promociones');
INSERT INTO empleados (nombre, cargo) VALUES ('Carlos Oquendo', 'Cajero');

SELECT * FROM empleados;

