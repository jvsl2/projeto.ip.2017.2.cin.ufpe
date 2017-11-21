package tcp.model.repositorios;
import tcp.model.entidades.Rota;

public interface RepositorioRota {
	
	public void inserir(Rota rota);
	public Rota obter(Rota rota);
	public void atualizar(Rota rota);
	public void remover(Rota rota);
}
