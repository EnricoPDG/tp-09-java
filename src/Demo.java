public class Demo {
    public static void main(String[] args) {
        LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à PPO usando JAVA", "Rafael Santos", "Campus/SBC", "2003", "g11p17");

        System.out.println(L1.getDados());

        Boolean emprestado = L1.getEmprestado();

        if (emprestado == false) {
            L1.Empresta();
            System.out.printf("O Livro %s foi emprestado com sucesso! Devera ser devolvido em 7 dias.", L1.getTitulo());
        } else {
            System.out.println("O Livro já foi emprestado.");
        }
    }
}
