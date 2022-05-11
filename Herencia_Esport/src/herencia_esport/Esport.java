package herencia_esport;

public class Esport {
	private String nomequip;
	private boolean competitiu;
	private boolean equip;
	private boolean tempslimit; 
	
	public Esport(String nomequip, boolean competitiu, boolean equip, boolean tempslimit){
		this.nomequip = nomequip;
		this.competitiu = competitiu;
		this.equip = equip;
		this.tempslimit = tempslimit;
	}

	public String getNomequip() {
		return nomequip;
	}

	public void setNomequip(String nomequip) {
		this.nomequip = nomequip;
	}

	public boolean isCompetitiu() {
		return competitiu;
	}

	public void setCompetitiu(boolean competitiu) {
		this.competitiu = competitiu;
	}

	public boolean isEquip() {
		return equip;
	}

	public void setEquip(boolean equip) {
		this.equip = equip;
	}

	public boolean isTempslimit() {
		return tempslimit;
	}

	public void setTempslimit(boolean tempslimit) {
		this.tempslimit = tempslimit;
	}
	
	public String toSting(){
		String stringfinal = "Dades:\n" + "Nom de l'equip: " + nomequip 
				+ "\nEsport competitiu: " + competitiu + "\nEsport d'equip: " 
				+ equip + "\nEsport amb " + "temps límit: " + tempslimit;
		return stringfinal;
	}
	
	public void puntua(){
		System.out.println("El marcador incrementa 1 punt quan el jugador anota");
	}
}
