package Parcial;

public class Tigre extends Felino{


    private String especieTigre;

    public Tigre(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El " + nombreCientifico +" de la especie " + especieTigre + " utilza sus garras de " + tamañoGarras + "cm para cazar su comida";
    }

    @Override
    public String dormir() {
        return "El " + nombreCientifico + " duerme en su habitad " + habitad + " sin importar su largo de " + largo + " y su altura de " + altura ;
    }

    @Override
    public String correr() {
        return "El " + nombreCientifico + " corre a una velocidad de " + velocidad + " sin importar su peso de " + peso;
    }

    @Override
    public String comunicarse() {
        return "El " + nombreCientifico + " se comunica con su especie en su habitad naturla: " + habitad;
    }
}
