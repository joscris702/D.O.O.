package UmlJava;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamanio;
    private int vida;
    private int poder;

    public Personaje( String nombre, String descripcion, long tamanio, int vida, int poder)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.vida = vida;
        this.poder = poder;
    }
    public abstract void desplazarce();

    public abstract int mostrarVida();

    public abstract void mostrarPoder();

    public String getNombre(){
        return nombre;
    }
}