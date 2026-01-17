![logo](https://raw.githubusercontent.com/pedromonvel94/currency-converter-java/main/assets/logo.png "Logo RateLab")

# Conversor de Divisas en Java
Proyecto creado para practicar la division de responsabilidades en diferentes clases, ademas de consumir la API REST de *"Exchange Rate API"*

Durante el desarrollo se uso una API KEY local (no incluida en el repo) para facilidad del ejercicio, sin embargo fue eliminada para evitar fallas de seguridad, si deseas que funcione el proyecto, al momento de clonarlo debes colocar tu propia API KEY la cual consigues directamente en:

https://www.exchangerate-api.com/

una vez la hayas obtenido, debes ir al archivo crear un archivo .env, que debe tener la misma estructura del archiv .env.example que te deje como ejemplo:

EXCHANGE_RATE_API_KEY=your_api_key

Se penso en el uso de un archiv .env donde se pudiera almacenar este tipo de claves privadas sin tener el peligro de subirlas a un repositorio, por ende ya en el archivo AppConfig se dejo toda la logica para el uso de la ApiKey

## Requisitos
- Java: 17 o superior
- Sistema: macOS/Windows/Linux

## Instalación y configuración
- Clona el repo con git clone https://github.com/pedromonvel94/currency-converter-java.git
- Crea .env basado en .env.example (Debe quedar en la raiz de tu proyecto)
- Ejecuta...

## Ejecutar el proyecto con Maven Wrapper

Este proyecto incluye **Maven Wrapper**, así que no necesitas tener Maven instalado en tu máquina.

Puedes compilar, ejecutar y generar el paquete usando estos comandos desde la raíz del proyecto:


```bash
./mvnw clean compile
./mvnw exec:java
./mvnw clean package
```

## Estructura del proyecto

1. **RateLab:** Es el controlador principal, basicamente es donde se coloco todo el flujo del proyecto

2. **ConsolePrompts:** Son metodos con las interacciones principales que tendra el usuario por consola

3. **PathBuilder:** Es la clase que sirve para construit el URI de la api, con los endpoints necesarios pars obtener la conversion

4. **ApiClient:** Se encarga de hacer toda la petición HTTP y de obtener la respuesta en formato Json

5. **JsonBuilder:** Como su nombre lo dice, hace el parse del Json, en otras palabras convierte el Json a la clase currency

6. **AppConfig:** carga el archivo .env si esta presente, y ademas tiene un metodo que evita que si no encuentra una key, me mande una exception
