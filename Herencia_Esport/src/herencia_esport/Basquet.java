package herencia_esport;

public class Basquet extends Esport{
	private String estadi;
	private String entrenador;
	
	public Basquet (String nomequip, boolean competitiu, boolean equip, 
			boolean tempslimit, String estadi, String entrenador){
		super(nomequip, competitiu, equip, tempslimit);
		this.estadi = estadi;
		this.entrenador = entrenador;
	}

	public String getEstadi() {
		return estadi;
	}

	public void setEstadi(String estadi) {
		this.estadi = estadi;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	
	@Override
	public String toString(){
		String dades = super.toString();
		String stringfinal = dades + "\nEstadi: " + estadi + "\nEntrenador: " 
				+ entrenador;
		return stringfinal;
	}
	
	@Override
	public void puntua(){
		System.out.println("El marcador incrementa 1 punt quan el jugador "
				+ "encistella");
	}
	
	public void Sponsor(){
		System.out.println("Aquest esport està patrocinat per mi");
	}
}
