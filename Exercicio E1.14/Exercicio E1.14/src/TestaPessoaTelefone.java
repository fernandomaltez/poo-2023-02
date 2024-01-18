public class TestaPessoaTelefone {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("Bruno");

        Telefone telefone1 = new Telefone("999999999");
        Telefone telefone2 = new Telefone("888888888");
        Telefone telefone3 = new Telefone("777777777");
        Telefone telefone4 = new Telefone("666666666");
        Telefone telefone5 = new Telefone("555555555");
        Telefone telefone6 = new Telefone("444444444");

        pessoa1.addTelefone(telefone1);
        pessoa1.addTelefone(telefone2);
        pessoa1.addTelefone(telefone3);
        pessoa1.addTelefone(telefone4);
        pessoa1.addTelefone(telefone5);

        // tentativa de adicionar um telfone repetido (nada ocorrerá)
        pessoa1.addTelefone(telefone1);

        pessoa1.removeTelefone(telefone6);

        // tentativa repetida de se remover o telefone6 (nada ocorrerá)
        pessoa1.removeTelefone(telefone6);

        System.out.println(pessoa1);

    }
}
