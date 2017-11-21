package tcp.model.repositorios;
import tcp.model.entidades.Parada;
import tcp.model.excessoes.NaoEncontradoException;
import tcp.model.excessoes.SemEspacoException;

public interface RepositorioParada{
	
	 void inserir(Parada parada) throws SemEspacoException;
	 Parada obter(Parada parada) throws NaoEncontradoException;
	 void atualizar(Parada parada);
	 void remover(Parada parada) throws NaoEncontradoException;
	
}
