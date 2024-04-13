Reto Técnico Practicante Desarrollador FullStack (back-end java +springboot)

# Backend Futbolistas

Este proyecto es una API de futbolistas desarrollada con Java 17 y Spring Boot. Utiliza MySQL como base de datos para almacenar la información de los jugadores.

## Requisitos previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- Java 17: Descárgalo e instálalo desde [java.com](https://www.java.com/).
- MySQL: Instala MySQL en tu sistema y asegúrate de tener acceso a una base de datos donde se almacenarán los datos de los futbolistas.

## Configuración inicial

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu-usuario/backend-futbolistas.git

   spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
    spring.datasource.username=usuario_mysql
    spring.datasource.password=contraseña_mysql
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
   ```

La aplicación estará disponible en http://localhost:8080/futbol-api/

Uso de la API
Endpoints disponibles
GET futbol-api/futbolistas: Obtiene todos los futbolistas almacenados en la base de datos.
GET futbol-api/futbolistas/{id}: Obtiene los detalles de un futbolista específico según su ID.



