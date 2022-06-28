package ejercicio7.exercise;

import java.util.Timer;
import java.util.TimerTask;

public class Client {

    public static void main(String[] args) {
        Presidente presidente = new Presidente("Martin");
        Vicepresidente vicepresidente = new Vicepresidente("Andrea");
        Contabilidad contabilidad = new Contabilidad();

        CuentaBancoUnica.getInstance().subscribir(presidente);
        CuentaBancoUnica.getInstance().subscribir(vicepresidente);
        CuentaBancoUnica.getInstance().subscribir(contabilidad);


        ServicioTecnico servicioTecnico = new ServicioTecnico();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Computadora computadora = new Computadora("Windows 10");
                computadora.recibirReparacion(servicioTecnico);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Tablet tablet = new Tablet("Android 10");
                tablet.recibirReparacion(servicioTecnico);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Laptop laptop = new Laptop("Windows 10");
                laptop.recibirReparacion(servicioTecnico);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("------------------------ Registro de Contabilidad------------------------");
                contabilidad.showRegistrosContables();
                timer.cancel();
            }
        }, 3000);




    }
}
