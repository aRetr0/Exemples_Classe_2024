package CapaDomini.FactoriaProducte;

import CapaDomini.Blocs.IBloc;
import CapaDomini.Monedes.IMoneda;

public interface IFactoriaAbstracte {

    public static IFactoriaAbstracte getFactoria() throws Exception {
        String familia = System.getProperty("TipusVisual");
        familia = "CapaDomini.FactoriaProducte.Factoria" + familia;
        Class laClasse = Class.forName(familia);
        //return (IFactoriaAbstracte) laClasse.getConstructor().newInstance();
        return (IFactoriaAbstracte) laClasse.getMethod("getInstanciaUnica").invoke(null);
    }

    public abstract IMoneda creaMoneda();

    public abstract IBloc creaBloc();
}
