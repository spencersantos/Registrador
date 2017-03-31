
public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto("1515", "carro", 1000, 800, false);
		Vendedor vendedor = new Vendedor("Zé", "rua a,45", "123");
		Venda venda = new Venda();

		venda.setProduto(produto);
		venda.setVendedor(vendedor);
		venda.setQuantidadeDeItens(2);
		System.out.println("Valor da venda: " + venda.calcularValor());
		System.out.println("Valor da Comissão: " + venda.calcularComissao());

		Produto produto2 = new Produto("1515", "carro", 100, 80, true);
		Vendedor vendedor2 = new Vendedor("Zé", "rua a,45", "123");
		Venda venda2 = new Venda();

		venda2.setProduto(produto2);
		venda2.setVendedor(vendedor2);
		venda2.setQuantidadeDeItens(3);
		produto2.setValorDesconto(10);
		;
		System.out.println("Valor da venda: " + venda2.calcularValor());
		System.out.println("Valor da Comissão: " + venda2.calcularComissao());

		Venda venda3 = new Venda();
		venda3.setProduto(produto2);
		venda3.setVendedor(vendedor2);
		venda3.setQuantidadeDeItens(2);
		produto2.setValorDesconto(30);
		System.out.println("Valor da venda: " + venda3.calcularValor());
		System.out.println("Valor da Comissão: " + venda3.calcularComissao());

	}

}
