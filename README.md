# FitnessApp Java

Exercício de orientação a objetos em Java: lê nome, peso e altura e exibe a ficha do usuário. Apesar do nome, não há frontend web ou backend HTTP.

## Tecnologias

- Java
- Scanner

## Funcionalidades e utilização

Execute src.Principal e informe nome, peso e altura no terminal.

## Como executar

```bash
git clone https://github.com/EuGeanCarlos/FitnessApp-Java-Fullstack.git
cd FitnessApp-Java-Fullstack
javac -encoding UTF-8 -d out src/Alimento.java src/Principal.java src/Usuario.java
java -cp out src.Principal
```

Requer JDK 17 ou superior. Os exercícios executam no terminal.

## Demonstração e publicação

Execução local. Nenhuma demonstração nova foi confirmada nesta etapa.

GitHub Pages hospeda arquivos estáticos e não executa Java, Node.js, PHP ou Python. As dependências de servidor deste projeto devem ser executadas em ambiente apropriado.

## Estrutura versionada

```text
README.md
src/Alimento.java
src/Principal.java
src/Usuario.java
```

## Status

Protótipo / projeto de estudo em desenvolvimento. A descrição acima distingue o que está implementado das dependências ou etapas pendentes.

## Autor e créditos

**Gean Carlos** — estudante de Engenharia de Computação, UEMA.

[GitHub](https://github.com/EuGeanCarlos)

Licenças, autoria compartilhada e atribuições existentes no código e nos materiais originais permanecem aplicáveis.

---

## Documentação original e contexto

O material original a seguir preserva contexto, créditos e planejamento. Para execução e limitações atuais, considere as seções de auditoria acima.


# 🚀 FitnessApp: Java de 0 a 100 em 6 Horas

Este projeto é um **Web App (CLI Initial) para Controle de Treino e Dieta**, desenvolvido como um desafio de imersão total em Java. O objetivo é consolidar quatro pilares fundamentais da linguagem através de um projeto prático e funcional em tempo recorde.

---

## 📚 Plano de Estudos e Revisão

Este repositório documenta uma jornada de aprendizado dividida em 4 módulos principais. Se estás a usar este projeto para estudar, aqui está o roteiro:

### 1. Java: Criando a sua primeira aplicação
- **Foco:** Sintaxe, variáveis, entrada de dados (`Scanner`) e operadores matemáticos.
- **No Projeto:** Implementação da lógica de IMC e estrutura inicial.

### 2. Aplicando a Orientação a Objetos
- **Foco:** Classes, Atributos, Métodos e Instanciação de objetos.
- **No Projeto:** Criação das entidades `Usuario`, `Alimento` e `Exercicio`.

### 3. Trabalhando com Listas e Coleções
- **Foco:** `ArrayList`, loops (`for`, `each`) e manipulação de dados.
- **No Projeto:** Criação do Diário de Dieta e Histórico de Treinos.

### 4. Consumindo API, Arquivos e Erros
- **Foco:** `HttpClient`, `FileWriter` e tratamento de exceções (`try/catch`).
- **No Projeto:** Salvar dados em `.txt` e integração com APIs nutricionais.

---

## ✅ Checklist de Progresso

- [x] **Setup do Projeto:** Repositório Git e estrutura de pastas.
- [x] **Entidade Usuário:** Classe com atributos e cálculo de IMC.
- [ ] **Entidade Alimento:** Criação do molde para refeições.
- [ ] **Sistema de Listas:** Implementar o `ArrayList` no Diário de Dieta.
- [ ] **Persistência:** Gravar os dados do treino em um arquivo local.
- [ ] **Tratamento de Erros:** Validação de entradas numéricas.

---

## 🛠️ Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/EuGeanCarlos/FitnessApp-Java-Fullstack.git

```

2. **Requisitos:** Certifique-se de ter o **JDK 17 ou superior** instalado.
3. **Execução:** Importe o projeto na sua IDE (IntelliJ, VS Code, Eclipse) e execute a classe `Principal.java`.

---

## 🤝 Contribuição

Este é um projeto de estudo aberto. Sente-te à vontade para fazer um **fork**, sugerir melhorias via **Pull Request** ou usar como base para os teus próprios estudos de Java!

---

*Desenvolvido com foco e café durante uma tarde de imersão total por Gean Carlos.* ☕🔥


## Validação desta auditoria — 14/10/2026

Sem publicação nova confirmada. Compilação e execução aprovadas. Fórmula corrigida para peso/(altura²); entrada 70 kg e 1,75 m produziu IMC 22,86.
