package Escola;

public class Escola {
    public static void main(String[] args) {
        aluno felipe = new aluno();
        felipe.setnome("Felipe");

        felipe.setIdade(8);

        System.out.println(" O aluno " + felipe.getNome() + " tem " + felipe.getIdade());

    }
}
