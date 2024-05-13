package CapaDomini.FactoriaProducte;

import CapaDomini.Blocs.*;
import CapaDomini.Monedes.*;

 final class FactoriaGameBoy implements IFactoriaAbstracte{

    private static FactoriaGameBoy instanciaUnica = new FactoriaGameBoy();
    private FactoriaGameBoy(){}
    public static FactoriaGameBoy getInstanciaUnica(){ return instanciaUnica;}

    @Override
    public IMoneda creaMoneda() {
        return new MonedaGameBoy();
    }

    @Override
    public IBloc creaBloc() {

        return new BlocGameBoy();
    }
}
