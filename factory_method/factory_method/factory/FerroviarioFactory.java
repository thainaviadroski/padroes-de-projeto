package factory_method.factory_method.factory;

import factory_method.antes_do_padrao.modelo.Ferroviario;
import factory_method.antes_do_padrao.modelo.Transporte;

public class FerroviarioFactory extends TransporteFactory { 
         
    public Transporte criarTransporte() {

        //aqui será implementado a complexidade de criação do objeto 
        return new Ferroviario();

    }

}

    

