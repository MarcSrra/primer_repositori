package herencia_esport;

public class Hoquei extends Esport{
	private String tipus;
	private int lesionats;
	
	public Hoquei (String nomequip, boolean competitiu, boolean equip, 
			boolean tempslimit, String tipus, int lesionats){
		super(nomequip, competitiu, equip, tempslimit);
		this.tipus = tipus;
		this.lesionats = lesionats;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public int getLesionats() {
		return lesionats;
	}

	public void setLesionats(int lesionats) {
		this.lesionats = lesionats;
	}
	
	@Override
	public String toString(){
		String dades = super.toString();
		String stringfinal = dades + "\nTipus: " + tipus + "\nLesionats: " 
				+ lesionats;
		return stringfinal;
	}
	
	public void alerta(){
		System.out.println("Tenim mols lesionats, anem amb compte");
	}
}
