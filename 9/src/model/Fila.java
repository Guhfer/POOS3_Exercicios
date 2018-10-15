package model;

public class Fila implements IFila<Nada>  {
	private final int DEFAULT = 10;
	private Nada[] fila;
	private int inicio;
	private int fim;
	private int tamMax;
	
	public Fila() {
		tamMax = DEFAULT;
		init();
	}
	
	public Fila(int tamMax) {
		if(tamMax > 0) {
			this.tamMax = tamMax;
		}else {
			this.tamMax = DEFAULT;
		}
		init();
	}
	
	private void init() {
		fila = new Nada[tamMax];
		inicio = 0;
		fim = -1;
	}
	
	private void dobrarFila() {
		
		Nada novo[] = new Nada[this.tamMax*2];
		for(int i=0; i<this.tamMax; i++) {
			novo[i] = fila[i];
		}
		this.tamMax *= 2;
		this.fila = novo;
	}

	@Override
	public boolean enqueue(Nada elemento) {
		
		boolean ret = false;
		if(elemento != null) {
			if(this.fim == this.tamMax) {
				dobrarFila();
			}
			fim += 1;
			fila[fim] = elemento; 
			ret = true;
		}
		return ret;
	}


	@Override
	public Nada dequeue() {
		
		Nada nd = null;
		if(!isEmpty()) {
			nd = fila[inicio];
			inicio = (inicio == tamMax-1) ? 0 : inicio + 1;
			fim -= 1;
		}
		return nd;
	}

	@Override
	public Nada dequeuePrioridade() {
		
		Nada nd = null;
		int i;
		
		if(!isEmpty()) {
			i = inicio;
			do {
				if(fila[i].isPrioritario()) {
					nd = fila[i];
					inicio += 1;
					while(i > inicio-1) {
						fila[i] = fila[i-1];
						i -= 1;
					}
				}else {
					i++;
				}
			}while(nd == null && i < tamMax);
			
			if(nd == null) {
				nd = dequeue();
			}
		}
		return nd;
	
	}

	@Override
	public boolean isEmpty() {

		return fim < inicio;	
	}

	@Override
	public boolean isFull() {
		
		return fim == tamMax-1;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i <= fim; i++) {
			builder.append(fila[i].toString());
			builder.append("\n");
			
		}
		return builder.toString();
	
	}
	
	
}
