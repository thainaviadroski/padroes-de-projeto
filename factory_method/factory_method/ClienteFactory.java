package factory_method.factory_method;

import factory_method.factory_method.factory.AereoFactory;
import factory_method.factory_method.factory.FerroviarioFactory;
import factory_method.factory_method.factory.HidroviarioFactory;
import factory_method.factory_method.factory.RodoviarioFactory;

public class ClienteFactory {

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte ###");
        
        System.out.println("");
        AereoFactory aereoFactory = new AereoFactory();
        aereoFactory.ordemDeTransporte();
        System.out.println(aereoFactory.toString());

        System.out.println("");
        FerroviarioFactory ferroviarioFactory = new FerroviarioFactory(); 
        ferroviarioFactory.ordemDeTransporte();
        System.out.println(ferroviarioFactory.toString());

        System.out.println("");
        HidroviarioFactory hidroviarioFactory = new HidroviarioFactory();
        hidroviarioFactory.ordemDeTransporte();
        System.out.println(hidroviarioFactory.toString());

        System.out.println("");
        RodoviarioFactory rodoviarioFactory = new RodoviarioFactory();
        rodoviarioFactory.ordemDeTransporte();
        System.out.println(rodoviarioFactory.toString());

    }

}