package Parcial;

abstract public class Felino extends Mamifero{

    protected float tamañoGarras;
    protected int velocidad;

    public Felino(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }
}
