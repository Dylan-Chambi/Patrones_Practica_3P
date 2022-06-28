package ejercicio7.exercise;

public class Vicepresidente implements IDueniosEmpresa {
    private String nombre;

    public Vicepresidente(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void update(String msg) {
        System.out.println("El vicepresidente " + nombre + " recibio una nofiticacion de pago: [" + msg + "]");
    }
}
