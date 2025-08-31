Proyecto: Programa en Java con Entrada y Salida en Consola

Este proyecto corresponde a la Semana 3 de la asignatura, cuyo objetivo es relacionar la máquina virtual de Java (JVM) con la ejecución de software, comprendiendo el proceso de compilación sin utilizar un IDE.

El programa está desarrollado en Java 8, compilado mediante el comando javac y ejecutado en la Java Virtual Machine (JVM).
El código solicita al usuario sus datos personales (nombre y edad) y posteriormente los datos de un vehículo (marca, modelo, cilindrada, combustible y capacidad de pasajeros), mostrando el resultado por consola.

⚙️ Requisitos de instalación

Tener instalado JDK 8.

Configurar variables de entorno:

JAVA_HOME apuntando al directorio del JDK.

Path con la ruta %JAVA_HOME%\bin.

Verificar instalación con:

java -version
javac -version

▶️ Instrucciones de uso

Guardar el archivo como Main.java.

Compilar en consola:

javac Main.java


Ejecutar en consola:

java Main


Ingresar los datos solicitados (nombre, edad y datos del vehículo).

Visualizar en consola los resultados.

✅ Requisitos Funcionales

RF1: El sistema debe solicitar y mostrar el nombre y edad del usuario.

RF2: El sistema debe solicitar y mostrar los datos de un vehículo: marca, modelo, cilindrada, combustible y capacidad.

RF3: El programa debe ejecutarse en la consola de comandos, sin depender de un IDE.

🚫 Requisitos No Funcionales

RNF1: El programa debe ser compatible con la JVM (Java Virtual Machine).

RNF2: El código debe estar comentado de forma breve, clara y concisa.

RNF3: La compilación debe realizarse a través de línea de comandos (javac).

RNF4: El programa debe ser liviano y no requerir dependencias adicionales.

👤 Historias de Usuario

HU1:
Como estudiante, quiero ingresar mi nombre y edad en consola, para validar la entrada y salida básica de datos.

Criterio de aceptación: Al ejecutar, el sistema solicita los datos y los muestra de forma correcta.

HU2:
Como usuario de la aplicación, quiero ingresar los datos de un vehículo, para obtener un resumen de sus características.

Criterio de aceptación: El sistema solicita todos los campos y los imprime en el formato requerido.

📅 Cronograma inicial
Etapa	Actividad	Responsable	Estado
1	Instalación de JDK y configuración de variables de entorno	Estudiante	✅
2	Creación de código fuente (Main.java) con comentarios	Estudiante	✅
3	Compilación y ejecución por consola	Estudiante	✅
4	Documentación línea por línea (CODE_COMMENTS.md)	Estudiante	⏳
5	Subida del código y documentación a GitHub	Estudiante	⏳
6	Elaboración del informe final (máx. 8 páginas)	Estudiante	⏳

(El cronograma puede mantenerse actualizado en la pestaña Projects del repositorio GitHub.)

📸 Evidencias mínimas sugeridas

java -version y javac -version funcionando.

Compilación correcta (javac Main.java).

Ejecución correcta (java Main).

Vista previa del README en GitHub.

Board de Projects con tareas.

📚 Bibliografía

Oracle. (s. f.). Java SE Development Kit 8 Downloads. Oracle. Recuperado de: https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html

Miles, J. (2021). Taller de Aplicaciones Móviles – Semana 3. AIEP.
