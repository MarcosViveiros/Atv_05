public class Estoque {
    public Livro[] livros;
    private int contador;

    public Estoque() {
        livros = new Livro[100];
        contador = 0;
    }

    public void adicionarLivro(Livro novolivro) {
        for(int i = 0; i < contador; i++){
            if(livros[i].getISBN().equals(novolivro.getISBN())){
                livros[i].setQte(livros[i].getQte() + novolivro.getQte());
                System.out.println("Livro já existente, quantidade atualizada");
                return;
            }
        }
        if(contador < 100){
            livros[contador] = novolivro;
            contador++;
            System.out.println("Livro adicionado com sucesso");
        } else {
            System.out.println("Estoque cheio! Livro não adicionado.");
        }
    }

    public void removerLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getISBN().equals(isbn)) {
                livros[contador] = null;
                contador--;
                System.out.println("Livro removido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getISBN().equals(isbn)) {
                return livros[i];
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void listarLivros() {
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i].toString());
        }
    }

    public void atualizarQuantidade(String isbn, int quantidade) {
        Livro livro = buscarLivro(isbn);
        if (livro != null) {
            livro.setQte(quantidade);
            System.out.println("Quantidade do livro atualizada com sucesso.");
        } else {
            System.out.println("Livro não encontrado, não foi possível atualizar a quantidade.");
        }
    }
}
