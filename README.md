# Produção Mensal

## Descrição

Este projeto é uma aplicação Java Spring Boot que gerencia a produção mensal de produtos.

## Estrutura do Projeto

- *controller*: Contém os controladores REST.
- *model*: Contém as classes de modelo.
- *repository*: Contém as interfaces de repositório para acessar os dados.
- *service*: Contém as classes de serviço para a lógica de negócios.
- *resources*: Contém os arquivos de configuração.

## Classes e Pacotes

### Pacote: br.estacio.producao.model

- **Classe: ProducaoMensal**
  - Anotada com @Entity
  - Atributos:
    - Long id: Identificador único, gerado automaticamente.
    - Date mes: Mês da produção.
    - int quantidadeProduzida: Quantidade produzida no mês.
    - Produto produto: Produto relacionado à produção.
  - Métodos:
    - getId(): Retorna o ID.
    - setId(Long id): Define o ID.
    - getMes(): Retorna o mês.
    - setMes(Date mes): Define o mês.
    - getQuantidadeProduzida(): Retorna a quantidade produzida.
    - setQuantidadeProduzida(int quantidadeProduzida): Define a quantidade produzida.
    - getProduto(): Retorna o produto.
    - setProduto(Produto produto): Define o produto.

- **Classe: Produto**
  - Anotada com @Entity
  - Atributos:
    - Long id: Identificador único, gerado automaticamente.
    - String nome: Nome do produto.
  - Métodos:
    - getId(): Retorna o ID.
    - setId(Long id): Define o ID.
    - getNome(): Retorna o nome do produto.
    - setNome(String nome): Define o nome do produto.

### Pacote: br.estacio.producao.controller

- **Classe: ProdutoController**
  - Anotada com @RestController
  - Métodos:
    - List<Produto> getAllProdutos(): Retorna todos os produtos.
    - Produto getProdutoById(Long id): Retorna um produto pelo ID.
    - Produto createProduto(Produto produto): Cria um novo produto.
    - Produto updateProduto(Long id, Produto produto): Atualiza um produto existente.
    - void deleteProduto(Long id): Remove um produto pelo ID.

### Pacote: br.estacio.producao.repository

- **Interface: ProdutoRepository**
  - Extende JpaRepository<Produto, Long>
  - Métodos herdados para operações CRUD no banco de dados.

### Pacote: br.estacio.producao.service

- **Classe: ProdutoService**
  - Métodos:
    - List<Produto> findAll(): Retorna todos os produtos.
    - Produto findById(Long id): Retorna um produto pelo ID.
    - Produto save(Produto produto): Salva um novo produto.
    - Produto update(Long id, Produto produto): Atualiza um produto existente.
    - void delete(Long id): Remove um produto pelo ID.

## Configuração do Banco de Dados

O projeto está configurado para usar o H2 Database para fins de desenvolvimento. A configuração do banco de dados pode ser encontrada em src/main/resources/application.properties.

## Executando a Aplicação

Para executar a aplicação, utilize o seguinte comando no diretório raiz do projeto:

```bash
mvn spring-boot:run
