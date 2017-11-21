package tcp.model.repositorios;
import tcp.model.entidades.Parada;
import tcp.model.excessoes.NaoEncontradoException;
import tcp.model.excessoes.SemEspacoException;



public class RepositorioParadaArray implements RepositorioParada {
	
	private Parada[] paradas;
	private int indice = 100;
	
	public RepositorioParadaArray(int indice) {
		paradas = new Parada[indice];
		this.indice = indice;
	}

	public void inserir(Parada parada) throws SemEspacoException{
		if(indice >= 100) {
			throw new SemEspacoException(parada);
		}
		else {
			paradas[indice] = parada;
			indice++;
		}
	}
	
	public Parada obter(Parada parada) throws NaoEncontradoException {
		return parada;
	}
	
	public void atualizar(Parada parada) {
		
	}
	
	public void remover(Parada parada) throws NaoEncontradoException {
		
	}
}
