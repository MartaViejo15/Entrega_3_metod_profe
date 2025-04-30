package ejercicio5;

 /*
    En clase hemos visto cómo serializar objetos convirtiéndolos en JSON,
    que es un formato de texto fácil de entender y compartir entre distintos
    lenguajes. Sin embargo, en la documentación oficial de Java hablan de otro
    tipo de serialización, "Java Object Serialization", que convierte los
    objetos en un flujo de bytes binario. Esta forma es automática (si la clase
    implementa Serializable) y guarda toda la información interna del objeto,
    pero no es legible para las personas ni tan fácil de usar fuera de Java.
    a diferencia de JSON, que transforma los datos a texto, la serialización
    de Java guarda todo tal cual está en memoria, incluyendo relaciones entre
    objetos, y además maneja versiones con serialVersionUID para evitar errores
    si las clases cambian.
    */
