package tcp.model.entidades;
import tcp.model.repositorios.*;
import tcp.model.repositorios.RepositorioParada;

public class Traslado {
	private String codigo;
	private RepositorioParada paradas;
	private String informacoes;
	
	public Traslado(String codigo, RepositorioParada paradas, String informacoes) {
		super();
		this.codigo = codigo;
		this.paradas = paradas;
		this.informacoes = informacoes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public RepositorioParada getParadas() {
		return paradas;
	}

	public void setParadas(RepositorioParada paradas) {
		this.paradas = paradas;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	
	
}
