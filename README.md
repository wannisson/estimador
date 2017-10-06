# Easy Buying

[![Build Status](https://travis-ci.org/wannisson/estimador.svg?branch=master)](https://travis-ci.org/wannisson/estimador) [![codecov](https://codecov.io/gh/wannisson/estimador/branch/master/graph/badge.svg)](https://codecov.io/gh/wannisson/estimador)

## 1. Requisitos

Para executar o projeto é necessária a instalação das seguintes ferramentas:

    1. JDK 1.8
    2. Maven 3.3 (ou superior)
    3. Docker
    4. Docker Compose

Apesar de não ser necessário para rodar o projeto, é indicado o uso da IDE IntelliJ ([thank you Jetbrains](https://www.jetbrains.com/idea/)) para realizar novos desenvolvimentos.

## 2. Configuração do Projeto

Se for utilizado o Docker Compose, não é necessária realizar nenhuma configuração, lembrando que o Docker Compose é responsável por executar a instância do PostgreSQL. Se optar por não usar o Docker Compose é preciso que tenha um PostgreSQL instalado e a seguinte configuração é preciso que seja feita. Crie no PostgreSQL um banco de dados com o nome **estimador**, usuário **admin** e senha **admin**.

## 3. Executando o Projeto

Para executar o projeto, inicialmente é preciso iniciar o Docker Compose. Para isso, é preciso apenas executar o seguinte comando.

```sh
$ docker-compose up
```

Posteriormente, para executar o projeto é necessário rodar os seguintes comandos dentro da pasta raiz.

```sh
$ mvn clean install spring-boot:run
```

A aplicação conta com um servidor de aplicação embarcado, sendo acessível na porta 8080. Além disso, está disponível o Swagger no caminho **ht<span>tp://localhost:8080/swagger-ui.html**

## 4. Testando o Projeto

A seguir é mostrado um exemplos de serviços.

* Buscar todos os usuários.

```sh
$ curl -v http://localhost:8080/api/user
```
