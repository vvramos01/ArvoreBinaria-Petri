public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
        System.out.println("Árvore Binária criada.");
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    // inserção

    public void inserir(Integer valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, Integer valor) {

        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.getConteudo()) {

            atual.setEsquerda(
                    inserirRecursivo(atual.getEsquerda(), valor)
            );

        } else if (valor > atual.getConteudo()) {

            atual.setDireita(
                    inserirRecursivo(atual.getDireita(), valor)
            );

        } else {
            System.out.println("Não é permitido inserir valores repetidos.");
        }

        return atual;
    }

    // remoção

    public void remover(Integer valor) {
        raiz = removerRecursivo(raiz, valor);
    }

    private No removerRecursivo(No atual, Integer valor) {

        if (atual == null) {
            return null;
        }

        // procura na esquerda
        if (valor < atual.getConteudo()) {

            atual.setEsquerda(
                    removerRecursivo(atual.getEsquerda(), valor)
            );
        }

        // procura na direita
        else if (valor > atual.getConteudo()) {

            atual.setDireita(
                    removerRecursivo(atual.getDireita(), valor)
            );
        }

        // encontrou o nó
        else {

            // caso 1 -> nó folha
            if (atual.getEsquerda() == null &&
                atual.getDireita() == null) {

                return null;
            }

            // caso 2 -> nó com apenas um filho

            if (atual.getEsquerda() == null) {
                return atual.getDireita();
            }

            if (atual.getDireita() == null) {
                return atual.getEsquerda();
            }

            // caso 3 -> nó com dois filhos

            // pega o sucessor (menor dos maiores)
            No sucessor = encontrarMenor(atual.getDireita());

            // substitui o valor
            atual.setConteudo(sucessor.getConteudo());

            // remove o sucessor original
            atual.setDireita(
                    removerRecursivo(
                            atual.getDireita(),
                            sucessor.getConteudo()
                    )
            );
        }

        return atual;
    }

    // encontra o menor valor da subárvore direita
    private No encontrarMenor(No atual) {

        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }

        return atual;
    }

    // percursos

    public void preOrdem(No no) {

        if (no != null) {

            System.out.print(no.getConteudo() + " ");

            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void emOrdem(No no) {

        if (no != null) {

            emOrdem(no.getEsquerda());

            System.out.print(no.getConteudo() + " ");

            emOrdem(no.getDireita());
        }
    }

    public void posOrdem(No no) {

        if (no != null) {

            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());

            System.out.print(no.getConteudo() + " ");
        }
    }

    public No getRaiz() {
        return raiz;
    }
}
