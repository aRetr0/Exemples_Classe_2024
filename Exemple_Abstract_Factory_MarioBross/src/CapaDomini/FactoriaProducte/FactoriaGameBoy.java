package CapaDomini.FactoriaProducte;

import CapaDomini.Blocs.BlocGameBoy;
import CapaDomini.Blocs.IBloc;
import CapaDomini.Monedes.IMoneda;
import CapaDomini.Monedes.MonedaGameBoy;

final class FactoriaGameBoy implements IFactoriaAbstracte {

    private static FactoriaGameBoy instanciaUnica = new FactoriaGameBoy();

    private FactoriaGameBoy() {}

    public static FactoriaGameBoy getInstanciaUnica() {return instanciaUnica;}

    @Override
    public IMoneda creaMoneda() {
        return new MonedaGameBoy();
    }

    @Override
    public IBloc creaBloc() {

        return new BlocGameBoy();
    }
}
