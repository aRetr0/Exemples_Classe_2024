package Factory_Figura;

public final class FactoriaFigura {

    public final static int QUADRAT = 1;
    public final static int CERCLE = 2;

    // Inici Patró singleton
    private static FactoriaFigura instanciaUnica = new FactoriaFigura();
    private FactoriaFigura(){}
    public  static FactoriaFigura getInstance()
    { return instanciaUnica;}
    // Fi Patró Singleton

    public Figura creadorFigura(int tipus, double costat)
    {
        switch (tipus)
        {
            case QUADRAT: return new Quadrat(costat);
            case CERCLE: return new Cercle(costat);
            default: throw new IllegalArgumentException("tipus de Figura incorrecte");
        }
    }
}
