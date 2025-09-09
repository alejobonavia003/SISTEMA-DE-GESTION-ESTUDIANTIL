# SISTEMA-DE-GESTION-ESTUDIANTIL
EJERCICIO TRANSVERSAL INTEGRADOR

## Flujo de trabajo

Para organizarnos y evitar conflictos, vamos a usar **ramas (branches)** y **pull requests (PRs)**.  
La idea es que **cada nueva funcionalidad o corrección se haga en una rama distinta** y luego se una a `main` solo cuando esté lista.

--- 

### 🔹 1. Actualizar el proyecto a el ultimo avanze 

git checkout main
git pull origin main

### 🔹 2. Crear una nueva rama de trabajo 

git checkout -b nombre-rama

### HACER LOS CAMBIOS

### 🔹 3. Guardar los cambios (esto es lo de siempre)

git add .
git commit -m "Descripción de los cambios"

### 🔹 4. Subir la rama al repositorio

git push origin nombre-rama

### APRARECE UN PULL REQUEST(github) Y LO TENEMOS QUE ACEPTAR TODOS

### 🔹 5. Fucionar con la rama main

git checkout main
git pull origin main


