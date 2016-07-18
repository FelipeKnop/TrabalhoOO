public class Teste {
    public static Rede criarTudo () {
        Rede rede1 = new Rede();
        
        double[] posicao1 = {-3.101944, -60.025};
        double[] posicao2 = {-27.596944, -48.549444};
        double[] posicao3 = {-23.548889, -46.638889};
        double[] posicao4 = {-8.054167, -34.881389};
        double[] posicao5 = {-16.68, -49.255};
        rede1.cadastraURE(posicao1, "Manaus");
        rede1.cadastraURE(posicao2, "Florianópolis");
        rede1.cadastraURE(posicao3, "São Paulo");
        rede1.cadastraURE(posicao4, "Recife");
        rede1.cadastraURE(posicao5, "Goiânia");
        
        rede1.cadastraGerenteDeEstoque("Warley");
        rede1.cadastraGerenteDeEstoque("Pedro");
        rede1.cadastraGerenteDeEstoque("Bruno");
        rede1.cadastraGerenteDeEstoque("André");
        rede1.cadastraGerenteDeEstoque("Lucas");
        
        rede1.cadastraLoja(posicao1);
        rede1.cadastraLoja(posicao2);
        rede1.cadastraLoja(posicao3);
        rede1.cadastraLoja(posicao4);
        rede1.cadastraLoja(posicao5);
        
        rede1.cadastraCliente("Warley");
        rede1.cadastraCliente("Pedro");
        rede1.cadastraCliente("Bruno");
        rede1.cadastraCliente("André");
        rede1.cadastraCliente("Lucas");
        
        rede1.cadastraFornecedor("Warley");
        rede1.cadastraFornecedor("Pedro");
        rede1.cadastraFornecedor("Bruno");
        rede1.cadastraFornecedor("André");
        rede1.cadastraFornecedor("Lucas");
        
        rede1.cadastraProduto("Cachaça", 5, "Te deixa loco", "Bebida");
        rede1.cadastraProduto("Cerveja", 3, "Te deixa menos loco", "Bebida");
        
        rede1.cadastraProduto("Maçã", 1.5, "Te deixa feliz", "Feira");
        rede1.cadastraProduto("Banana", 0.2, "Te deixa monstro", "Feira");
        
        rede1.cadastraProduto("Sabonete", 8, "Te deixa limpo", "HigieneEPerfumaria");
        rede1.cadastraProduto("Perfume", 50, "Te deixa cheiroso", "HigieneEPerfumaria");
        
        rede1.cadastraProduto("Veja", 13.53, "Deixa sua casa limpa", "Limpeza");
        rede1.cadastraProduto("Óleo de peroba", 15, "Te deixa cara de pau", "Limpeza");
        
        rede1.cadastraProduto("Ketchup", 2.5, "Te deixa feliz", "Mercearia");
        rede1.cadastraProduto("Danix", 0.5, "Te deixa triste", "Mercearia");
        
        rede1.cadastraFuncionario("Warley");
        rede1.cadastraFuncionario("Pedro");
        rede1.cadastraFuncionario("Bruno");
        rede1.cadastraFuncionario("André");
        rede1.cadastraFuncionario("Lucas");
        
        return rede1;
    }
    
    public static void cadastraProdutos(Rede rede) {
        rede.cadastraProdutoFornecedor(0, 1, 2.50);
        rede.cadastraProdutoFornecedor(1, 3, 1.50);
        rede.cadastraProdutoFornecedor(2, 4, 0.50);
        rede.cadastraProdutoFornecedor(3, 1, 0.50);
        rede.cadastraProdutoFornecedor(4, 2, 4);
        rede.cadastraProdutoFornecedor(5, 3, 1);
        rede.cadastraProdutoFornecedor(6, 1, 13.52);
        rede.cadastraProdutoFornecedor(7, 4, 7.5);
        rede.cadastraProdutoFornecedor(8, 0, 2.50);
        rede.cadastraProdutoFornecedor(9, 0, 0);
        
        rede.cadastraProdutoURE(0, 1);
        rede.cadastraProdutoURE(1, 3);
        rede.cadastraProdutoURE(2, 4);
        rede.cadastraProdutoURE(3, 1);
        rede.cadastraProdutoURE(4, 2);
        rede.cadastraProdutoURE(5, 3);
        rede.cadastraProdutoURE(6, 1);
        rede.cadastraProdutoURE(7, 4);
        rede.cadastraProdutoURE(8, 0);
        rede.cadastraProdutoURE(9, 0);
    }
}