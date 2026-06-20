# 🎬 API REST Películas - Spring Boot (PostgreSQL + SQLite + Render)

## 👨‍🎓 Información Académica
- **Universidad:** Universidad Autónoma Tomás Frías
- **Carrera:** Ingeniería de Sistemas
- **Materia:** Tecnologías Emergentes SIS-414
- **Estudiante:** Cristian David Paco Bravo
- **RU:** 107514
---

## 🚀 Descripción del Proyecto

Este proyecto consiste en el desarrollo de una **API REST CRUD de películas** utilizando Spring Boot, demostrando el uso de diferentes bases de datos (PostgreSQL y SQLite) y el despliegue en la nube con Render.
 
---

## 🧩 Entidad Principal

### 🎬 Pelicula

Atributos:

- `id`
- `titulo`
- `director`
- `anioLanzamiento`
- `genero`
- `sinopsis`
---

## 🟢 PRÁCTICA 5 - API REST CON POSTGRESQL

### Objetivo
Desarrollar una API REST con CRUD completo conectada a PostgreSQL.

### Tecnologías
- Spring Boot 3
- Java 21
- PostgreSQL
- Spring Data JPA
- Swagger
### Funcionalidades
- Crear película
- Listar películas
- Buscar por ID
- Actualizar
- Eliminar
### Swagger UI
```
/swagger-ui/index.html
```
 
---

## 🟡 PRÁCTICA 6 - CAMBIO A SQLITE

### Objetivo
Demostrar la capacidad de Spring Boot para cambiar de motor de base de datos sin modificar la lógica del sistema.

### Cambios realizados

Se reemplazó PostgreSQL por SQLite.

**Dependencias añadidas:**
- `sqlite-jdbc`
- `hibernate-community-dialects`
  **Configuración (`application.properties`):**

```properties
spring.datasource.url=jdbc:sqlite:peliculas.db
spring.datasource.driver-class-name=org.sqlite.JDBC
 
spring.jpa.database-platform=org.hibernate.community.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Resultado
El mismo CRUD funciona con base de datos local en archivo `.db`.
 
---

## 🔵 PRÁCTICA 7 - DESPLIEGUE EN RENDER

### Objetivo
Desplegar la API en la nube utilizando Render y PostgreSQL externo.

### Tecnologías usadas
- Docker
- Render
- PostgreSQL en la nube
- Variables de entorno
### 🌐 Base de datos en Render

Variables de entorno:

```
DB_URL=jdbc:postgresql://<host-render>
DB_USERNAME=<usuario_render>
DB_PASSWORD=<password_render>
```

### 🐳 Dockerfile

```dockerfile
FROM gradle:8.14-jdk21 AS build
 
WORKDIR /app
 
COPY . .
 
RUN gradle clean bootJar -x test
 
 
FROM eclipse-temurin:21-jre-alpine
 
WORKDIR /app
 
COPY --from=build /app/build/libs/*.jar app.jar
 
EXPOSE 8080
 
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### 🌍 URL del servicio desplegado

```
https://peliculas-api-nf6e.onrender.com/swagger-ui/index.html
```
 
---

## 📡 Endpoints de la API

| Método | Endpoint                | Descripción                  |
|--------|--------------------------|-------------------------------|
| GET    | `/api/peliculas`         | Listar todas las películas    |
| GET    | `/api/peliculas/{id}`    | Buscar película por ID        |
| POST   | `/api/peliculas`         | Crear nueva película          |
| PUT    | `/api/peliculas/{id}`    | Actualizar película existente |
| DELETE | `/api/peliculas/{id}`    | Eliminar película             |
 
---

## 🧠 Conclusión

Este proyecto demuestra:

- ✔ Desarrollo de API REST con Spring Boot
- ✔ Uso de PostgreSQL y SQLite
- ✔ Uso de JPA/Hibernate
- ✔ Uso de variables de entorno
- ✔ Uso de Docker
- ✔ Despliegue en la nube con Render
- ✔ Arquitectura profesional backend
---

## 👨‍💻 Autor

Proyecto académico desarrollado para la materia SIS-414.

