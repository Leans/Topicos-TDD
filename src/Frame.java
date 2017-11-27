
public class Frame {
	
	private int intento1;
	private int intento2;
	
	public Frame(int p_intento1, int p_intento2) {		
		this.setIntento1(p_intento1);
		if (p_intento1 == 10) {
			this.setIntento2(0);
		} else {
			this.setIntento2(p_intento2);
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
	
	private void setIntento2(int p_intento2) {
		if (p_intento2 > 10) {
			this.intento2 = 10;
		} else {
			if (p_intento2 < 0) {
				this.intento2 = 0;
			} else {
				this.intento2 = p_intento2;
			}
		}	
	}

	public int getIntento1() {
		return this.intento1;
	}
	
	public int getIntento2() {
		return this.intento2;
	}

	public int contabilizarPuntaje() {
		if (this.esPleno()) {
			return 10;
		} else {
			return (this.getIntento1() + this.getIntento2());
		}
	}

	public boolean esPleno() {
		if (this.getIntento1() == 10) {
			return true;
		} else {
			return false;
		}
		
	}

}