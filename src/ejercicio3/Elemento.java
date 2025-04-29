package ejercicio3;

public class Elemento<T> {
    //atributo
    protected String id;
    protected T dato;

    //constructor
    protected Elemento(String id, T dato) {
        this.id = id;
        this.dato = dato;
    }
}
