📚 Universidad – Sistema de Gestión Académica

Este proyecto implementa un sistema para gestionar cursos y alumnos usando listas enlazadas simples en Java, cumpliendo la restricción de no usar colecciones de alto nivel para manejar estudiantes.

🔹 Estructura del proyecto
universidad-sistemas/
 ├─ SRC/
 │   ├─ Student.java
 │   ├─ Course.java
 │   ├─ CourseManager.java
 │   └─ Main.java
 ├─ README.md


Student.java → representa un alumno (nodo de la lista enlazada).

Course.java → representa un curso, con su lista enlazada de alumnos.

CourseManager.java → gestiona los cursos (crear, listar, eliminar).

Main.java → contiene el flujo de prueba del sistema.

🔹 Funcionalidades

✔️ Crear, consultar, actualizar y eliminar cursos.
✔️ Inscribir alumnos en una lista enlazada simple.
✔️ Evitar duplicados de alumnos por idNumber.
✔️ Actualizar los datos de un alumno existente.
✔️ Eliminar alumnos (inicio, intermedio o final de la lista).
✔️ Listar alumnos de un curso.
✔️ Eliminar un curso liberando su lista de alumnos.

🔹 Requisitos

Java 8 o superior instalado en el sistema.

Git para clonar el repositorio (opcional, puedes descargar ZIP).

🔹 Cómo compilar y ejecutar

Clonar el repositorio:

git clone https://github.com/johnpromas/universidad-sistemas.git
cd universidad-sistemas


Compilar el código:

javac -d bin SRC/*.java


👉 Esto genera los .class dentro de la carpeta bin/.

Ejecutar el programa:

java -cp bin Main

🔹 Ejemplo de salida
Alumnos en Estructuras de Datos:
0999 - Carlos Zapata (Industrial, Sem 1)
1001 - Ana García (Sistemas, Sem 3)
1002 - Luis Martínez (Sistemas, Sem 2)
Error: Alumno con idNumber 1002 ya existe.
Alumno con idNumber 1002 actualizado correctamente.

Después de actualizar y eliminar:
1001 - Ana García (Sistemas, Sem 3)
1002 - Luis Martínez (Telecomunicaciones, Sem 3)
Curso eliminado correctamente.

Después de eliminar el curso:
No hay alumnos inscritos en Estructuras de Datos

🔹 Autor

📌 Proyecto académico desarrollado por Jhon Alexander Ante Argote ID:408653 – Universidad Unicatolica.
