
public class Vendedor {

	private String nome;
	private String codigo;
	private double comissao;
	private String endereco;

	public Vendedor(String nome, String endereco, String codigo) {
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getComissao() {

		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
