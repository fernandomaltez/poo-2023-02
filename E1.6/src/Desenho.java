public interface Desenho {

    public String desenhar();

    class Figura implements Desenho {

        public String desenhar() {
            return "Desenho de uma figura";
        }
    }
}
