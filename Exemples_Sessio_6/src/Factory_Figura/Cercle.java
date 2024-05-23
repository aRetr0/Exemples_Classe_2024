package Factory_Figura;

public class Cercle extends Figura {

    public Cercle(double radi) {super(radi);}

    @Override
    public double getArea() {
        return Math.PI * this.costat * this.costat;
    }
}
