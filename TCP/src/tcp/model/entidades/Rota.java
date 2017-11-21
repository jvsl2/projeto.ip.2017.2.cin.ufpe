package tcp.model.entidades;
import tcp.model.repositorios.*;
import tcp.model.repositorios.RepositorioTraslado;

public class Rota {
	private String codigo;
	private RepositorioTraslado translados;
	private Funcionario motorista;
	private Carro carro;
	private String informacoes;
	
	public Rota(String codigo, RepositorioTraslado translados, Funcionario motorista, Carro carro, String informacoes) {
		super();
		this.codigo = codigo;
		this.translados = translados;
		this.motorista = motorista;
		this.carro = carro;
		this.informacoes = informacoes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public RepositorioTraslado getTranslados() {
		return translados;
	}

	public void setTranslados(RepositorioTraslado translados) {
		this.translados = translados;
	}

	public Funcionario getMotorista() {
		return motorista;
	}

	public void setMotorista(Funcionario motorista) {
		this.motorista = motorista;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	
}
