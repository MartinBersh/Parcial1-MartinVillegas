package Parcial;

public class Guepardo extends Felino{

    public Guepardo(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El " + nombreCientifico + " utilza sus garras de " + tamañoGarras + "cm para cazar su comida";
    }

    @Override
    public String dormir() {
        return "El " + nombreCientifico + " duerme en su habitad " + habitad + " sin importar su largo de " + largo + " y su altura de " + altura;
    }

    @Override
    public String correr() {
        return "El " + nombreCientifico + " corre a una velocidad de " + velocidad + " sin importar su peso de " + peso;
    }

    @Override
    public String comunicarse() {
        return "El " + nombreCientifico + " se comunica con su especie en su habitad natural: " + habitad;
    }
}
