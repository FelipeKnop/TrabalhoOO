------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
    
Classes:
    Rede
        Atributos:  - UREs[]
                    - Clientes[]
                    - Fornecedores[]
                    - Lojas[]
                    - Produtos[]
                    
        Métodos:    - Cadastrar produto
                        Tipos de produtos: bebidas, mercearia, limpeza, higiene & perfumaria, e feira
                        Cada item de um determinado produto possui os atributos necessários para a administração das Filiais
                        
                    - Informar o total de itens nas UREs e seus valores (Código URE)
                    
                    - Informar o lucro de cada loja (Código da loja)
                    
                    - Transferir itens de produtos entre UREs (Código URE Origem, código URE Destino, quantidade)
                            Deve dar prioridade a URE mais próxima
                            Cada URE não pode ter menos de 100 itens de cada tipo de produto
                            
                    - Transferir itens de produtos de UREs pra lojas (Código URE, código da loja, quantidade)
                            Loja deve ter uma fila de prioridade para ser abastecida pelas UREs, ordenada por distância
                            
                    - Chamar função da URE de comprar produto do fornecedor (Código do gerente de estoque, código do produto, código do fornecedor, quantidade)
                        - Verificar se é o gerente daquela unidade
                        
                    - Loja solicitar produto para URE (Código da loja, código do produto, quantidade)
                            Produto deve ser solicitado para URE mais próxima
                        Determinar URE mais próxima
                        
                    - Chamar função da loja de listar seus produtos (Código da loja)
                    
                    - Chamar função da loja de consultar item no estoque da loja (Código da loja, código do produto, código do funcionário, quantidade)
                        - Verificar se funcionário pertence àquela loja
                        
                    - Chamar função da loja de cliente comprar produto (Código da loja, código do cliente, código do produto, quantidade)
                        
        Produto (abstrata) -> bebidas, mercearia, limpeza, higiene & perfumaria, e feira
            Atributos:  - Código
                        - Nome
                        - Preço de compra
                        - Preço de venda
                        - Descrição
                        
            Métodos:

        URE
            Atributos:  - Cidade
                        - Posição
                        - Gerente de Estoque
                        - Estoque(Produtos[], quantidade)
                        
            Métodos:    - URE comprar produto de fornecedor (código do produto, código do fornecedor, quantidade)
                            Só o Gerente de Estoque de cada unidade pode realizar compras
                            Só realiza compra se o produto não estiver disponível em outra URE
                            Uma URE pode comprar um mesmo tipo de item, de vários fornecedores, com preços diferenciados
            
            Gerente de Estoque:
                Atributos:  - Código
                            - Nome

                Métodos:
        
        Loja
            Atributos:  - Código
                        - Posição
                        - Funcionários[]
                        - Produtos[]
                        - Lucro
                        
            Métodos:    - Listar os produtos de uma loja
                            Lojas não possuem estoque próprio, só os itens da prateleira
                            
                        - Funcionário realiza consulta ao estoque da loja (Código do funcionário, código do produto)
                                Caso não haja o item no estoque, funcionário pode solicitar à URE
                                
                        - Cliente realiza compra (Código do cliente, código do produto, quantidade)
            
            Funcionário:
                Atributos:  - Código
                            - Nome
                            
                Métodos:
            
    Fornecedor
            Atributos:  - Código
                        - Nome
                        - Produtos []
                        
            Métodos:    - Cadastrar produto
            
    Cliente:
            Atributos:  - Código
                        - Nome
                        
            Métodos: