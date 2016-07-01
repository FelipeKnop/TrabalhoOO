public abstract class Produto {
    private int codigo;
    private String nome;
    private double precoVenda;
    private String descricao;
    
    public Produto (int codigo, String nome, double precoVenda, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
    }
}