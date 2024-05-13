package CapaDomini.Monedes;

public class MonedaDS implements IMoneda {
    private int valor;

    public MonedaDS(int valor) {
        this.valor = valor;
    }
    @Override
    public String quiSoc() {
        return "Sóc una moneda de NintendoDS amb valor " + valor;
    }
	@Override
	public int agafarMoneda() {
		return valor;
	}
}