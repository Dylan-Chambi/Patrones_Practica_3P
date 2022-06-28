package ejercicio7.exercise;

public class Laptop implements IComputadora {
    private String sistemaOperativo;

    public Laptop(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void recibirReparacion(IVisitor visitor) {
        visitor.elegirKitHerramientas(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Laptop:");
        System.out.println("\t" + "- Sistema Operativo: " + sistemaOperativo);
    }
}
