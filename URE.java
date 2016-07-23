import java.awt.Point;
import java.util.ArrayList;

public class URE {
    
    private int codigo;
    private String cidade;
    private Point posicao;
    private double gasto;
    private ArrayList<Produto> produtos;
    private GerenteDeEstoque gerenteDeEstoque;

    public URE(int codigo, String cidade, Point posicao) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.posicao = posicao;
        this.gasto = 0;
        this.produtos = new ArrayList<>();
        this.gerenteDeEstoque = null;
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

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
    
    public void aumentaGasto(double aumento) {
        gasto += aumento;
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

    public GerenteDeEstoque getGerenteDeEstoque() {
        return gerenteDeEstoque;
    }

    public void setGerenteDeEstoque(GerenteDeEstoque gerenteDeEstoque) {
        this.gerenteDeEstoque = gerenteDeEstoque;
    }
    
    public boolean isGerenteDeEstoque(int codigoGerenteDeEstoque) {
        return this.gerenteDeEstoque.getCodigo() == codigoGerenteDeEstoque;
    }
}