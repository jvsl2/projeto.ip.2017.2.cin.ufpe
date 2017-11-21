package tcp.model.repositorios;
import tcp.model.entidades.Parada;
import tcp.model.excessoes.NaoEncontradoException;
import tcp.model.excessoes.SemEspacoException;

public class RepositorioParadaLista implements RepositorioParada{

	private Parada parada;
	private RepositorioParadaLista proxima;
	
	public void inserir(Parada parada) throws SemEspacoException {
		if(this.parada == null) {
			this.parada = parada;
			this.proxima = new RepositorioParadaLista();	
		}
		else {
			this.proxima.inserir(parada);
		}
	}
	
	public Parada obter(Parada parada) {
		return parada;
	}
	
	public void atualizar(Parada parada) {
		
	}
	
	public void remover(Parada parada) throws NaoEncontradoException{
		if(this.parada != null) {
			if(this.parada.equals(parada)) {
				this.parada = this.proxima.proxima.parada;
				this.proxima = this.proxima.proxima;
			}
			else {
				this.proxima.remover(parada);
			}
		}
		else {
			throw new NaoEncontradoException();
		}
		
	}
}
