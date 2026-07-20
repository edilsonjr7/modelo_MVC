#  Sistema de Cadastro de Filmes - Java MVC

##  Sobre o projeto

Este projeto consiste em um sistema de cadastro de filmes desenvolvido em Java utilizando o padrão de arquitetura **MVC (Model-View-Controller)**.

O principal objetivo foi praticar conceitos fundamentais de Programação Orientada a Objetos (POO), organização em camadas e separação de responsabilidades, simulando uma aplicação backend simples.

---

##  Funcionalidades

- Cadastro de filmes
- Listagem de todos os filmes
- Pesquisa por diretor
- Pesquisa por ator
- Pesquisa por nota
- Listagem de diretores cadastrados
- Listagem de atores cadastrados

---

##  Arquitetura

O projeto foi estruturado seguindo o padrão MVC.

```
modelo_MVC
│
├── UI
│   └── Interface com o usuário
│
├── controller
│   └── Controla as requisições da interface
│
├── service
│   └── Regras de negócio
│
├── repository
│   └── Simulação de persistência dos dados
│
├── entities
│   └── Classes de domínio
│
├── dtos
│   └── Objetos de transferência de dados
│
├── utils
│   └── Classes auxiliares
│
└── App.java
```

---

## 🛠 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- MVC
- DTO
- Repository Pattern

---

##  Conceitos praticados

- Separação de responsabilidades
- Encapsulamento
- Organização em camadas
- Regras de negócio na camada Service
- Manipulação de listas e coleções
- Objetos de Transferência (DTO)
- Boas práticas de organização de projetos Java

---

##  Como executar

1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
```

2. Execute a classe:

```
App.java
```

---

## Aprendizados

Durante o desenvolvimento deste projeto foram praticados conceitos importantes para aplicações Java, como:

- Arquitetura MVC
- Organização de projetos
- POO
- Reutilização de código
- Separação entre interface, regras de negócio e acesso aos dados

Esses conceitos servem como base para aplicações mais robustas utilizando frameworks como Spring Boot.

---
