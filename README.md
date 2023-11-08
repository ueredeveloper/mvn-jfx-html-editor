# Leitura de um Objeto Java em um Editor HTML e Cópia do Conteúdo Renderizado

Este código Java demonstra como ler um objeto Java, incorporá-lo em um editor HTML e permitir a cópia do conteúdo renderizado. A aplicação utiliza JavaFX e a biblioteca Gson para converter objetos em JSON.

Para adicionar as varíaveis ao conteúdo HTML foi utilizado React JS.

## Descrição do Código

- A classe `Main` é a classe principal.
- Um objeto `Documento` é criado e preenchido com dados.
- O conteúdo HTML é carregado de um arquivo de recursos.
- Um editor HTML exibe o conteúdo e substitui `${json}` pelo JSON do `Documento`.
- Um botão "Copiar Texto" permite copiar o HTML renderizado.

## Execução da Aplicação

- Abra a aplicação JavaFX.
- O editor HTML mostra o conteúdo com os dados do `Documento`.
- Clique no botão "Copiar Texto" para copiar o HTML renderizado.

Esta aplicação é útil para incorporar dados em um editor HTML e copiar o conteúdo gerado. Pode ser usado em relatórios, emails formatados e outras aplicações com conteúdo HTML dinâmico.
