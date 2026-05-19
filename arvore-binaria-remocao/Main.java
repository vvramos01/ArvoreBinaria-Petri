public class Main {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);
        arvore.inserir(65);

        System.out.println("\nÁrvore original (Em-Ordem):");
        arvore.emOrdem(arvore.getRaiz());

        // remoção de nó folha
        System.out.println("\n\nRemovendo nó folha (20):");

        arvore.remover(20);

        arvore.emOrdem(arvore.getRaiz());

        // remoção de nó com um filho

        System.out.println("\n\nRemovendo nó com um filho (60):");

        arvore.remover(60);

        arvore.emOrdem(arvore.getRaiz());

        // remoção de nó com dois filhos

        System.out.println("\n\nRemovendo nó com dois filhos (70):");

        arvore.remover(70);

        arvore.emOrdem(arvore.getRaiz());

        // teste dos percursos

        System.out.println("\n\nPré-Ordem:");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\n\nEm-Ordem:");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("\n\nPós-Ordem:");
        arvore.posOrdem(arvore.getRaiz());
    }
}
