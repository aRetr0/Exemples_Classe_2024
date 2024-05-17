package domini;

import java.util.ArrayList;

public class ProducteCompost extends ProducteAbstracte {

	private ArrayList<ProducteAbstracte> productes;

	public ProducteCompost(String name, double price, String brand) {
		super(name, price, brand);
		productes = new ArrayList<>();
	}
@Override
	public double getPreu() {
		double suma = this.preu;
		for (ProducteAbstracte item : productes)
			suma += item.getPreu();

		return suma;
	}

	@Override
	public boolean addProduct(ProducteAbstracte nou) {
		if (nou == null)
			return false;
		if( nou == this )
			return false;
		if( this.isRepe(nou))
			return false;
		if( nou instanceof ProducteCompost
				&& ((ProducteCompost) nou).isRepe(this))
			return false;
		productes.add(nou);
		return true;
	}

	private boolean isRepe(ProducteAbstracte nou)
	{
		for(ProducteAbstracte item : productes) {
			if(item == nou && item instanceof ProducteCompost)
				return true;
			if( item instanceof ProducteCompost
					&& ((ProducteCompost) item).isRepe(nou))
				return true;
				
		}
		return false;
	}
}