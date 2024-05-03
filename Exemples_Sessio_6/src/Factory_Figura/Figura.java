package Factory_Figura;

public abstract class Figura {
    protected double costat;
    public Figura( double costat)
    {this.costat = costat;}

    public abstract double getArea();
}
