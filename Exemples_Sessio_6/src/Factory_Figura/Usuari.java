package Factory_Figura;

public class Usuari {

    public static void main(String[] args) {

        FactoriaFigura f = FactoriaFigura.getInstance();

        Figura quadrat = f.creadorFigura(2, 5.0);
        System.out.println(quadrat.getArea());
    }
}
