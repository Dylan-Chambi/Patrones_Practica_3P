package ejercicio7.exercise;

public class Tablet implements IComputadora {
    private String sistemaOperativo;

    public Tablet(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void recibirReparacion(IVisitor visitor) {
        visitor.elegirKitHerramientas(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Tablet:");
        System.out.println("\t" + "- Sistema Operativo: " + sistemaOperativo);
    }
}
