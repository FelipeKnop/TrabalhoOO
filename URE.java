import java.util.*;

public class URE {
    private int codigo;
    private double[] posicao;
    private String cidade;
    private List<Produto> produtos;
    private List<Integer> quantidades;
    private GerenteDeEstoque gerenteDeEstoque;
    
    public URE (int codigo, double[] posicao) {
        this.codigo = codigo;
        this.posicao = posicao;
        this.cidade = cidade;
        produtos = new ArrayList<Produto>();
        quantidades = new ArrayList<Integer>();
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
    
    public String getCidade () {
        return this.cidade;
    }
    
    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
    
    public Produto getProduto (int codigo) {
        return produtos.get(codigo);
    }
    
    public int getQuantidade (int codigo) {
        return quantidades.get(codigo);
    }
    
    public GerenteDeEstoque getGerenteDeEstoque () {
        return this.gerenteDeEstoque;
    }
    
    public void setGerenteDeEstoque (GerenteDeEstoque gerenteDeEstoque) {
        this.gerenteDeEstoque = gerenteDeEstoque;
    }
    
    public void comprarProduto (int codigoProduto, int codigoFornecedor, int quantidade) {
        //Setar preço de compra do produto
    }
}