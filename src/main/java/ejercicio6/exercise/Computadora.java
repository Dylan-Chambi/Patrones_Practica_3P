package ejercicio6.exercise;

public class Computadora implements IComponenteFisico {
    private String sistemaOperativo;
    private String arquitectura;
    private String ram;
    private String procesador;

    public Computadora(String sistemaOperativo, String arquitectura, String ram, String procesador) {
        this.sistemaOperativo = sistemaOperativo;
        this.arquitectura = arquitectura;
        this.ram = ram;
        this.procesador = procesador;
    }

    @Override
    public void recibirRecomendacion(IVisitor visitor) {
        visitor.recomendarMantenimiento(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Computadora:");
        System.out.println("\t" + "- Sistema Operativo: " + sistemaOperativo);
        System.out.println("\t" + "- Arquitectura: " + arquitectura);
        System.out.println("\t" + "- RAM: " + ram);
        System.out.println("\t" + "- Procesador: " + procesador);
    }
}
