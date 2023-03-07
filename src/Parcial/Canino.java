package Parcial;

abstract public class Canino extends Mamifero{

    protected String color;
    protected float tamañoColmillos;

    public Canino(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }
}
