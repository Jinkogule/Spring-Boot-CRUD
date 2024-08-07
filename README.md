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
 <a href="#-api-requests-&-responses">API Requests & Responses</a> • 
 <a href="#-autor">Autor</a> •
 <a href="#-licença">Licença</a>
</p>

---

## 💻 Sobre o projeto

O Spring Boot CRUD é um sistema desenvolvido como parte de um projeto acadêmico para a disciplina de Desenvolvimento de Aplicações Corporativas. Este projeto utiliza o framework Spring Boot para implementar uma API RESTful que realiza operações CRUD, baseado em um cenário fictício conforme descrito no [enunciado do trabalho](https://github.com/Jinkogule/Spring-Boot-CRUD/raw/main/src/main/resources/documents/Trabalho_em_grupo.pdf).

## 📋 Documentação

-   **[Enunciado do trabalho](https://github.com/Jinkogule/Spring-Boot-CRUD/raw/main/src/main/resources/documents/Trabalho_em_grupo.pdf)**
-   **[Wiki](https://github.com/Jinkogule/Spring-Boot-CRUD/wiki)**

## 🧑🏻‍💻 Desenvolvimento

-   **[Código-fonte](https://github.com/Jinkogule/Spring-Boot-CRUD)**
-   **[Issue Tracking](https://github.com/Jinkogule/Spring-Boot-CRUD/issues)**

## 🛠 Tecnologias

#### **Back-end (API)**

-   **[Java 17](https://www.oracle.com/br/java/technologies/downloads/#java17)**
-   **[Spring Boot 3](https://spring.io/projects/spring-boot)**
-   **[Maven 3.8.6 (Wrapper)](https://maven.apache.org/)**

> Para mais detalhes sobre as configurações do projeto, veja o arquivo [`pom.xml`](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/pom.xml).

#### **Banco de Dados**

-   **[MySQL 8.0.3](https://www.mysql.com/)**

#### **Utilitários**

-   Teste de API: **[Postman](https://www.postman.com/)** -> **[Postman Collection](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/src/main/resources/documents/trabalhodac.postman_collection.json)**

## 📝 Executar o projeto localmente

#### **Pré-requisitos**

Antes de começar, certifique-se de:

- Instalar o **[Git](https://git-scm.com/)**.
- Instalar o **[MySQL Server 8.0.3](https://dev.mysql.com/downloads/mysql/)** (ou versão compatível).
- Executar o **[script de banco de dados](https://github.com/Jinkogule/Spring-Boot-CRUD/blob/main/src/main/resources/documents/trabalhodac.sql)** para criar o schema e as tabelas necessárias.
- Instalar o **[JDK 17](https://www.oracle.com/br/java/technologies/downloads/#java17)** (ou versão compatível) e configurar a variável `JAVA_HOME` com o caminho correto do JDK.

#### **Rodando o Back-End (servidor)**

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

## 🛠️ API Requests & Responses

### CRUD envolvendo a tabela Atividades
<table align="center">
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/create_1.png" alt="" title="Create_1" width="300px">
      <br>
      <em>Primeira criação</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/read_1.png" alt="" title="Read_1" width="300px">
      <br>
      <em>Leitura do "Id=1"</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/create_2.png" alt="" title="Create_2" width="300px">
      <br>
      <em>Segunda criação</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/read_2.png" alt="" title="Read_2" width="300px">
      <br>
      <em>Leitura de todos após segunda criação</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/update_1.png" alt="" title="Update_1" width="300px">
      <br>
      <em>Atualização do "Id=2"</em>
    </td>
    <td align="center">
      <img src="/src/main/resources/static/images/delete_1.png" alt="" title="Delete_1" width="300px">
      <br>
      <em>Deleção do "Id=1"</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/main/resources/static/images/read_3.png" alt="" title="Read_3" width="300px">
      <br>
      <em>Leitura de todos após atualização do "Id=2" e deleção do "Id=1"</em>
    </td>
  </tr>
</table>

## 📝 Autor

<img border-radius="50%" style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/52849575?v=4" width="100px;" alt=""/>

[![Linkedin](https://img.shields.io/badge/-Lucas%20Pimenta-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/lucas-pimenta-0663671b1/)](https://www.linkedin.com/in/lucas-pimenta-0663671b1/) 
[![Gmail](https://img.shields.io/badge/-lucaspimenta21@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:lucaspimenta21@gmail.com)](mailto:lucaspimenta21@gmail.com)

## 📝 Licença

Este projeto está sob a licença [MIT](./LICENSE).