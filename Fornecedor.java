import java.util.*;

public class Fornecedor {
    private int codigo;
    private String nome;
    private List<Produto> produtos;
    
    public Fornecedor (int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        produtos = new ArrayList<Produto>();
    }
    
    public int getCodigo () {
        return this.codigo;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public Produto getProduto (int codigo) {
        return produtos.get(codigo);
    }
    
    public void cadastraProduto (Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }
}