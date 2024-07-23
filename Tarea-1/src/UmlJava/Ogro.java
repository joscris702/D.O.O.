package UmlJava;

public class Ogro extends Personaje implements Villano{

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
    public double peso;

    public Ogro (String nombre, String descripcion , long tamanio, int vida, int poder) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.peso = peso;
    }
}