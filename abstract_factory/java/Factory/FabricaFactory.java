package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.MesaDeCentro;


public interface FabricaFactory {
    
    public Cadeira fabricaCadeira();
        
    public MesaDeCentro fabricaMesaDeCentro();
    
}
