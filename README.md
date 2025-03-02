# Spring Boot CRUD

<div align="center">

[![License](https://img.shields.io/github/license/Jinkogule/Spring-Boot-CRUD?style=for-the-badge)](LICENSE)<br>
![Status](https://img.shields.io/badge/STATUS-CONCLU%C3%8DDO-brightgreen?style=for-the-badge)
</div>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-documentação">Documentação</a> • 
 <a href="#-desenvolvimento">Desenvolvimento</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
 <a href="#-executar-o-projeto-localmente">Executar o projeto localmente</a> • 
 <a href="#-requisições-e-respostas-da-api">Requisições e Respostas da API</a> • 
 <a href="#-autor">Autor</a> •
 <a href="#-licença">Licença</a>
</p>

---

## 💻 Sobre o projeto

O **Spring Boot CRUD** é um sistema desenvolvido como parte de um projeto acadêmico para a disciplina de Desenvolvimento de Aplicações Corporativas. Este projeto utiliza o framework Spring Boot para implementar uma API RESTful que realiza operações CRUD, baseado em um cenário fictício conforme descrito no **[enunciado do trabalho](https://github.com/Jinkogule/Spring-Boot-CRUD/raw/main/src/main/resources/documents/Trabalho_em_grupo.pdf)**.

## 📋 Documentação

-   **[Enunciado do trabalho](https://github.com/Jinkogule/Spring-Boot-CRUD/raw/main/src/main/resources/documents/Trabalho_em_grupo.pdf)**
-   **[Wiki](https://github.com/Jinkogule/Spring-Boot-CRUD/wiki)**

## 🧑🏻‍💻 Desenvolvimento

-   **[Código-fonte](https://github.com/Jinkogule/Spring-Boot-CRUD)**
-   **[Issue Tracking](https://github.com/Jinkogule/Spring-Boot-CRUD/issues)**

## 🛠 Tecnologias

### **Back-End (API)**

-   **[Java 17](https://www.oracle.com/br/java/technologies/downloads/#java17)**
-   **[Spring Boot 3](https://spring.io/projects/spring-boot)**
-   **[Maven 3.8.6 (Wrapper)](https://maven.apache.org/)**

> Para mais detalhes sobre as configurações do projeto, veja o arquivo **[`pom.xml`](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/pom.xml)**.

### **Banco de Dados**

-   **[MySQL 8.0.3](https://www.mysql.com/)**

### **Utilitários**

-   Teste de API: **[Postman](https://www.postman.com/)** -> **[Postman Collection](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/src/main/resources/documents/trabalhodac.postman_collection.json)**

## ⚙ Executar o projeto localmente

### **Pré-Requisitos**

Antes de começar, certifique-se de:

- Instalar o **[Git](https://git-scm.com/)**.
- Instalar o **[MySQL Server 8.0.3](https://dev.mysql.com/downloads/mysql/)** (ou versão compatível).
- Executar o **[script de banco de dados](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/src/main/resources/documents/trabalhodac.sql)** para criar o schema e as tabelas necessárias.
- Instalar o **[JDK 17](https://www.oracle.com/br/java/technologies/downloads/#java17)** (ou versão compatível) e configurar a variável `JAVA_HOME` com o caminho correto do JDK.

### **Rodando o Back-End (servidor)**

```bash
# Clone este repositório
$ git clone https://github.com/Jinkogule/Spring-Boot-CRUD

# Acesse a pasta do projeto no terminal/cmd
$ cd Spring-Boot-CRUD

# Instale as dependências e execute a aplicação usando o Maven Wrapper
# No Linux/macOS ou PowerShell
$ ./mvnw install
$ ./mvnw spring-boot:run

# No Windows
$ mvnw.cmd install
$ mvnw.cmd spring-boot:run
```

<div align="center">

[![Postman](https://img.shields.io/badge/Teste%20com%20o%20Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/src/main/resources/documents/trabalhodac.postman_collection.json)

</div>

## 📷 Requisições e Respostas da API

Visualização das Operações CRUD sobre a entidade Atividades:
<table align="center" width="100%">
  <tr>
    <td align="center" colspan="3"><strong>Create</strong></td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/create_1.png" alt="" title="create_1">
      <br>
      <em>Criação do primeiro item</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/create_2.png" alt="" title="create_2">
      <br>
      <em>Criação do segundo item</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/create_3.png" alt="" title="create_3">
      <br>
      <em>Criação do terceiro item</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="4"><strong>Read</strong></td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/read_1.png" alt="" title="read_1">
      <br>
      <em>Leitura específica sobre Id=1</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/read_2.png" alt="" title="read_2">
      <br>
      <em>Leitura de todos os itens após criações</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/read_3.png" alt="" title="read_3">
      <br>
      <em>Leitura de todos os itens após updates sobre Id=1 e Id=2</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/read_4.png" alt="" title="read_4">
      <br>
      <em>Leitura de todos os itens após deleções sobre Id=1 e Id=3</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="3"><strong>Update</strong></td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/update_1.png" alt="" title="update_1">
      <br>
      <em>Atualização sobre Id=1</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/update_2.png" alt="" title="update_2">
      <br>
      <em>Atualização sobre Id=2</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="2"><strong>Delete</strong></td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/delete_1.png" alt="" title="delete_1">
      <br>
      <em>Deleção sobre Id=1</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/screenshots/delete_2.png" alt="" title="delete_2">
      <br>
      <em>Deleção sobre Id=3</em>
    </td>
  </tr>
</table>

## ✒ Autor

<table>
  <tr>
    <td align="center">
      Lucas Pimenta
      <br>
      <a href="https://github.com/Jinkogule">
        <img src="https://avatars.githubusercontent.com/u/52849575?v=4" width="100px;" alt="Lucas Pimenta"/>
      </a>
      <br>
      <a href="https://github.com/Jinkogule">
        <img src="https://img.shields.io/badge/-Github-black?style=flat-square&logo=Github&logoColor=white">
      </a>
    </td>
  </tr>
</table>

## 📝 Licença

Este projeto está sob a licença **[MIT](./LICENSE)**.
