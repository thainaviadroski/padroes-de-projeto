package factory_method.factory_method.factory;

import factory_method.antes_do_padrao.modelo.Transporte;

public abstract class TransporteFactory { 

         
    public Transporte ordemDeTransporte() {

         Transporte transporte = null;
             
         transporte = criarTransporte();

         transporte.contratar();

         return transporte;

    }

    protected abstract Transporte criarTransporte();

}

    

