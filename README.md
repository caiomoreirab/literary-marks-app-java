# 📚 Gerenciador de Marcações Literárias

Este é um programa orientado a objetos para auxiliar leitores na organização de **marcações feitas em diversas obras literárias**. Ele permite cadastrar diferentes tipos de obras, registrar marcações e realizar consultas para encontrar facilmente informações marcadas.

## 📌 Funcionalidades

- 📖 **Cadastro de obras literárias**:
  - Livro (Título, Autor)
  - Revista (Título, Autor, Edição, Volume)
  - Jornal (Título, Autor, Data de Publicação)
  - Poema (Título, Autor, Tema)
- 📝 **Registro de marcações**, incluindo:
  - Texto marcado
  - Página ou seção de referência
  - Categoria opcional (ex.: citação, reflexão, resumo)
- 🔎 **Consultas de marcações** por título da obra e termos contidos nas marcações.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Conceitos:** Herança, polimorfismo, abstração e composição
- **Manipulação de Strings:** Uso da API do Java ([String API](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/gerenciador-marcacoes-literarias.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd gerenciador-marcacoes-literarias
   ```
3. Compile e execute o código:
   ```bash
   javac Main.java
   java Main
   ```

## 📂 Estrutura do Projeto

```
📦 Leitura
 ┣ 📂 src
 ┃ ┣ 📜 Busca.java
 ┃ ┣ 📜 Cadastro.java
 ┃ ┣ 📜 Jornal.java
 ┃ ┣ 📜 Livro.java
 ┃ ┣ 📜 Main.java
 ┃ ┣ 📜 Obra.java
 ┃ ┣ 📜 Poema.java
 ┃ ┗ 📜 Revista.java
 ┣ 📜 .gitignore
 ┣ 📜 Leitura.iml
 ┣ 📂 out
 ┣ 📂 .idea
 ┗ 📂 External Libraries
```

## 📖 Exemplo de Uso

Após iniciar o programa, o usuário pode:

1️⃣ **Cadastrar uma nova obra literária:**  
💬 *Digite o tipo de obra:* "Livro"  
💬 *Digite o título:* "Dom Casmurro"  
💬 *Digite o autor:* "Machado de Assis"  

2️⃣ **Adicionar uma marcação:**  
💬 *Digite o título da obra:* "Dom Casmurro"  
💬 *Digite o trecho marcado:* "Olhos de ressaca..."  

3️⃣ **Consultar marcações cadastradas:**  
💬 *Digite um termo de busca:* "Olhos de ressaca"

## 📜 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias! Para isso:

1. Faça um fork do projeto.
2. Crie uma branch (`git checkout -b minha-feature`).
3. Faça as alterações e commit (`git commit -m 'Minha nova feature'`).
4. Envie um push (`git push origin minha-feature`).
5. Abra um Pull Request!

---

💡 **Dúvidas ou sugestões?** Entre em contato ou abra uma issue! 🚀
por: Caio Moreira
