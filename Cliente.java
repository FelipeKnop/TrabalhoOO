import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Produto> compras;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.compras = new ArrayList<>();
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

    public ArrayList<Produto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Produto> compras) {
        this.compras = compras;
    }
    
    public void addCompra(Produto produto) {
        compras.add(produto);
    }
    
    public int getQuantidade(int codigoProduto) {
        int quantidade = 0;
        for (Produto produto : compras) {
            if (produto.getCodigo() == codigoProduto) {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public void aumentaProdutos(Produto produto, int quantidade) {
        while (quantidade != 0) {
            addCompra(produto);
            quantidade--;
        }
    }
    
}