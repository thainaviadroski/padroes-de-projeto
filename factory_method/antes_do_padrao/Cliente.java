
package factory_method.antes_do_padrao;

import factory_method.simple.factory.TransporteSimpleFactory;
import factory_method.simple.modelo.Aereo;
import factory_method.simple.modelo.Ferroviario;
import factory_method.simple.modelo.Hidroviario;
import factory_method.simple.modelo.Rodoviario;
import factory_method.simple.modelo.Transporte;

public class Cliente {

    public static Transporte ordemDeTransporte(int tipo) { 

        Transporte transporte = null;
     
        switch (tipo) {
            case Transporte.AEREO:
                transporte = new Aereo();
                break;
            case Transporte.FERROVIARIO:
                transporte = new Ferroviario();
                break;         
            case Transporte.HIDROVIARIO:
                transporte = new Hidroviario();
                break;
            case Transporte.RODOVIARIO:
                transporte = new Rodoviario();
                break;

        }        

        transporte.contratar();

        return transporte;
    }

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte ###");
        
        System.out.println("");
        Transporte transporteAereo = TransporteSimpleFactory.ordemDeTransporte(Transporte.AEREO);
        System.out.println(transporteAereo.toString());

        System.out.println("");
        Transporte transporteFerroviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.FERROVIARIO);
        System.out.println(transporteFerroviario.toString());

        System.out.println("");
        Transporte transporteHidroviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.HIDROVIARIO);
        System.out.println(transporteHidroviario.toString());

        System.out.println("");
        Transporte transporteRodoviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.RODOVIARIO);
        System.out.println(transporteRodoviario.toString());

    }

}