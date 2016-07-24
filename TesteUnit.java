
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.Point;

/**
 * The test class TesteUnit.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TesteUnit
{
    private Rede rede;

    /**
     * Default constructor for test class TesteUnit
     */
    public TesteUnit()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        rede = new Rede();

        // Cadastros

        // Points (posições das cidades)

        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        Point point4 = new Point();
        Point point5 = new Point();
        point1.setLocation(-3.101944, -60.025);
        point2.setLocation(-27.596944, -48.549444);
        point3.setLocation(-23.548889, -46.638889);
        point4.setLocation(-8.054167, -34.881389);
        point5.setLocation(-16.68, -49.255);

        // UREs (String cidade, Point posicao)

        rede.cadastraURE("Manaus", point1);
        rede.cadastraURE("Florianópolis", point2);
        rede.cadastraURE("São Paulo", point3);
        rede.cadastraURE("Recife", point4);
        rede.cadastraURE("Goiânia", point5);

        // Lojas (String cidade, Point posicao)

        rede.cadastraLoja("Manaus", point1);
        rede.cadastraLoja("Florianópolis", point2);
        rede.cadastraLoja("São Paulo", point3);
        rede.cadastraLoja("Recife", point4);
        rede.cadastraLoja("Goiânia", point5);

        // Clientes (String nome)

        rede.cadastraCliente("Gabriel Souza Alves");
        rede.cadastraCliente("Luiza Santos Ferreira");
        rede.cadastraCliente("Leila Sousa Cunha");
        rede.cadastraCliente("Douglas Cunha Cardoso");
        rede.cadastraCliente("Gabrielly Alves Gomes");
        rede.cadastraCliente("Camila Barbosa Rodrigues");
        rede.cadastraCliente("Beatriz Martins Barbosa");
        rede.cadastraCliente("Gustavo Araujo Correia");
        rede.cadastraCliente("Gabrielle Rodrigues Rocha");
        rede.cadastraCliente("Paulo Ribeiro Ferreira");

        // Fornecedores (String nome)

        rede.cadastraFornecedor("Skol");
        rede.cadastraFornecedor("Brahma");
        rede.cadastraFornecedor("Duchesse de Bourgogne");

        rede.cadastraFornecedor("Coca-Cola");
        rede.cadastraFornecedor("Dolly");
        rede.cadastraFornecedor("Schin");

        rede.cadastraFornecedor("Boticário");
        rede.cadastraFornecedor("Dior");
        rede.cadastraFornecedor("Channel");

        rede.cadastraFornecedor("Colgate");
        rede.cadastraFornecedor("Oral B");
        rede.cadastraFornecedor("Sensodyne");

        rede.cadastraFornecedor("Ariel");
        rede.cadastraFornecedor("Comfort");
        rede.cadastraFornecedor("Ypê");

        rede.cadastraFornecedor("OMO");
        rede.cadastraFornecedor("P&G");

        rede.cadastraFornecedor("Nestlé");
        rede.cadastraFornecedor("Itamaraty");
        rede.cadastraFornecedor("Arcor");

        rede.cadastraFornecedor("Lacta");

        // Funcionários (String nome)

        rede.cadastraFuncionario("Larissa Costa Rodrigues");
        rede.cadastraFuncionario("Larissa Lima Barbosa");
        rede.cadastraFuncionario("Aline Fernandes Melo");
        rede.cadastraFuncionario("Renan Barros Ferreira");
        rede.cadastraFuncionario("Eduarda Rodrigues Carvalho");
        rede.cadastraFuncionario("Luís Santos Sousa");
        rede.cadastraFuncionario("Júlia Ribeiro Cunha");
        rede.cadastraFuncionario("Luis Goncalves Oliveira");
        rede.cadastraFuncionario("Letícia Barbosa Rodrigues");
        rede.cadastraFuncionario("Daniel Souza Araujo");

        // Gerentes de Estoque (String nome)

        rede.cadastraGerenteDeEstoque("Bianca Ribeiro Sousa");
        rede.cadastraGerenteDeEstoque("Gabrielly Fernandes Rocha");
        rede.cadastraGerenteDeEstoque("Enzo Pereira Rodrigues");
        rede.cadastraGerenteDeEstoque("Gabriel Lima Rodrigues");
        rede.cadastraGerenteDeEstoque("Lara Pereira Goncalves");

        // Produtos (String nome, String descricao, double precoCompra, double precoVenda,
        //              int codigoFornecedor, String tipo)

        rede.cadastraProduto("Cerveja", "Cerveja comum", 1.89, 2.89, 0, "Bebida");
        rede.cadastraProduto("Cerveja", "Cerveja preta", 1.68, 3.18, 1, "Bebida");
        rede.cadastraProduto("Cerveja", "Cerveja artesanal", 15.39, 30.39, 2, "Bebida");

        rede.cadastraProduto("Refrigerante", "Refrigerante de cola", 3.65, 6.65, 3, "Bebida");
        rede.cadastraProduto("Refrigerante", "Refrigerante de guaraná", 2.06, 4.06, 4, "Bebida");
        rede.cadastraProduto("Refrigerante", "Refrigerante de laranja", 1.99, 3.49, 5, "Bebida");

        rede.cadastraProduto("Perfume", "Perfume Malbec", 69.90, 119.90, 6, "HigieneEPerfumaria");
        rede.cadastraProduto("Perfume", "Perfume Farenheit", 259.00, 459.00, 7, "HigieneEPerfumaria");
        rede.cadastraProduto("Perfume", "Perfume N5", 419.97, 819.97, 8, "HigieneEPerfumaria");

        rede.cadastraProduto("Pasta de dente", "Pasta 12 horas de proteção", 2.84, 5.34, 9, "HigieneEPerfumaria");
        rede.cadastraProduto("Pasta de dente", "Pasta branqueadora", 2.95, 4.95, 10, "HigieneEPerfumaria");
        rede.cadastraProduto("Pasta de dente", "Pasta para dentes sensíveis", 4.57, 8.57, 11, "HigieneEPerfumaria");

        rede.cadastraProduto("Amaciante", "Amaciante Solução Total", 6.99, 12.99, 12, "Limpeza");
        rede.cadastraProduto("Amaciante", "Amaciante concentrado Energy", 7.00, 14.00, 13, "Limpeza");
        rede.cadastraProduto("Amacianta", "Amaciante Carinho concentrado", 4.57, 9.07, 14, "Limpeza");

        rede.cadastraProduto("Sabão em pó", "Sabão em pó Oxiespuma floral", 8.49, 15.99, 12, "Limpeza");
        rede.cadastraProduto("Sabão em pó", "Sabão em pó Multiação", 5.34, 10.34, 15, "Limpeza");
        rede.cadastraProduto("Sabão em pó", "Sabão em pó Ace", 6.39, 11.89, 16, "Limpeza");

        rede.cadastraProduto("Biscoito", "Biscoito Passatempo", 1.49, 1.99, 17, "Mercearia");
        rede.cadastraProduto("Biscoito", "Biscoito Look", 1.59, 2.59, 18, "Mercearia");
        rede.cadastraProduto("Biscoito", "Biscoito Danix", 1.35, 1.85, 19, "Mercearia");

        rede.cadastraProduto("Chocolate", "Chocolate Laka", 4.00, 7.50, 20, "Mercearia");
        rede.cadastraProduto("Chocolate", "Chocolate Tortuguita", 11.40, 21.90, 19, "Mercearia");
        rede.cadastraProduto("Chocolate", "Chocolate Sensação", 19.40, 38.90, 17, "Mercearia");

        // Associações

        // Funcionário-Loja (int codigoFuncionario, int codigoLoja)

        rede.associaFuncionarioLoja(0, 0);
        rede.associaFuncionarioLoja(1, 1);
        rede.associaFuncionarioLoja(2, 2);
        rede.associaFuncionarioLoja(3, 3);
        rede.associaFuncionarioLoja(4, 4);
        rede.associaFuncionarioLoja(5, 0);
        rede.associaFuncionarioLoja(6, 1);
        rede.associaFuncionarioLoja(7, 2);
        rede.associaFuncionarioLoja(8, 3);
        rede.associaFuncionarioLoja(9, 4);

        // Gerente de Estoque-URE (int codigoGerenteDeEstoque, int codigoURE)

        rede.associaGerenteDeEstoqueURE(0, 4);
        rede.associaGerenteDeEstoqueURE(1, 3);
        rede.associaGerenteDeEstoqueURE(2, 2);
        rede.associaGerenteDeEstoqueURE(3, 1);
        rede.associaGerenteDeEstoqueURE(4, 0);

        // Compras de Produtos (int codigoGerenteDeEstoque, int codigoProduto, int codigoURE, int quantidade)

        rede.compraProduto(4, 0, 0, 400);
        rede.compraProduto(3, 1, 1, 300);
        rede.compraProduto(2, 2, 2, 200);
        rede.compraProduto(1, 3, 3, 100);
        rede.compraProduto(0, 4, 4, 100);
 
        rede.compraProduto(0, 0, 4, 100);
        rede.compraProduto(1, 1, 3, 100);
        rede.compraProduto(2, 2, 2, 200);
        rede.compraProduto(3, 3, 1, 300);
        rede.compraProduto(4, 4, 0, 400);

        rede.compraProduto(4, 5, 0, 400);
        rede.compraProduto(3, 6, 1, 300);
        rede.compraProduto(2, 7, 2, 200);
        rede.compraProduto(1, 8, 3, 100);
        rede.compraProduto(0, 9, 4, 100);

        rede.compraProduto(0, 5, 4, 100);
        rede.compraProduto(1, 6, 3, 100);
        rede.compraProduto(2, 7, 2, 200);
        rede.compraProduto(3, 8, 1, 300);
        rede.compraProduto(4, 9, 0, 400);

        rede.compraProduto(4, 10, 0, 400);
        rede.compraProduto(3, 11, 1, 300);
        rede.compraProduto(2, 12, 2, 200);
        rede.compraProduto(1, 13, 3, 100);
        rede.compraProduto(0, 14, 4, 100);

        rede.compraProduto(0, 10, 4, 100);
        rede.compraProduto(1, 11, 3, 100);
        rede.compraProduto(2, 12, 2, 200);
        rede.compraProduto(3, 13, 1, 300);
        rede.compraProduto(4, 14, 0, 400);

        rede.compraProduto(4, 15, 0, 400);
        rede.compraProduto(3, 16, 1, 300);
        rede.compraProduto(2, 17, 2, 200);
        rede.compraProduto(1, 18, 3, 100);
        rede.compraProduto(0, 19, 4, 100);

        rede.compraProduto(0, 15, 4, 100);
        rede.compraProduto(1, 16, 3, 100);
        rede.compraProduto(2, 17, 2, 200);
        rede.compraProduto(3, 18, 1, 300);
        rede.compraProduto(4, 19, 0, 400);

        rede.compraProduto(4, 20, 0, 400);
        rede.compraProduto(3, 21, 1, 300);
        rede.compraProduto(2, 22, 2, 200);
        rede.compraProduto(1, 23, 3, 100);

        rede.compraProduto(0, 20, 4, 100);
        rede.compraProduto(1, 21, 3, 200);
        rede.compraProduto(2, 22, 2, 300);
        rede.compraProduto(3, 23, 1, 400);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCriacaoUREs()
    {
        assertNotNull(rede.getURE(0));
        assertNotNull(rede.getURE(1));
        assertNotNull(rede.getURE(2));
        assertNotNull(rede.getURE(3));
        assertNotNull(rede.getURE(4));
    }

    @Test
    public void testCriacaoLojas()
    {
        assertNotNull(rede.getLoja(0));
        assertNotNull(rede.getLoja(1));
        assertNotNull(rede.getLoja(2));
        assertNotNull(rede.getLoja(3));
        assertNotNull(rede.getLoja(4));
    }

    @Test
    public void testCriacaoClientes()
    {
        assertNotNull(rede.getCliente(0));
        assertNotNull(rede.getCliente(1));
        assertNotNull(rede.getCliente(2));
        assertNotNull(rede.getCliente(3));
        assertNotNull(rede.getCliente(4));
        assertNotNull(rede.getCliente(5));
        assertNotNull(rede.getCliente(6));
        assertNotNull(rede.getCliente(7));
        assertNotNull(rede.getCliente(8));
        assertNotNull(rede.getCliente(9));
    }

    @Test
    public void testCriacaoFornecedores()
    {
        assertNotNull(rede.getFornecedor(0));
        assertNotNull(rede.getFornecedor(1));
        assertNotNull(rede.getFornecedor(2));
        assertNotNull(rede.getFornecedor(3));
        assertNotNull(rede.getFornecedor(4));
        assertNotNull(rede.getFornecedor(5));
        assertNotNull(rede.getFornecedor(6));
        assertNotNull(rede.getFornecedor(7));
        assertNotNull(rede.getFornecedor(8));
        assertNotNull(rede.getFornecedor(9));
    }

    @Test
    public void testCriacaoFuncionarios()
    {
        assertNotNull(rede.getFuncionario(0));
        assertNotNull(rede.getFuncionario(1));
        assertNotNull(rede.getFuncionario(2));
        assertNotNull(rede.getFuncionario(3));
        assertNotNull(rede.getFuncionario(4));
        assertNotNull(rede.getFuncionario(5));
        assertNotNull(rede.getFuncionario(6));
        assertNotNull(rede.getFuncionario(7));
        assertNotNull(rede.getFuncionario(8));
        assertNotNull(rede.getFuncionario(9));
    }

    @Test
    public void testCriacaoGerentesDeEstoque()
    {
        assertNotNull(rede.getGerenteDeEstoque(0));
        assertNotNull(rede.getGerenteDeEstoque(1));
        assertNotNull(rede.getGerenteDeEstoque(2));
        assertNotNull(rede.getGerenteDeEstoque(3));
        assertNotNull(rede.getGerenteDeEstoque(4));
    }

    @Test
    public void testCriacaoProdutos()
    {
        assertNotNull(rede.getProduto(0));
        assertNotNull(rede.getProduto(1));
        assertNotNull(rede.getProduto(2));
        assertNotNull(rede.getProduto(3));
        assertNotNull(rede.getProduto(4));
        assertNotNull(rede.getProduto(5));
        assertNotNull(rede.getProduto(6));
        assertNotNull(rede.getProduto(7));
        assertNotNull(rede.getProduto(8));
        assertNotNull(rede.getProduto(9));
        assertNotNull(rede.getProduto(10));
        assertNotNull(rede.getProduto(11));
        assertNotNull(rede.getProduto(12));
        assertNotNull(rede.getProduto(13));
        assertNotNull(rede.getProduto(14));
        assertNotNull(rede.getProduto(15));
        assertNotNull(rede.getProduto(16));
        assertNotNull(rede.getProduto(17));
        assertNotNull(rede.getProduto(18));
        assertNotNull(rede.getProduto(19));
        assertNotNull(rede.getProduto(20));
        assertNotNull(rede.getProduto(21));
        assertNotNull(rede.getProduto(22));
        assertNotNull(rede.getProduto(23));
    }
    
    @Test
    public void testAssociacaoFuncionarioLoja()
    {
        assertEquals(rede.getLoja(0).getFuncionario(0).getCodigo(), 0);
        assertEquals(rede.getLoja(0).getFuncionario(1).getCodigo(), 5);
        assertEquals(rede.getLoja(1).getFuncionario(0).getCodigo(), 1);
        assertEquals(rede.getLoja(1).getFuncionario(1).getCodigo(), 6);
        assertEquals(rede.getLoja(2).getFuncionario(0).getCodigo(), 2);
        assertEquals(rede.getLoja(2).getFuncionario(1).getCodigo(), 7);
        assertEquals(rede.getLoja(3).getFuncionario(0).getCodigo(), 3);
        assertEquals(rede.getLoja(3).getFuncionario(1).getCodigo(), 8);
        assertEquals(rede.getLoja(4).getFuncionario(0).getCodigo(), 4);
        assertEquals(rede.getLoja(4).getFuncionario(1).getCodigo(), 9);
    }
    
    @Test
    public void testAssociacaoGerenteDeEstoqueURE()
    {
        assertEquals(rede.getURE(0).getGerenteDeEstoque().getCodigo(), 4);
        assertEquals(rede.getURE(1).getGerenteDeEstoque().getCodigo(), 3);
        assertEquals(rede.getURE(2).getGerenteDeEstoque().getCodigo(), 2);
        assertEquals(rede.getURE(3).getGerenteDeEstoque().getCodigo(), 1);
        assertEquals(rede.getURE(4).getGerenteDeEstoque().getCodigo(), 0);
    }
    
    @Test
    public void testCompraProdutos()
    {
        assertEquals(rede.getURE(0).getQuantidade(0), 400);
        assertEquals(rede.getURE(1).getQuantidade(1), 300);
        assertEquals(rede.getURE(2).getQuantidade(2), 400);
        assertEquals(rede.getURE(3).getQuantidade(3), 100);
        assertEquals(rede.getURE(4).getQuantidade(4), 100);

        assertEquals(rede.getURE(0).getQuantidade(4), 400);
        assertEquals(rede.getURE(1).getQuantidade(3), 300);
        assertEquals(rede.getURE(2).getQuantidade(2), 400);
        assertEquals(rede.getURE(3).getQuantidade(1), 100);
        assertEquals(rede.getURE(4).getQuantidade(0), 100);
        
        assertEquals(rede.getURE(0).getQuantidade(5), 400);
        assertEquals(rede.getURE(1).getQuantidade(6), 300);
        assertEquals(rede.getURE(2).getQuantidade(7), 400);
        assertEquals(rede.getURE(3).getQuantidade(8), 100);
        assertEquals(rede.getURE(4).getQuantidade(9), 100);

        assertEquals(rede.getURE(0).getQuantidade(9), 400);
        assertEquals(rede.getURE(1).getQuantidade(8), 300);
        assertEquals(rede.getURE(2).getQuantidade(7), 400);
        assertEquals(rede.getURE(3).getQuantidade(6), 100);
        assertEquals(rede.getURE(4).getQuantidade(5), 100);
        
        assertEquals(rede.getURE(0).getQuantidade(10), 400);
        assertEquals(rede.getURE(1).getQuantidade(11), 300);
        assertEquals(rede.getURE(2).getQuantidade(12), 400);
        assertEquals(rede.getURE(3).getQuantidade(13), 100);
        assertEquals(rede.getURE(4).getQuantidade(14), 100);

        assertEquals(rede.getURE(0).getQuantidade(14), 400);
        assertEquals(rede.getURE(1).getQuantidade(13), 300);
        assertEquals(rede.getURE(2).getQuantidade(12), 400);
        assertEquals(rede.getURE(3).getQuantidade(11), 100);
        assertEquals(rede.getURE(4).getQuantidade(10), 100);
        
        assertEquals(rede.getURE(0).getQuantidade(15), 400);
        assertEquals(rede.getURE(1).getQuantidade(16), 300);
        assertEquals(rede.getURE(2).getQuantidade(17), 400);
        assertEquals(rede.getURE(3).getQuantidade(18), 100);
        assertEquals(rede.getURE(4).getQuantidade(19), 100);

        assertEquals(rede.getURE(0).getQuantidade(19), 400);
        assertEquals(rede.getURE(1).getQuantidade(18), 300);
        assertEquals(rede.getURE(2).getQuantidade(17), 400);
        assertEquals(rede.getURE(3).getQuantidade(16), 100);
        assertEquals(rede.getURE(4).getQuantidade(15), 100);
        
        assertEquals(rede.getURE(0).getQuantidade(20), 400);
        assertEquals(rede.getURE(1).getQuantidade(21), 300);
        assertEquals(rede.getURE(2).getQuantidade(22), 500);
        assertEquals(rede.getURE(3).getQuantidade(23), 100);
        
        assertEquals(rede.getURE(1).getQuantidade(23), 400);
        assertEquals(rede.getURE(2).getQuantidade(22), 500);
        assertEquals(rede.getURE(3).getQuantidade(21), 200);
        assertEquals(rede.getURE(4).getQuantidade(20), 100);
    }
    
    @Test
    public void testEncomendaProdutoURE() {
        //TODO: Fazer o testa da transferência depois de arrumar ela
    }
}
