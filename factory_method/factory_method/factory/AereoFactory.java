package factory_method.factory_method.factory;

import factory_method.antes_do_padrao.modelo.Aereo;
import factory_method.antes_do_padrao.modelo.Transporte;

public class AereoFactory extends TransporteFactory { 

         
    public Transporte criarTransporte() {

         return new Aereo();

    }

}

    

