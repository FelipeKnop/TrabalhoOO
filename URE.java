import java.awt.Point;
import java.util.LinkedList;
import java.util.Iterator;

public class URE {
    
    private int codigo;
    private String cidade;
    private Point posicao;
    private double gasto;
    private LinkedList<Produto> produtos;
    private GerenteDeEstoque gerenteDeEstoque;

    public URE(int codigo, String cidade, Point posicao) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.posicao = posicao;
        this.gasto = 0;
        this.produtos = new LinkedList<>();
        this.gerenteDeEstoque = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Point getPosicao() {
        return posicao;
    }

    public void setPosicao(Point posicao) {
        this.posicao = posicao;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
    
    public void aumentaGasto(double valor) {
        gasto += valor;
    }
    
    public void diminuiGasto(double valor) {
        gasto -= valor;
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }
    
    public Produto getProduto(int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void addProduto(Produto produto) {
        produtos.addLast(produto); // Adiciona na última posição
    }
    
    public void addProdutoFirst(Produto produto) {
        produtos.addFirst(produto); // Adiciona na primeira posição
    }

    public GerenteDeEstoque getGerenteDeEstoque() {
        return gerenteDeEstoque;
    }

    public void setGerenteDeEstoque(GerenteDeEstoque gerenteDeEstoque) {
        this.gerenteDeEstoque = gerenteDeEstoque;
    }
    
    public boolean isGerenteDeEstoque(int codigoGerenteDeEstoque) {
        return this.gerenteDeEstoque.getCodigo() == codigoGerenteDeEstoque;
    }
    
    public int getQuantidade(int codigoProduto) {
        int quantidade = 0;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public boolean isDisponivel(int codigoProduto, int quantidade) {
        int quantidadeDisponivel = getQuantidade(codigoProduto);
        if (quantidadeDisponivel - 100 >= quantidade) {
            return true;
        } else {
            return false;
        }
    }
    
    public void aumentaProdutos(Produto produto, int quantidade) {
        while (quantidade != 0) {
            addProduto(produto);
            quantidade--;
        }
    }
    
    public void aumentaProdutosComPrioridade(Produto produto, int quantidade) {
        while (quantidade != 0) {
            addProdutoFirst(produto);
            quantidade--;
        }
    }
    
    public void diminuiProdutos(int codigoProduto, int quantidade) {
        Iterator<Produto> iterator = produtos.iterator();
        while(iterator.hasNext() && quantidade != 0) {
            Produto produto = iterator.next();
            if (produto.getCodigo() == codigoProduto) {
                iterator.remove();
                quantidade--;
            }
        }
    }
    
    public LinkedList<Integer> getCodigosProdutos() {
        LinkedList<Integer> codigos = new LinkedList<>();
        for (Produto produto : produtos) {
            int codigoProduto = produto.getCodigo();
            if (!codigos.contains(codigoProduto)) {
                codigos.add(codigoProduto);
            }
        }
        return codigos;
    }
    
    public void listaProdutos() {
        System.out.println("\nProdutos:");
        LinkedList<Integer> codigos = getCodigosProdutos();
        for (Integer codigo : codigos) {
            Produto produto = getProduto(codigo);
            produto.listaProduto();
            System.out.println("Quantidade: " + getQuantidade(codigo));
        }
    }
}