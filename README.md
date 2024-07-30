# SupermercadoMVC
 Actividad Semana 3

 Desarrollo con MVC

 Por: 
* Sara C. Buriticá Olaya  
* Camilo S. Cordoba Russi
* Carlos R.  Díaz Quintero

Guía de usuario SupermercadoMVC

Esta aplicación ha sido diseñada para consultar los empleados de un supermercado según su cargo. 
En esta guía, encontrarás instrucciones detalladas para comenzar a utilizar la aplicación, incluyendo cómo navegar por sus principales funciones y características.


Estructura del Proyecto

Paso 1. // Conexión a la base de datos
Debe agregar a la librería de Intellij IDEA el archivo JAR que maneje en el equipo donde se esté visualizando el proyecto.
Es decir, se debe actualizar esta ruta:
<root url="jar://$USER_HOME$/Documents/DOCS personales/personal/Laboral MI PC/Especialización/mysql/mysql-connector-j-9.0.0/mysql-connector-j-9.0.0.jar!/" />
para esta versión se utilizó mysql-connector-j-9.0.0.jar

Paso 2. //Correr la Base de Datos en mysql
La base de datos creada en mysql es supermercado_db, con una tabla llamada empleados que contiene la siguiente información:

* id: Identificador único del empleado.
* nombre: Nombre del empleado.
* cargo: Cargo del empleado 

* los cargos que se pueden buscar son los siguientes: 
- Gerente
- Cajero
- Administrador
- Almacenista
- Responsable de sección
- Seguridad privada
- Asistente de Gerente
- Atención al Cliente
- Auxiliar de Limpieza
- Especialista en Compras
- Vendedor
- Contador
- Marketing y Promociones


Paso 3. //Manejo del aplicativo
Funcionalidades
* Campo de Entrada "Consultar Cargo": El usuario puede escribir el cargo en el campo de texto.
* Botón "Buscar": Al hacer clic en el botón "Buscar", se ejecutará la acción para buscar empleados según el cargo ingresado.
* Botón "cargar todos" : Todos los datos almacenados en la DB se mostrarán en el área de texto. 
* Botón "Limpiar Búsqueda":  Utilizado para resetear la interfaz y permitir al usuario comenzar una nueva búsqueda sin tener que cerrar y volver a abrir la aplicación.
* Cierre de Ventana: La aplicación se cierra al hacer clic en la X de la ventana
* Cuando se realiza una búsqueda, el contenido del resultArea se ve así: ID, Nombre y Cargo. 
* Otros Botones de Ventana:  botones de minimizar y maximizar.

