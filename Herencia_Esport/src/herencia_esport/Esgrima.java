package herencia_esport;

public class Esgrima extends Esport{
	private String estil;
	private int campionats;
	
	public Esgrima (String nomequip, boolean competitiu, boolean equip, 
			boolean tempslimit, String estil, int campionats){
		super(nomequip, competitiu, equip, tempslimit);
		this.estil = estil;
		this.campionats = campionats;
	}

	public String getEstil() {
		return estil;
	}

	public void setEstil(String estil) {
		this.estil = estil;
	}

	public int getCampionats() {
		return campionats;
	}

	public void setCampionats(int campionats) {
		this.campionats = campionats;
	}

	@Override
	public String toString(){
		String dades = super.toString();
		String stringfinal = dades + "\nEstil: " + estil + "\nCampionats guanyats: " 
				+ campionats;
		return stringfinal;
	}
	
	@Override
	public void puntua(){
		System.out.println("El marcador incrementa 1 punt quan l'atleta colpeja");
	}
}
