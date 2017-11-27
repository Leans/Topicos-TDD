
public class Frame {
	
	private int intento1;
	private int intento2;
	
	public Frame(int p_intento1, int p_intento2) {		
		this.setIntento1(p_intento1);
		
		if (p_intento2 > 10) {
			this.intento2 = 10;
		} else {
			this.intento2 = p_intento2;
		}		
	}
	
	private void setIntento1(int p_intento1) {
		if (p_intento1 > 10) {
			this.intento1 = 10;
		} else {
			if (p_intento1 < 0) {
				this.intento1 = 0;
			} else {
				this.intento1 = p_intento1;
			}
		}
	}

	public int getIntento1() {
		return this.intento1;
	}
	
	public int getIntento2() {
		return this.intento2;
	}

}