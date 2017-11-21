package tcp.model.entidades;

public class Parada {
	private String codigo;
	private int ordem;
	private String hora;
	private String diaSemana;
	private String diaMes;
	private String mes;
	private Endereco endereco;
	private String informacoes;
	
	public Parada(String codigo, int ordem, String hora, String diaSemana, String diaMes, String mes, Endereco endereco,
			String informacoes) {
		super();
		this.codigo = codigo;
		this.ordem = ordem;
		this.hora = hora;
		this.diaSemana = diaSemana;
		this.diaMes = diaMes;
		this.mes = mes;
		this.endereco = endereco;
		this.informacoes = informacoes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDiaMes() {
		return diaMes;
	}

	public void setDiaMes(String diaMes) {
		this.diaMes = diaMes;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	
	
}
