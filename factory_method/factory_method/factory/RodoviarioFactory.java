package factory_method.factory_method.factory;

import factory_method.antes_do_padrao.modelo.Rodoviario;
import factory_method.antes_do_padrao.modelo.Transporte;

public class RodoviarioFactory extends TransporteFactory { 

         
    public Transporte criarTransporte() {

        //aqui será implementado a complexidade de criação do objeto 
        return new Rodoviario();

    }

}

    

