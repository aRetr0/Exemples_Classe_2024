package Factory_Figura;

public class Usuari {

    public static void main(String[] args) {

        FactoriaFigura f = FactoriaFigura.getInstance();

        Figura quadrat = f.creadorFigura(2, 5.0);
        System.out.println(quadrat.getArea());

        // sessio 7

        Factoria_Figura_PR factoria = Factoria_Figura_PR.getInstanciaUnica();
        Figura cercle = factoria.createFigura(TipusFigura.Cercle, 3.2);
        System.out.println(cercle.getArea());

    }
}
