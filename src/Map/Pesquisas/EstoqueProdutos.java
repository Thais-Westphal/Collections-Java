package Map.Pesquisas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos
{
    private Map <Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos()
    {
        this.estoqueProdutosMap = new HashMap <> () ;
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco)
    {
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos()
    {
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque()
    {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty())
        {
            for (Produtos p : estoqueProdutosMap.values())
            {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produtos obterProdutoMaisCaro()
    {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty())
        {
            for (Produtos p : estoqueProdutosMap.values())
            {
                if (p.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = p;
                }

            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args)
    {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L,"Produto A", 10, 5.0);
        estoque.adicionarProduto(2L,"Produto B", 5, 10.0);
        estoque.adicionarProduto(3L,"Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }

}
