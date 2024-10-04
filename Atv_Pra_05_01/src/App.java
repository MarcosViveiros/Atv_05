public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro1 = new Livro("A Lenda de Ruff Ghanor", "Leonel Caldela", "223344", 10);
        Livro livro2 = new Livro("Protocolo Molotov", "Leonel Caldela", "667788", 16);
        Livro livro3 = new Livro(" Atomic Habits", "James Clear", "994488", 8);

        Estoque estoque = new Estoque();

        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);
        estoque.adicionarLivro(livro3);

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        estoque.atualizarQuantidade("667788", 6);

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        estoque.buscarLivro("994488");

        estoque.removerLivro("223344");

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        
    }
}
