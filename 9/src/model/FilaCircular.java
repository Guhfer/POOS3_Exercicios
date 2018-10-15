package model;

public class FilaCircular implements IFila<Nada> {

	private final int DEFAULT = 10;
	private Nada[] filaCircular;
	private int inicio;
	private int fim;
	private int tamMax;
	private int tamAtual;
	
	public FilaCircular() {
		tamMax = DEFAULT;
		init();
	}
	
	public FilaCircular(int tamMax) {
		if(tamMax > 0) {
			this.tamMax = tamMax;
		}else {
			this.tamMax = DEFAULT;
		}
		init();
	}
	
	private void init() {
		filaCircular = new Nada[tamMax];
		inicio = 0;
		fim = 0;
		tamAtual = 0;
	}
	
	private void dobrarFila() {
		
		Nada novo[] = new Nada[this.tamMax*2];
		for(int i=0; i<this.tamMax; i++) {
			novo[i] = filaCircular[i];
		}
		this.tamMax *= 2;
		this.filaCircular = novo;
	}

	@Override
	public boolean enqueue(Nada elemento) {
		
		boolean ret = false;
		if(elemento != null) {
			if(this.fim == this.tamMax) {
				dobrarFila();
			}
			filaCircular[fim] = elemento;
			if(fim == tamMax-1) {
				fim = 0;
			}else {
				fim += 1;
			}
			tamAtual += 1;
			ret = true;
		}
		return ret;
	}


	@Override
	public Nada dequeue() {
		
		Nada nd = null;
		
		if(!isEmpty()) {
			nd = filaCircular[inicio];
			inicio = inicio == tamMax-1 ? 0 : inicio + 1;
			tamAtual -= 1;
		}
		return nd;
	}

	@Override
	public Nada dequeuePrioridade() {
		
		Nada nd = null;
		boolean ret;
		Fila aux = new Fila(this.tamAtual);
		
		if(!isEmpty()) {
			ret = false;
			while(!this.isEmpty() && !ret) {
				nd = dequeue();
				if(nd.isPrioritario()) {
					ret = true;
				}else {
					aux.enqueue(nd);
				}
			}
			while(!this.isEmpty()) {
				aux.enqueue(this.dequeue());
			}
			while(!aux.isEmpty()) {
				this.enqueue(aux.dequeue());
			}
			if(!ret) {
				nd = this.dequeue();
			}
		}
		return nd;
	
	}

	@Override
	public boolean isEmpty() {

		return tamAtual == 0;	
	}

	@Override
	public boolean isFull() {
		
		return tamAtual == tamMax;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < tamAtual; i++) {
			builder.append(filaCircular[i].toString());
			builder.append("\n");
			
		}
		return builder.toString();
	
	}

}
