package UmlJava;

public class Duende extends Personaje implements Villano{
    @Override
    public void desplazarce() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public void Atacar() {

    }

    @Override
    public void Destruir() {

    }
    public String color = "Verde";

    public Duende (String nombre, String descripcion , long tamanio, int vida, int poder) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.color = color;
    }
}