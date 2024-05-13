package CapaDomini.Monedes;

public class MonedaGameBoy implements IMoneda {

    public MonedaGameBoy() {
    }

    @Override
    public String quiSoc() {
        return "Sóc una Moneda de la GameBoy";
    }

	@Override
	public int agafarMoneda() {
		return 1;
	}
}
