public class Livro {
    String nome;
    String autor;
    String ISBN;
    int qte;

    Livro(String nome, String autor, String ISBN, int estoque){
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
        this.qte = estoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public int getQte() {
        return qte;
    }
    public void setQte(int estoque) {
        this.qte = estoque;
    }
    Livro(String ISBN){
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + nome + " | "
        + "Nome do autor: " + autor + " | "
        + "ISBN: " + ISBN + " | "
        + "Quantidade em estoque: " + qte + " | ";
    }
}
