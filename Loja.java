import java.awt.Point;
import java.util.ArrayList;

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
    
    public void aumentaLucro(double aumento) {
        lucro += aumento;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
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
    
    public Funcionario getFuncionario(int indiceFuncionario) {
        return funcionarios.get(indiceFuncionario);
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}