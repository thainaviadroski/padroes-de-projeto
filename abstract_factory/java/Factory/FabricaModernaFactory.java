package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.CadeiraModerna;

import abstract_factory.java.Modelo.MesaDeCentro;
import abstract_factory.java.Modelo.MesaDeCentroModerna;


public class FabricaModernaFactory implements FabricaFactory {
    

    public Cadeira fabricaCadeira() {

        System.out.println("Fabricado uma cadeira moderna");
        return new CadeiraModerna();
    }
        
    public MesaDeCentro fabricaMesaDeCentro() {

        System.out.println("Fabricando uma mesa moderna");
        return new MesaDeCentroModerna();

    }

}
