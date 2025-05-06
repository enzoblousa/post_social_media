📘 Java Social Media Post System
Este é um projeto simples em Java que simula um sistema de postagens em redes sociais. Ele permite criar posts, adicionar comentários, e visualizar todas as informações relacionadas.

📌 Objetivo
Este projeto serve como prática para conceitos de orientação a objetos em Java, incluindo encapsulamento, listas, e interações entre classes.

🧱 Estrutura das Classes
Comment.java
Representa um comentário.

Atributos:
text — Texto do comentário.

Métodos:
Getters e setters.

toString() — Retorna o texto do comentário.

Post.java
Representa uma postagem.

Atributos:
creationDateTime — Data e hora da criação do post.

title — Título da postagem.

content — Conteúdo da postagem.

likeCount — Número de curtidas.

comments — Lista de comentários (List<Comment>).

Métodos:
addComment(Comment comment) — Adiciona um comentário.

removeComment(Comment comment) — Remove um comentário.

Getters e setters para todos os atributos.

Main.java
Classe principal que demonstra o uso do sistema.

Funcionalidades demonstradas:
Criação de duas postagens de exemplo.

Adição de comentários para cada postagem.

Exibição de todas as informações dos posts:

Data de criação

Título

Conteúdo

Número de curtidas

Lista de comentários

