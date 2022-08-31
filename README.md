# Teste prático back end
Um serviço de backend que mantenha um cadastro de clientes e o registro de seus pedidos.

# Tecnologias de back-end
- Linguagem Java.
- Maven para compilação decódigo.
- Rest como arquitetura de software.
- Spring boot facilitando o processo em aplicações java.
- Spring data JPA para persistir os dados no banco.
- PostgreSQL para armazenar os dados.
- Postman para teste de requisições.
- Lombok para facilitar na verbosidade do código.

# Sobre o projeto
Desenvolvimento de uma API REST para um sistema de pedidos de uma loja, utilizando o
framework Spring Boot na linguagem Java.

# Requisições API

# Clientes

#### Get / Listar Clientes
```http
  http://localhost:8080/api/clientes/listar
```
#### Post / Salvar Clientes
```http
   http://localhost:8080/api/clientes/salvar
```
#### Put / Atualizar Clientes
```http
   http://localhost:8080/api/clientes/atualizar/{id}
```
#### Delete / Excluir Clientes
  ```http
     http://localhost:8080/api/clientes/deletar/{id}
  ```
# Items
#### Post / Salvar Items
```http
   http://localhost:8080/api/items/salvar
```
# Pedidos
#### Post / Salvar Pedidos
```http
   http://localhost:8080/api/pedidos/salvar
```
#### Delete / Excluir Pedidos
```http
   http://localhost:8080/api/pedidos/deletar/{id}
```
#### Não foi possível excluir o cliente sem excluir os pedidos relacionados.



