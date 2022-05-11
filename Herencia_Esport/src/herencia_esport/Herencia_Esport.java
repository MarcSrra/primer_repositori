package herencia_esport;

public class Herencia_Esport {


	public static void main(String[] args) {
		//EXERCICI 1
		Esgrima e1 = new Esgrima ("Esgrimeros 3", true, false, false, "Lliure", 4);
		Basquet b1 = new Basquet ("Baloncest 6", false, true, true, "camp del pati", "Josep Maria");
		Hoquei h1 = new Hoquei ("Hoquelin 8", true, true, true, "Gel", 8);
		
		e1.puntua();
		b1.puntua();
		h1.puntua();
		
		System.out.println("");
		
		//EXERCICI 2
		Esport [] Objectes = new Esport[4];
		Objectes [0] = new Esgrima ("Esgrimeros 4", true, false, false, "Lliure", 4);
		Objectes [1] = new Basquet ("Baloncest 7", false, true, true, "camp del pati", "Josep Maria");
		Objectes [2] = new Hoquei ("Hoquelin 9", true, true, true, "Gel", 8);
		Objectes [3] = new Hoquei ("Hoquelin 10", true, true, true, "Patins", 9);
		
		Objectes [0].puntua();
		Objectes [1].puntua();
		Objectes [2].puntua();
		Objectes [3].puntua();
		
		//Objectes [2].alerta();
		//Objectes [1].Sponsor();
		//Els mètodes propis ens donen error
	}
	
}
