package Parcial;

public class EjemploMamifero {
    public static void main(String[] args) {

        Leon leon = new Leon("Savana", 2,4,150, "Panthera leo", 7,30,8,114);
        System.out.println(leon.comer() + "\n" +  leon.dormir() +"\n" +  leon.correr() + "\n" + leon.comunicarse() );

        System.out.println("==============================================");

        Tigre tigre = new Tigre("Selva", 3,5,200, "Panthera tigris", 7,25,"Tigre de bengala");
        System.out.println(tigre.comer() + "\n" +  tigre.dormir() +"\n" +  tigre.correr() + "\n" + tigre.comunicarse() );

        System.out.println("==============================================");

        Guepardo guepardo = new Guepardo("Savana", 2,4,80, "Acinonyx jubatus", 5,100);
        System.out.println(guepardo.comer() + "\n" +  guepardo.dormir() + "\n" + guepardo.correr() + "\n" + guepardo.comunicarse() );

        System.out.println("==============================================");

        Lobo lobo= new Lobo("Bosque", 2,3,75, "Canis lupus", "Gris",4, 10, "Lobo gris");
        System.out.println(lobo.comer() + "\n" +  lobo.dormir() +"\n" +  lobo.correr() + "\n" + lobo.comunicarse() );

        System.out.println("==============================================");

        Perro perro= new Perro("Savana", 2,3,75, "Lycaon pictus", "Café",4, 77);
        System.out.println(perro.comer() + "\n" +  perro.dormir() +"\n" +  perro.correr() + "\n" + perro.comunicarse() );










    }
}
