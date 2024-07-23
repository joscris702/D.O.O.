package UmlJava;

public class Humano extends Personaje implements Heroe {

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

    public int edad;
    public Humano (String nombre, String descripcion , long tamanio, int vida, int poder) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.edad = edad;
    }
}