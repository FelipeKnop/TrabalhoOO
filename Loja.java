import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

public class Loja {

    private int codigo;
    private String cidade;
    private Point posicao;
    private double lucro;
    private ArrayList<Produto> produtos;
    private ArrayList<Funcionario> funcionarios;

    public Loja(int codigo, String cidade, Point posicao) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.posicao = posicao;
        this.lucro = 0;
        this.produtos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
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

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    
    public void aumentaLucro(double valor) {
        lucro += valor;
    }
    
    public void diminuiLucro(double valor) {
        lucro -= valor;
    }

    public ArrayList<Produto> getProdutos() {
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

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public Funcionario getFuncionario(int codigoFuncionario) {
        for(Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == codigoFuncionario) {
                return funcionario;
            }
        }
        return null;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public boolean isFuncionario(int codigoFuncionario) {
        return getFuncionario(codigoFuncionario) != null;
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
    
    public void aumentaProdutos(Produto produto, int quantidade) {
        while (quantidade != 0) {
            addProduto(produto);
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
    
    private ArrayList<Integer> getCodigosProdutos() {
        ArrayList<Integer> codigos = new ArrayList<>();
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
        ArrayList<Integer> codigos = getCodigosProdutos();
        for (Integer codigo : codigos) {
            Produto produto = getProduto(codigo);
            produto.listaProduto();
            System.out.println("Quantidade: " + getQuantidade(codigo));
        }
    }
}