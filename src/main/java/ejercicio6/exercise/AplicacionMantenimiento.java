package ejercicio6.exercise;


public class AplicacionMantenimiento implements IVisitor{


    @Override
    public void recomendarMantenimiento(Computadora computadora) {
        int numeroRandom = (int) (Math.random() * 10);
        if(numeroRandom % 2 == 0){
            System.out.println("Se recomienda mantenimiento preventivo a la computadora: ");
        }else{
            System.out.println("Se recomienda mantenimiento correctivo a la computadora: ");
        }
        computadora.showInfo();
    }

    @Override
    public void recomendarMantenimiento(Celular celular) {
        System.out.println("Se recomienda un mantenimiento preventivo al celular: ");
        celular.showInfo();
    }

    @Override
    public void recomendarMantenimiento(Televisor televisor) {
        System.out.println("Se recomienda un mantenimiento al televisor: ");
        televisor.showInfo();
    }
}
