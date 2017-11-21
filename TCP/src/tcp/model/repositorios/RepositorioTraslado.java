package tcp.model.repositorios;
import tcp.model.entidades.Traslado;

public interface RepositorioTraslado {
	
	public void inserir(Traslado traslado);
	public Traslado obter(Traslado traslado);
	public void atualizar(Traslado traslado);
	public void remover(Traslado traslado);
}
