package factory_method.java.half_simple;

import factory_method.java.half_simple.factory.NaoTerrestreFactory;
import factory_method.java.half_simple.factory.TerrestreFactory;
import factory_method.java.half_simple.modelo.Transporte;

public class ClienteHalfSimpleFactory {

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte ###");
        
        System.out.println("");
        TerrestreFactory terrestreFactory = new TerrestreFactory();
        terrestreFactory.ordemDeTransporte(Transporte.GRANDE);
        System.out.println(terrestreFactory.toString());

        System.out.println("");
        TerrestreFactory terrestreFactory01 = new TerrestreFactory();
        terrestreFactory01.ordemDeTransporte(Transporte.POUCA);
        System.out.println(terrestreFactory01.toString());

        System.out.println("");
        NaoTerrestreFactory naoTerrestreFactory = new NaoTerrestreFactory();
        naoTerrestreFactory.ordemDeTransporte(Transporte.GRANDE);
        System.out.println(naoTerrestreFactory.toString());

        System.out.println("");
        NaoTerrestreFactory naoTerrestreFactory01 = new NaoTerrestreFactory();
        naoTerrestreFactory.ordemDeTransporte(Transporte.POUCA);
        System.out.println(naoTerrestreFactory01.toString());

    }

}