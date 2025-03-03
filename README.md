# Pneuject

Este é um projeto Spring Boot, Docker. O projeto é uma aplicação de gerenciamento de pneus.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- H2 Database
- Docker
- Postgres
- Flyway

## Estrutura do Projeto

A estrutura do projeto segue a arquitetura em CAMADAS , dividida nos seguintes pacotes:

-  **model:** Contém as classes que representam as entidades do sistema.
-  **repository:** Interfaces responsáveis pelo acesso e manipulação dos dados no banco de dados.
-  **service:** Camada que implementa as regras de negócio e lógica de processamento da aplicação.
-  **controller:** Controladores REST que recebem as requisições, processam os dados via serviços e retornam as respostas.


## Configuração e Execução do Projeto

### Pré-requisitos

- Java 17
- Docker
- Docker Compose
- Gradle

### Passos para Execução
   **Clone o repositório:**

  Foi utilizado DevContainers para facilitar a instalação do projeto, já terá todas configurações no arquivo .devcontainer.json

  https://code.visualstudio.com/docs/devcontainers/containers

  Ter vscode com a extensão do devcontainer, docker, dockercompose e docker desktop para vizualização dos containers.

  Vscode: 
  https://code.visualstudio.com/download
  
  Docker instalação:
  https://docs.docker.com/get-docker/

  Docker Compose instalação: 
  https://docs.docker.com/compose/install/

  Docker Desktop instalação: 

  https://docs.docker.com/desktop/install/linux-install/

  No vscode após ter a extensão do devcontainers use o atalho:

  CTRL + SHIFT + P

![image](https://github.com/user-attachments/assets/350300ec-1cea-426f-be9a-280ba258a3a9)


  Selecione a opção Devcontainers: Rebuild and Reopen in Container 

  A primeira build é mais demorado. 

  Após finalizar a API já estará disponivel na porta 8080.

  Obs: Se não desejar usar devcontainer é pode-se rodar apenas com Docker e Docker Compose.

  **Endpoints da API**

  Pneus:
  - GET /pneus: Listar todos os pneus

  ![image](https://github.com/user-attachments/assets/4a3fd7ad-0d61-4c07-ba9d-08db8fd0895c)

    
  Veículos
  - GET /veiculos: Listar todos os veículos
  - GET /veiculos/{id}: Buscar veículo por ID com pneus

  ![image](https://github.com/user-attachments/assets/50ba9333-d4bb-4ddd-9c58-9cc758dd4931)
  ![image](https://github.com/user-attachments/assets/bdc66b4e-9f67-4d69-afd4-f47973497b8e)

    

**Banco de Dados**

  Veículo:
  
    ID (PK)
    Placa
    Marca
    Quilometragem
    Status
    NumEixos


  VeículoPneu:
  
    ID (PK)
    Veiculo_ID (FK)
    Pneu_ID (FK)
    Posição



  Pneu:
  
    ID (PK)
    NúmeroFogo
    Marca
    PressãoAtual
    Status
