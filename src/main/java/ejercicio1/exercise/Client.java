package ejercicio1.exercise;

public class Client {

    public static void main (String []args){

        Personaje elfoNocturno = new ElfoNocturno("Caranthir");
        elfoNocturno = new AgregarTipoArma(elfoNocturno, TipoArma.ESPADA);
        elfoNocturno = new AgregarEscudo(elfoNocturno, new Escudo());
        elfoNocturno = new AgregarPocionCuracion(elfoNocturno, new PocionCuracion());

        elfoNocturno.showCaracteristicas();

    }
}
