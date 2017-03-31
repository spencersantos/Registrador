
public class Venda {
	private Produto produto;
	private Vendedor vendedor;
	private int quantidadeDeItens;
	private double valor;
	private double valorComissao;

	public double calcularValor() {
		if (produto.isPromocao() == false) {
			valor = produto.getValorVenda() * this.quantidadeDeItens;
			return valor;
		} else {
			valor = produto.getValorVenda() * this.quantidadeDeItens;
			valor = valor - (valor * (produto.getValorDesconto() / 100));
			if (valor < produto.getValorCusto() * this.quantidadeDeItens) {
				System.out.println(
						"Valor a baixo do de custo. venda invalida, valor arredondado para o desconto maximo:");
				valor = produto.getValorCusto() * this.quantidadeDeItens;
			}
			return valor;
		}

	}

	public double calcularComissao() {
		valorComissao = (0.10) * valor;
		if (produto.isPromocao() == true) {
			valorComissao = valorComissao / 2;
		}
		return valorComissao;

	}

	public void imprimir() {
		System.out.println("Codigo do vendedor: " + vendedor.getCodigo() + "\nNome: " + vendedor.getNome()
				+ "\nComissao: " + valorComissao);
		System.out.println("Quantidade de itens: " + quantidadeDeItens);
		System.out.println("Codigo do produto: " + produto.getCodigo());
		System.out.println("Descrição do Produto: " + produto.getDescricao());
		System.out.println("Valor do Produto: " + produto.getValorVenda());
		System.out.println("Está em promoção?");
		if (produto.isPromocao() == true) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		System.out.println("Valor de desconto sobre o produto: " + (produto.getValorVenda() - produto.getValorCusto()));
		System.out.printf("Valor a pagar:%d\n", calcularValor());

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
