package ejercicio5.exercise;

public class AplicacionAndroid implements IAplicacionMovil {

    @Override
    public void login() {
        System.out.println("Aplicacion Android> Login");
    }

    @Override
    public void logout() {
        System.out.println("Aplicacion Android> Logout");
    }

    @Override
    public void reportes() {
        System.out.println("Aplicacion Android> Reportes");
    }
}
