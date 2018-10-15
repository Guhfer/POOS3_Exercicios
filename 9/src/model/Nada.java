package model;

public class Nada {
	private boolean prioritario;
	
	public Nada(boolean prioritario) {
		this.prioritario = prioritario;
	}
	public Nada() {
		this.prioritario = false;
	}
	
	public boolean isPrioritario() {
		return prioritario;
	}
	
	public void setPrioritario(boolean prioritario) {
		this.prioritario = prioritario;
	}
	@Override
	public String toString() {
		return String.format("Sou nada%s", isPrioritario()? " mas com prioridade!": "!");
	}
	
	
}
