package Factory_Figura;

import java.lang.reflect.Constructor;

public final class Factoria_Figura_PR {

    private static final Factoria_Figura_PR instanciaUnica = new Factoria_Figura_PR();

    private Factoria_Figura_PR() {}

    public static Factoria_Figura_PR getInstanciaUnica() {return instanciaUnica;}

    public Figura createFigura(TipusFigura elTipus, double valor) {
        String nom = elTipus.name();
        try {
            Class laClasse = Class.forName("Factory_Figura." + nom);
            Constructor elConstructor = laClasse.getConstructor(double.class);
            return (Figura) elConstructor.newInstance(valor);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
