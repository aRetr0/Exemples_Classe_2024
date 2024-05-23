package CapaDomini;

import CapaDomini.Blocs.IBloc;
import CapaDomini.FactoriaProducte.IFactoriaAbstracte;
import CapaDomini.Monedes.IMoneda;

public class ProvaPatroFactoria {

    public static void main(String[] args) throws Exception {

        System.setProperty("TipusVisual", "GameBoy");

        //System.setProperty("TipusVisual", "DS");


        IFactoriaAbstracte unaFabrica = IFactoriaAbstracte.getFactoria();
        IBloc unbloc = unaFabrica.creaBloc();
        IMoneda unaMoneda = unaFabrica.creaMoneda();

        System.out.println(unbloc.quiSoc());
        System.out.println(unaMoneda.quiSoc());
    }
}
