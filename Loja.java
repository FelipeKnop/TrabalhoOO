import java.util.*;

public class Loja {
    private int codigo;
    private double[] posicao;
    private List<Funcionario> funcionarios;
    private List<Produto> produtos;
    private double lucro;
    
    public Loja (int codigo, double[] posicao) {
        this.codigo = codigo;
        this.posicao = posicao;
        this.funcionarios = new ArrayList<Funcionario>();
        this.produtos = new ArrayList<Produto>();
        this.lucro = 0;
    }
}