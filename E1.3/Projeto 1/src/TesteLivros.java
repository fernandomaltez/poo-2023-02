public class TesteLivros {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", "Doubleday", 2003);

        System.out.println("Livro 1 :" + livro1 + "\n");

        Livro livro2 = new Livro("Sapiens", "Yuval Noah", "Companhia das Letras", 2020);

        System.out.println("Livro 2 :" + livro2 + "\n");

        Livro livro3 = new Livro("Escravidão", "Laurentino Gomes", "Globo Livros", 2022);

        System.out.println("Livro 3 :" + livro3);

    }
}
