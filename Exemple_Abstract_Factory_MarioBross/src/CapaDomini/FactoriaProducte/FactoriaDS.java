package CapaDomini.FactoriaProducte;

import CapaDomini.Blocs.BlocDS;
import CapaDomini.Blocs.IBloc;
import CapaDomini.Monedes.IMoneda;
import CapaDomini.Monedes.MonedaDS;

final class FactoriaDS implements IFactoriaAbstracte {

    private static FactoriaDS instanciaUnica = new FactoriaDS();

    private FactoriaDS() {}

    public static FactoriaDS getInstanciaUnica() {return instanciaUnica;}

    @Override
    public IMoneda creaMoneda() {
        return new MonedaDS(1);
    }

    @Override
    public IBloc creaBloc() {

        return new BlocDS();
    }
}
