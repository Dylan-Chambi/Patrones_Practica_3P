package ejercicio5.exercise;

public class AplicacionEscritorio implements IApliacionNuevaEmpresa {

    @Override
    public void iniciarSesion() {
        System.out.println("Aplicacion Escritorio> Iniciar Sesion");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Aplicacion Escritorio> Cerrar Sesion");
    }

    @Override
    public void generacionDatos() {
        System.out.println("Aplicacion Escritorio> Generacion Datos");
    }
}
