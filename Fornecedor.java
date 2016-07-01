import java.util.*;

public class Fornecedor {
    private int codigo;
    private String nome;
    private List<Produto> produtos;
    private List<Double> precosCompra;
    
    public Fornecedor (int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        produtos = new ArrayList<Produto>();
        precosCompra = new ArrayList<Double>();
    }
    
    
}