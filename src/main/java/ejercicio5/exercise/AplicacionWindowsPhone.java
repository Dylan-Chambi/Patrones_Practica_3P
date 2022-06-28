package ejercicio5.exercise;

public class AplicacionWindowsPhone implements IAplicacionMovil {

    @Override
    public void login() {
        System.out.println("Aplicacion WindowsPhone> Login");
    }

    @Override
    public void logout() {
        System.out.println("Applicacion WindowsPhone> Logout");
    }

    @Override
    public void reportes() {
        System.out.println("Aplicacion WindowsPhone> Reportes");
    }
}
