package fila;
public class FilaCheiaException extends RuntimeException {

	public FilaCheiaException(){
		super();
	}

	public FilaCheiaException(String mensagem){
		super(mensagem);
	}

	public FilaCheiaException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
}