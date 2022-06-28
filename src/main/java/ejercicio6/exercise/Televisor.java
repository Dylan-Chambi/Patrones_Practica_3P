package ejercicio6.exercise;

public class Televisor implements IComponenteFisico {
    private String marca;
    private String modelo;
    private String tamanio;
    private String resolucion;

    public Televisor(String marca, String modelo, String tamanio, String resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
    }

    @Override
    public void recibirRecomendacion(IVisitor visitor) {
        visitor.recomendarMantenimiento(this);
    }

    @Override
    public void showInfo() {
        System.out.println("Televisor:");
        System.out.println("\t" + "- Marca: " + marca);
        System.out.println("\t" + "- Modelo: " + modelo);
        System.out.println("\t" + "- Tamaño: " + tamanio);
        System.out.println("\t" + "- Resolución: " + resolucion);
    }
}
