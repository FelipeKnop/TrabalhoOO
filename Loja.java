import java.util.*;

public class Loja {
    private int codigo;
    private double[] posicao;
    private List<Funcionario> funcionarios;
    private List<Produto> produtos;
    private List<Integer> quantidades;
    private double lucro;
    
    public Loja (int codigo, double[] posicao) {
        this.codigo = codigo;
        this.posicao = posicao;
        this.funcionarios = new ArrayList<Funcionario>();
        this.produtos = new ArrayList<Produto>();
        quantidades = new ArrayList<Integer>();
        this.lucro = 0;
    }
    
    public int getCodigo () {
        return this.codigo;
    }
    
    public double[] getPosicao () {
        return this.posicao;
    }
    
    public void setPosicao (double[] posicao) {
        this.posicao = posicao;
    }
    
    public void setPosicao (double posicaoX, double posicaoY) {
        double[] aux = {posicaoX, posicaoY};
        this.posicao = aux;
    }
    
    public int getQuantidade (int codigo) {
        return quantidades.get(codigo);
    }
    
    public double getLucro () {
        return this.lucro;
    }
    
    public void setLucro (double lucro) {
        this.lucro = lucro;
    }
    
    public Funcionario getFuncionario (int codigo) {
        return funcionarios.get(codigo);
    }
    
    public Produto getProduto (int codigo) {
        return produtos.get(codigo);
    }
    
    public void cadastraProduto (Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }
    
    public void listaProdutos () {
        for (Produto produto:produtos) {
            produto.listaProduto();
        }
    }
    
    public int consultaEstoque (int codigoFuncionario, int codigoProduto) {
        Funcionario funcionario = funcionarios.get(codigoFuncionario);
        Produto produto = produtos.get(codigoProduto);
        
        if (funcionario != null) {
            if (produto != null) {
                int quantidade = this.getQuantidade(codigoProduto);
                System.out.println("Existem " + quantidade + " unidades desse produto");
                return quantidade;
            } else {
                System.out.println("Não existe esse produto no estoque. Solicite à URE");
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Funcionário inválido");
        }
    }
    
    public void realizaVenda (int codigoCliente, int codigoProduto, int quantidade) {
        
    }
}