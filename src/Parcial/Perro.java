package Parcial;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El " + nombreCientifico + " de color " + color + " especies medianas y grandes utilizando sus colmillos de" + tamañoColmillos +"cm y su fuerza de mordida de " + fuerzaMordida + "N";
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
        return "El " + nombreCientifico + " de color " + color + " con lenguaje corporal";
    }
}
