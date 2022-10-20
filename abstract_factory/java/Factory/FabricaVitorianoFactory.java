package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.CadeiraVitoriano;
import abstract_factory.java.Modelo.MesaDeCentro;
import abstract_factory.java.Modelo.MesaDeCentroVitoriano;

public class FabricaVitorianoFactory implements FabricaFactory {
    
    public Cadeira fabricaCadeira() {

        System.out.println("Fabricado uma cadeira vitoriana");
        return new CadeiraVitoriano();
    }
        
    public MesaDeCentro fabricaMesaDeCentro() {

        System.out.println("Fabricando uma mesa vitoriana");
        return new MesaDeCentroVitoriano();

    }

}