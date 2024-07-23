package UmlJava;

public class Elfo extends Personaje implements Heroe{

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }

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
    public double velocidad;

    public Elfo (String nombre, String descripcion , long tamanio, int vida, int poder) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.velocidad = velocidad;
    }
}