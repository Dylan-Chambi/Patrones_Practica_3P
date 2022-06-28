package ejercicio6.exercise;

public class Celular implements IComponenteFisico {
    private String marca;
    private String modelo;
    private String color;
    private String sistemaOperativo;

    public Celular(String marca, String modelo, String color, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void recibirRecomendacion(IVisitor visitor) {
        visitor.recomendarMantenimiento(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Celular:");
        System.out.println("\t" + "- Marca: " + marca);
        System.out.println("\t" + "- Modelo: " + modelo);
        System.out.println("\t" + "- Color: " + color);
        System.out.println("\t" + "- Sistema Operativo: " + sistemaOperativo);
    }
}
