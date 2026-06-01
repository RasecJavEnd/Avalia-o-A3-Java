public class Main {
    public static void main(String[] args) {
        Categoria categoria = new Categoria(1, "Tecnologia");
        Produto produto = new Produto(1, "Notebook Dell", 3500.00, categoria);

        System.out.println(produto);
    }
}
