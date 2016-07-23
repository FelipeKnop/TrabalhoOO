import java.util.ArrayList;

public class Fornecedor {
    
    private int codigo;
    private String nome;
    private ArrayList<Produto> produtos;

    public Fornecedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}