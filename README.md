# spring-convertir-numeros-arabicos

Aplicación para convertir números arábigos a romanos. Con un rango entre 0 y 3999.

## Compilar el proyecto localmente y ejecutar con Docker.

gradle build dentro de la carpeta principal.

docker-compose up

## Ejecutar el proyecto con una imagen Docker almacenada en Docker Hub
  cd ExecuteWithpublicImage
  
  docker-compose up 
  
### Rutas (Content-Type: application/json)
  **http://localhost:8080/getNumber (Post):** Enviar el número arábigo. Se obtiene el número romano como respuesta
  
  **http://localhost:8080/transformedNumbers (Get):** A medida que se hacen peticiones a la ruta /getNumber, las respuestas se almacenan, y se consultan en esta ruta.
  
  **http://localhost:8080/getRequestsNumber (Get):** Suma el número de peticiones que se han realizado a /getNumber y devuelve el resultado
