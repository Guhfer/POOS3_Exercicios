package model;

public interface IFila<T> {
	/**
	 * Insere o novo elemento no final da fila.
	 * 
	 * @param elemento - Objeto Gen�rico definido na declara��o. 
	 * @return - true se conseguiu inserir ou false caso tenha ocorrido algum erro.
	 */
	public abstract boolean enqueue(T elemento);
	
	/**
	 * Remove o primeiro elemento da fila.
	 * 
	 * @return primeiro elemento da fila 
	 */
	public abstract T dequeue();
	
	/**
	 * Remove o primeiro elemento priorit�rio da fila.
	 * 
	 * @return primeiro elemento priorit�rio da fila 
	 */
	public abstract T dequeuePrioridade();
	
	/**
	 * Informa se a fila est� ou n�o vazia.
	 * @return true se fila vazia ou false se a fila n�o estiver vazia.
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Informa se a fila est� ou n�o cheia.
	 * @return true se a fila esviver cheia ou false se a fila n�o estiver cheia.
	 */
	public abstract boolean isFull();
	
}
