package tcp.model.excessoes;
import tcp.model.entidades.Parada;

public class SemEspacoException extends Exception{

	private Parada parada;
	
	public SemEspacoException(Parada parada) {
		super("Não há mais espaço!");
		this.parada = parada;
		
	}
}
