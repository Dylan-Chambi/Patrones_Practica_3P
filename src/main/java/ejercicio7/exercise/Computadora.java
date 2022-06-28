package ejercicio7.exercise;

public class Computadora implements IComputadora {
    private String sistemaOperativo;

    public Computadora(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void recibirReparacion(IVisitor visitor) {
        visitor.elegirKitHerramientas(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Computadora:");
        System.out.println("\t" + "- Sistema Operativo: " + sistemaOperativo);
    }
}
