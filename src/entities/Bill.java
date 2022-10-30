package entities;

public class Bill {
	
	public final double  F = 8, M = 10, CERV = 5, REFRI = 3, ESPE = 7, COUR = 4; 
	
	public char gender;
	public int barbecue, softDrink, beer;
	
	
	public double cover() {
		if(feeding() > 30 ) {
			return 0.0;
		}
		else {
			return COUR;
		}
	}
	
	public double feeding() {
		return (beer * CERV) +(softDrink * REFRI) + (barbecue * ESPE);		
	}
	
	public double ticket() {
		if (gender == 'f'){
			return F;
		}
		else {
			return M;
		}
	}
	
	public double total() {
			return feeding() + ticket() + cover();
		}
}
