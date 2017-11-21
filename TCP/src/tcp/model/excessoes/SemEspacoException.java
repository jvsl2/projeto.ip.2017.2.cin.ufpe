package tcp.model.excessoes;
import tcp.model.entidades.Parada;

public class SemEspacoException extends Exception{

	private Parada parada;
	
	public SemEspacoException(Parada parada) {
		super("N�o h� mais espa�o!");
		this.parada = parada;
		
	}
}
