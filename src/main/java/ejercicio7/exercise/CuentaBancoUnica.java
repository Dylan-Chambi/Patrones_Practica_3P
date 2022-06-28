package ejercicio7.exercise;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancoUnica implements ISubject {
    private static CuentaBancoUnica instance;
    private String titulor;
    private String numeroCuenta;

    private List<IDueniosEmpresa> observers;

    private double montoEnCuenta;

    private CuentaBancoUnica() {
        this.titulor = "Dylan";
        this.numeroCuenta = "894894678";
        this.montoEnCuenta = 0;
        this.observers = new ArrayList<>();
    }

    private synchronized static void multiThreadControl(){
        if(instance==null){
            instance = new CuentaBancoUnica();
        }
    }

    public static CuentaBancoUnica getInstance(){
        if(instance==null) multiThreadControl();
        return instance;
    }

    public String getTitulor() {
        return titulor;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void showInfo() {
        System.out.println("Titulor: " + titulor + ", Numero de Cuenta: " + numeroCuenta + ", Monto en Cuenta: " + montoEnCuenta);
    }

    public synchronized void recibirPago(double monto, String detalle) {
        this.montoEnCuenta += monto;
        String registro = "Se recibido un pago de " + monto + " Bs con detalle: " + detalle;
        System.out.println(registro);
        notifyObservers(registro);

    }

    @Override
    public void subscribir(IDueniosEmpresa observer) {
        observers.add(observer);
    }

    @Override
    public void desubscribir(IDueniosEmpresa observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(IDueniosEmpresa observer: observers){
            observer.update(msg);
        }
    }
}
