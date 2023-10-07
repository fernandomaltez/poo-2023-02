public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;

    public Livro(String titulo, String autor, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    // método "get" pega informações privadas
    public String getTitulo() {
        return titulo;
    }

    // método "set" atribui informações para determinado atributo
    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String novoAutor) {
        autor = novoAutor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int novoAnoPublicacao) {
        anoPublicacao = novoAnoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String novaEditora) {
        editora = novaEditora;
    }

    public String toString() {
        return titulo + "\n" + autor + "\n" + editora + "," + anoPublicacao;
    }
}
