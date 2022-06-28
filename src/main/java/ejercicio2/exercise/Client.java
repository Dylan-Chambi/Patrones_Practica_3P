package ejercicio2.exercise;

public class Client {

    public static void main (String[]args){
        PagoEfectivo pagoEfectivo = new PagoEfectivo();
        PagoTransferenciaBancaria pagoTransferenciaBancaria = new PagoTransferenciaBancaria();
        PagoTigoMoney pagoTigoMoney = new PagoTigoMoney();
        PagoAplicacionEmpresa pagoAplicacionEmpresa = new PagoAplicacionEmpresa();

        InstalacionElectrica instalacionElectrica = new InstalacionElectrica();
        instalacionElectrica.setFormaPago(pagoEfectivo);
        instalacionElectrica.pagar();

        InstalacionAgua instalacionAgua = new InstalacionAgua();
        instalacionAgua.setFormaPago(pagoTransferenciaBancaria);
        instalacionAgua.pagar();

        InstalacionAlcantarillado instalacionAlcantarillado = new InstalacionAlcantarillado();
        instalacionAlcantarillado.setFormaPago(pagoTigoMoney);
        instalacionAlcantarillado.pagar();

        instalacionElectrica.setFormaPago(pagoAplicacionEmpresa);
        instalacionElectrica.pagar();


    }
}
