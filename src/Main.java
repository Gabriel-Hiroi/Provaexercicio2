public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setIdade(18);
        pessoa.setSexo('M');

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());
    }
}