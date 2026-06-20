# 🎬 PRÁCTICA 6 – Spring Boot con Bases de Datos (PostgreSQL vs SQLite)

## 📌 Proyecto: Películas API REST

## 👨‍💻 Autor

Proyecto académico – Spring Boot CRUD API

**Estudiante:** Cristian David Paco Bravo  
**RU:** 107514

---

API REST desarrollada con **Spring Boot** que demuestra el uso de dos motores de base de datos diferentes:

- 🐘 PostgreSQL (entorno de producción)
- 📦 SQLite (base de datos embebida para desarrollo local)

El objetivo es evidenciar cómo Spring Boot permite cambiar de motor de base de datos sin modificar el código del CRUD.

---

## 🚀 Tecnologías utilizadas

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL
- SQLite
- Gradle
- Swagger (SpringDoc OpenAPI)
- IntelliJ IDEA

---

## 🎯 Objetivo de la práctica 6

Demostrar que el mismo sistema CRUD puede funcionar con:

- PostgreSQL (rama `main`)
- SQLite (rama `rama-sqlite`)

sin modificar la lógica del sistema, únicamente la configuración.

---

## 📌 Funcionalidades del sistema

- Crear película
- Listar películas
- Buscar película por ID
- Actualizar película
- Eliminar película

---

## 📡 Endpoints REST

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | /api/peliculas | Obtener todas las películas |
| GET | /api/peliculas/{id} | Obtener película por ID |
| POST | /api/peliculas | Crear película |
| PUT | /api/peliculas/{id} | Actualizar película |
| DELETE | /api/peliculas/{id} | Eliminar película |

---

## 📖 Swagger UI

Documentación interactiva:

http://localhost:8080/swagger-ui/index.html

---

## 🗄️ Bases de datos utilizadas

### 🐘 PostgreSQL (rama main)
- Base de datos: `peliculasdb`
- Uso en entorno cliente-servidor

### 📦 SQLite (rama rama-sqlite)
- Archivo local: `peliculas.db`
- Base de datos embebida (sin servidor)
- Generada automáticamente por Spring Boot

---

## 🧪 Evidencia de funcionamiento

En esta práctica se evidencia:

- Inserción de datos mediante Swagger (POST)
- Consulta de datos (GET)
- Eliminación de datos (DELETE)
- Archivo SQLite generado automáticamente (`peliculas.db`)
- Visualización de datos en DB Browser for SQLite

---

## 🔥 Nota importante

Esta práctica demuestra la portabilidad de Spring Boot entre motores de base de datos, sin modificar la lógica del sistema, únicamente la configuración del datasource.