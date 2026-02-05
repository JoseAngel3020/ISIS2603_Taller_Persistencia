# Taller Persistencia
 1. Diseño de relaciones: 
  - La llave foranea Id queda en tarea por lo que esta clase es la dueña de la relacion, entonces necesita la llave para poder referenciar el protecto. 
 2. Integridad de Datos:
  - ProjectEntity se configuro con cascadetype y orphanRemoval, lo cual se asegura que en caso de que se elimine un proyecto, tambien se elimina todas las tareas relacionadas con el proyecto. Esto tiene que ocurrir por lo que una tarea sin un proyecto relacionado no tiene sentido logico, por lo que las tareas componen el proyecto. Por el otro lado, cuando se elimina una tarea no se debe eliminar el proyecto por lo que la combinacion de todas las tareas componen el proyecto y no una en particular. 
 3. Consultas:
  - Para la consulta use findByEstado, la cual consulta el JPQL equivalentey lo ejecuta. Esto retorna una lista de entidades filtradas por el parametro "estado". 
## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
