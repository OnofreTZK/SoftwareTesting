package fila;
public interface IFila {

	// return the size of the queue
	public int tamanho();

	public boolean estaVazia();

	public boolean estaCheia();

	// insert an element into the queue 
	public void insereNaFila(Object obj) throws FilaCheiaException;

	// removes an element from the queue 
	public Object removeDaFila() throws FilaVaziaException; 

}