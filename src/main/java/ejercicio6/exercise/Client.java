package ejercicio6.exercise;

public class Client {

    public static void main(String[]args){
        AplicacionMantenimiento aplicacionMantenimiento = new AplicacionMantenimiento();

        Celular celular = new Celular("Samsung", "S20", "Verde", "Android 12");
        Computadora computadora = new Computadora("Windows 10", "x86", "8GB", "i7 8700k");
        Televisor televisor = new Televisor("Samsung", "Amoled", "45 pulgadas", "4k");

        celular.recibirRecomendacion(aplicacionMantenimiento);
        computadora.recibirRecomendacion(aplicacionMantenimiento);
        televisor.recibirRecomendacion(aplicacionMantenimiento);
    }
}
