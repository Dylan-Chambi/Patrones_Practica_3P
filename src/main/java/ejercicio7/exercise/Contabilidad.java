package ejercicio7.exercise;

import java.util.ArrayList;
import java.util.List;

public class Contabilidad implements IDueniosEmpresa {
    private List<String> registrosContables;

    public Contabilidad(){
        registrosContables = new ArrayList<>();
    }
    @Override
    public void update(String msg) {
        System.out.println("Contabilidad recibio una nofiticacion de pago: [" + msg + "]");
        registrosContables.add(msg);
    }

    public void showRegistrosContables(){
        System.out.println("Registros contables:");
        for(String registro : registrosContables){
            System.out.println("\t" + registro);
        }
    }
}
