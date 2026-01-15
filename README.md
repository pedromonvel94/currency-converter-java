## Ejecutar el proyecto con Maven Wrapper

Este proyecto incluye **Maven Wrapper**, así que no necesitas tener Maven instalado en tu máquina.

Puedes compilar, ejecutar y generar el paquete usando estos comandos desde la raíz del proyecto:

```bash
./mvnw clean compile
./mvnw exec:java
./mvnw clean package