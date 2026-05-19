# Remoção em Árvore Binária de Busca

## Descrição

Este trabalho teve como objetivo implementar a remoção de nós em uma Árvore Binária de Busca utilizando Java.

A árvore possui inserção de elementos e os percursos:
- Pré-Ordem
- Em-Ordem
- Pós-Ordem

A implementação da remoção trata os seguintes casos:
- remoção de nós folhas;
- remoção de nós com um filho;
- remoção de nós com dois filhos.

Para nós com dois filhos foi utilizada a estratégia do sucessor (menor dos maiores), conforme solicitado no enunciado da atividade.

---

# Estrutura do Projeto

O projeto foi dividido em três classes:

| Classe | Função |
|---|---|
| `No` | representa cada nó da árvore |
| `ArvoreBinaria` | implementação da árvore |
| `Main` | testes da aplicação |

---

# Implementação da Remoção

A remoção foi implementada utilizando recursividade.

A escolha pela abordagem recursiva ocorreu porque a árvore binária possui uma estrutura naturalmente recursiva, já que cada nó contém referências para outras subárvores.

Utilizando recursão, a navegação pela árvore ficou mais simples e organizada, facilitando tanto a busca do elemento quanto o retorno correto dos nós após a remoção.

Além disso, essa abordagem reduziu a necessidade de variáveis auxiliares e estruturas de repetição maiores, deixando o código mais legível e fácil de manter.

---

# Casos Tratados

## 1. Remoção de nó folha

Quando o nó não possui filhos, ele é removido retornando `null`.

Exemplo:

```text
20
```

---

## 2. Remoção de nó com um filho

Quando o nó possui apenas um filho, o filho assume a posição do nó removido.

Exemplo:

```text
60
 \
  65
```

Ao remover o nó `60`, o nó `65` passa a ocupar sua posição.

---

## 3. Remoção de nó com dois filhos

Foi utilizada a estratégia do sucessor.

O algoritmo:
1. localiza o menor valor da subárvore direita;
2. substitui o valor do nó removido pelo sucessor;
3. remove o sucessor original da árvore.

Essa estratégia mantém a organização correta da Árvore Binária de Busca.

---

# Percursos Implementados

O projeto também possui os percursos:
- Pré-Ordem
- Em-Ordem
- Pós-Ordem

O percurso em ordem foi utilizado para validar a organização correta da árvore após as remoções.
