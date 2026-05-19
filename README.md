# Árvore Binária com Remoção

Este trabalho foi desenvolvido em Java e implementa uma Árvore Binária de Busca com inserção, percursos e remoção de nós.

A árvore possui os percursos:
- Pré-ordem
- Em-ordem
- Pós-ordem

A funcionalidade de remoção foi implementada para os seguintes casos:
- remoção de nó folha;
- remoção de nó com um filho;
- remoção de nó com dois filhos.

Para remoção de nós com dois filhos foi utilizada a estratégia do sucessor (menor dos maiores), conforme solicitado na atividade. Nesse caso, o algoritmo busca o menor elemento da subárvore direita para substituir o nó removido, mantendo a organização da árvore binária de busca.

## Implementação Recursiva

A implementação foi feita utilizando recursividade porque a estrutura da árvore binária já funciona de maneira recursiva naturalmente.

Cada nó possui referências para outras subárvores, então a navegação pela árvore fica mais simples utilizando chamadas recursivas.

Além disso, a abordagem recursiva facilitou:
- a busca do nó que deveria ser removido;
- a reorganização da árvore após a remoção;
- o retorno correto dos nós para seus respectivos pais.

Também foi considerada uma implementação iterativa, porém ela exigiria mais variáveis auxiliares para controle do nó atual e do nó pai, deixando a lógica mais extensa e menos organizada.

Por esse motivo, a implementação recursiva foi escolhida para este trabalho.

## Arquivos do Projeto

- `No.java`
- `ArvoreBinaria.java`
- `Main.java`
