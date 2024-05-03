package Factory_Figura;

public class Quadrat extends Figura{

    public Quadrat(double costat) { super(costat);}

    @Override
    public double getArea() {
        return this.costat * this.costat;
    }

}
