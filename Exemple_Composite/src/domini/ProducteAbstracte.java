package domini;

public abstract class ProducteAbstracte {

    protected String nom;
    protected double preu;
    protected String marca;

    public ProducteAbstracte(String nom, double preu, String marca) {
        this.nom = nom;
        this.preu = preu;
        this.marca = marca;
    }

    public double getPreu() {
        return this.preu;
    }

    public String getNom() {return this.nom;}

    public String getMarca() {return this.marca;}


    public abstract boolean addProduct(ProducteAbstracte fill);
}