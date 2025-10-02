import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("--- Cadastro do Cliente 1 ---");
        //Pede e le o nome (socorro)
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        //idade...
        System.out.print("Digite a idade: ");
        int idade = teclado.nextInt();
        //Pede e le o sexo (to derretida ja)
        System.out.print("Digite o sexo (M/F): ");
        char sexo = teclado.next().charAt(0);
        //agora o email
        System.out.print("Digite o e-mail: ");
        String email = teclado.next();
        //a senha (que deveria ser private né, mas vida que segue
        System.out.print("Digite a senha: ");
        String senha = teclado.next();
        //e finalmente cria o cliente
        Cliente cliente1 = new Cliente(nome, idade, sexo, email, senha);
        System.out.println("\n--- Informações do Cliente 1 Cadastrado ---");
        // E finalmente, chame o método para imprimir tudo
        cliente1.imprimeInformacoes();
}
    
}