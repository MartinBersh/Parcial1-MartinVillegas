package Parcial;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos, int numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El " + nombreCientifico + " de color " + color + " caza en camadas de " +numCamada+ " especies medianas y grandes utilizando sus colmillos de" + tamañoColmillos +"cm";
    }

    @Override
    public String dormir() {
        return "El " + nombreCientifico + " de color " + color + "  duermen en "+ habitad ;
    }

    @Override
    public String correr() {
        return "El " + nombreCientifico + " de color " + color + " corre utilizando su altura de " + altura + " y su peso de " + peso + " como ventaja para cazar";
    }

    @Override
    public String comunicarse() {
        return "El " + nombreCientifico + " de color " + color + " se comunica con su camada de " + numCamada + " con lenguaje corporal";
    }
}
