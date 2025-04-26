# Cidade Segura 🚓

Projeto desenvolvido para o registro de ocorrências em cidades, com validação de dados e controle de estatísticas.

[🔗 Repositório no GitHub](https://github.com/MSouza27/cidade-segura)  
[🔗 Meu LinkedIn](https://www.linkedin.com/in/magno-souza-dos-santos)

---

## 📚 Sobre o Projeto

O **Cidade Segura** é uma API desenvolvida em **Java** com **Spring Boot**, que permite o cadastro de ocorrências feitas por usuários maiores de 18 anos. A aplicação também fornece uma contagem agrupada das ocorrências registradas.

Funcionalidades principais:
- Cadastro de ocorrência validando dados obrigatórios e idade mínima.
- Retorno de estatísticas de ocorrências agrupadas por tipo.
- Validação de campos usando Jakarta Bean Validation.
- Persistência de dados com Spring Data JPA.

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Jakarta Bean Validation
- Banco de dados MySQL (pode ser alterado para H2 em memória para testes)
- Lombok
- Maven

---

## 📦 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/MSouza27/cidade-segura.git
   ```

2. Entre no diretório do projeto:
   ```bash
   cd cidade-segura
   ```

3. Configure o banco de dados no arquivo `application.properties` ou `application.yml`.

4. Execute a aplicação:
   - Pelo seu IDE (IntelliJ, Eclipse) com Spring Boot Plugin.
   - Ou via terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

---

## 🎯 Endpoints Disponíveis

- **POST `/ocorrencia`**  
  Registra uma nova ocorrência.  
  Exemplo de JSON:
  ```json
  {
    "nomeUsuario": "João Silva",
    "idadeUsuario": 25,
    "cidadeUsuario": "Recife",
    "bairroUsuario": "Boa Viagem",
    "ocorrenciaUsuario": "Furto"
  }
  ```

- **GET `/ocorrencia/dados`**  
  Retorna a quantidade de ocorrências agrupadas por tipo.

---

## ⚙️ Estrutura do Projeto

- `model` → Entidades JPA.
- `dto` → Data Transfer Objects.
- `repository` → Interface de comunicação com o banco de dados.
- `service` → Regras de negócio da aplicação.
- `controller` → Pontos de entrada da API.

---

## 🚀 Melhorias Futuras

- Autenticação e autorização com Spring Security.
- Paginação e filtros nas consultas.
- Documentação automática com Swagger.
- Integração com bancos NoSQL para análises.

---

## 🤝 Contato

**Magno Souza dos Santos**  
[LinkedIn](https://www.linkedin.com/in/magno-souza-dos-santos)
