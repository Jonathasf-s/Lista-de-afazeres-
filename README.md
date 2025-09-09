
# Projeto: Lista de Afazeres (ToDoList)

## 1. Visão Geral
Este projeto é uma aplicação de console desenvolvida em **Java** para gerenciar uma lista de tarefas pessoais.  
Ele implementa operações básicas de **CRUD** (Criar, Ler, Atualizar, Deletar).  
Os dados são armazenados apenas em memória, ou seja, são perdidos quando o programa é encerrado.  

---

## 2. Funcionalidades Principais
O sistema interage com os usuários por meio de um menu baseado em texto, oferecendo as seguintes funções:  

-  **Adicionar Tarefa**: Cria uma nova tarefa com título e descrição. Cada tarefa recebe um ID único, data/hora de criação e começa como "Pendente".  
-  **Listar Todas as Tarefas**: Exibe todas as tarefas com ID, título, descrição, status ("Pendente" ou "Concluída") e data de criação.  
-  **Atualizar Tarefa**: Permite modificar o título e a descrição de uma tarefa já existente usando o ID.  
-  **Deletar Tarefa**: Remove definitivamente uma tarefa da lista usando o ID.  
-  **Marcar Tarefa como Concluída**: Possibilidade de concluir uma tarefa. A classe `Tarefa` já possui o método necessário, mas a lógica no menu ainda precisa ser finalizada.  
-  **Sair**: Encerra o programa.  

---

##  3. Estrutura dos Arquivos

- **`Main.java`**  
  - Ponto de entrada da aplicação.  
  - Exibe o menu, captura dados do usuário e controla o fluxo do programa.  

- **`Tarefa.java`**  
  - Representa uma tarefa (classe modelo).  
  - Atributos:  
    - `id` (int): Identificador único.  
    - `titulo` (String): Título da tarefa.  
    - `descricao` (String): Descrição detalhada.  
    - `situacao` (boolean): `false` = "Pendente", `true` = "Concluída".  
    - `dataCriacao` (LocalDateTime): Data/hora da criação.  

- **`TarefaServico.java`**  
  - Contém a lógica de negócio do sistema.  
  - Métodos: `adicionarTarefa`, `listarTarefas`, `atualizarTarefa`, `deletarTarefa`.  
  - Utiliza um `ArrayList<Tarefa>` para armazenar as tarefas em memória.  

- **`Cliente.java`**  
  - Representa um cliente.  
  - Atributos: `nome`, `cpf`, `idade`.  
  - Atualmente não está integrado ao restante da aplicação.  

- **`.gitignore`**  
  - Define arquivos/pastas que devem ser ignorados pelo Git (como `out/`, `bin/` e arquivos de IDE).  

- **Arquivos da IDE (`.idea/`, `.iml`)**  
  - Arquivos de configuração da IntelliJ IDEA.  
  - Não fazem parte do código da aplicação.  

---

##  4. Como Executar a Aplicação

1. Certifique-se de ter o **JDK** instalado.  
2. Compile os arquivos Java na pasta `src/`:  
   ```bash
   javac src/Main.java src/Tarefa.java src/TarefaServico.java src/Cliente.java
   ```  
3. Execute a classe principal:  
   ```bash
   java src.Main
   ```  
4. O menu interativo será exibido no console.  

---

 Projeto desenvolvido como prática de programação em Java para sistemas de console.
