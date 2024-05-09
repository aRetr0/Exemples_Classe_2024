public class Rectangle {

    public static final double COST_PER_METER = 2.5;
    private int amplada, alçada;

    private double cost;

    public Rectangle( int amplada, int alçada)
    {
        this.amplada = amplada;
        this.alçada = alçada;
        this.cost = 0;
    }

    public Rectangle( )
    {
        this(10,5);
    }
    public int getArea()
    { return amplada * alçada;}


    public void setCost( double costMetre)
    { this.cost =   costMetre * getArea();}


    public String toString()
    { return "Rectangle " + amplada + "- " + alçada; }

    public static void mostarConstant(String args)
    { System.out.println(args + " " + COST_PER_METER);}
}
