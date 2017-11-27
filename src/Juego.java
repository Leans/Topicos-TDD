import java.util.ArrayList;

public class Juego {
	
	private ArrayList<Frame> frames = new ArrayList<Frame>();
	
	public Juego (int p_1a, int p_1b, int p_2a, int p_2b, int p_3a, int p_3b,
			int p_4a, int p_4b,int p_5a, int p_5b,int p_6a, int p_6b,
			int p_7a, int p_7b,int p_8a, int p_8b,int p_9a, int p_9b,
			int p_10a, int p_10b, int p_extra1, int p_extra2) {
		
		frames.add(0, new Frame(p_1a, p_1b));
		frames.add(1, new Frame(p_2a, p_2b));
		frames.add(2, new Frame(p_3a, p_3b));
		frames.add(3, new Frame(p_4a, p_4b));
		frames.add(4, new Frame(p_5a, p_5b));
		frames.add(5, new Frame(p_6a, p_6b));
		frames.add(6, new Frame(p_7a, p_7b));
		frames.add(7, new Frame(p_8a, p_8b));
		frames.add(8, new Frame(p_9a, p_9b));
		frames.add(9, new Frame(p_10a, p_10b));
		frames.add(10, new Frame(p_extra1, p_extra2));
	}

	public Frame getFrame(int p_i) {
		return ((Frame)this.frames.get(p_i-1));
	}

	public int puntuarJuego() {
		int puntaje = 0;
		Frame unFrame;
		Frame proxFrame;
		Frame proxFrame2;
		for (int i = 1; i<11; i++) {
			unFrame = this.getFrame(i);			
			puntaje = puntaje + unFrame.contabilizarPuntaje();
			
			if (i<9 && unFrame.esPleno()) {
//				puntaje = puntaje + unFrame.contabilizarPuntaje();				
				proxFrame = this.getFrame(i+1);				
				puntaje = puntaje + proxFrame.contabilizarPuntaje();
				
				proxFrame2 = this.getFrame(i+2);
				puntaje = puntaje + proxFrame2.contabilizarPuntaje();
				
//				if (proxFrame.esPleno()) {
//					proxFrame2 = this.getFrame(i+2);
//					puntaje = puntaje + proxFrame2.contabilizarPuntaje();
//				}
			}
		}
		return puntaje;
	}
	
	

}
