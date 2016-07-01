import java.util.*;

public class URE {
    private String cidade;
    private double[] posicao;
    private List<Produto> produtos;
    private List<Integer> quantidades;
    private GerenteDeEstoque gerenteDeEstoque;
    
    public URE (String cidade, double[] posicao) {
        this.cidade = cidade;
        this.posicao = posicao;
        produtos = new ArrayList<Produto>();
        quantidades = new ArrayList<Integer>();
    }
}