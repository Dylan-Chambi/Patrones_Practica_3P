package ejercicio7.exercise;


public class ServicioTecnico implements IVisitor {


    @Override
    public void elegirKitHerramientas(Computadora computadora) {
        System.out.println("Seleccionando kit de herramientas para computadora");
        CuentaBancoUnica.getInstance().recibirPago(3000, "Reparacion de computadora");
        System.out.println("");
    }

    @Override
    public void elegirKitHerramientas(Tablet tablet) {
        System.out.println("Seleccionando kit de herramientas para tablet");
        CuentaBancoUnica.getInstance().recibirPago(1200, "Reparacion de tablet");
        System.out.println("");
    }

    @Override
    public void elegirKitHerramientas(Laptop laptop) {
        System.out.println("Seleccionando kit de herramientas para laptop");
        CuentaBancoUnica.getInstance().recibirPago(2100, "Reparacion de laptop");
        System.out.println("");
    }
}
