package jana60.valutazioni;

public class Studente {

	int  idStudente;
	int  percentualeAssenze;
	float mediaVoti;
	
	public Studente(int idStudente, int percentualeAssenze, float mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	 

	
	boolean risultato() {
		
		boolean prom = true;
		
		if (percentualeAssenze > 25 && percentualeAssenze <= 50 && mediaVoti > 2) {
			prom = true;
		}else if (percentualeAssenze < 25 && mediaVoti > 2){
			prom = true;	
		}else {
			prom = false;
		}
				
		return prom;
	}
	
}
