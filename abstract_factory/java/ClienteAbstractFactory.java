package abstract_factory.java;

import abstract_factory.java.Factory.FabricaFactory;
import abstract_factory.java.Factory.FabricaModernaFactory;
import abstract_factory.java.Factory.FabricaVitorianoFactory;
import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.MesaDeCentro;

public class ClienteAbstractFactory {

    public static void main(String[] args) {
     
        
        System.out.println("### Fabricando móveis  ###");        
        
        FabricaFactory factory = new FabricaModernaFactory();
        //FabricaFactory factory = new FabricaVitorianaFactory();

        Cadeira cadeira = factory.fabricaCadeira();
        cadeira.sentar();
        
        System.out.println(" ");        
        
        MesaDeCentro mesaDeCentro = factory.fabricaMesaDeCentro();
        mesaDeCentro.colocarDecoracao(); 
        
    }
    
}
