import java.util.Scanner;

public class PrincipalAluno{
    public static void main(String[] args){
        //scanner
        Scanner teclado=new Scanner(System.in);
        //imprimindo lalala
        Aluno brasil=new Aluno("Brandamente Brasil", "1585258", 5, 9);
        brasil.imprimeInfo();
        System.out.println();
        Aluno radigunda=new Aluno("Radigunda Cercená", "2254879", 8, 2);
        radigunda.imprimeInfo();
        System.out.println();
        Aluno vitimado=new Aluno("Vitimado José Araújo", "0085994", 7, 1);
        vitimado.imprimeInfo();
        System.out.println();
        //alterando nota da radi
        System.out.print("--- Alterando nota de Radigunda ---");
        radigunda.setNotaGA(9.0);
        System.out.println();
        System.out.println("Nova média final de Radigunda: "+radigunda.calculaMediaFinal());
        System.out.println();
        //só quis mesmo printar a matricula do ser-humano
        System.out.println("--- Informações específicas ---");
        brasil.setMatricula("1585228");
        System.out.println("Matrícula de Vitimado: "+vitimado.getMatriculaNova());
        System.out.println();
        //matricula alterada e printada :D
        System.out.println("--- Brandamente com matrícula alterada ---");
        System.out.print("Nova matrícula: "+brasil.getMatriculaNova());
        System.out.println();
        //entrada de matricula da radi com teclado~scanner
        System.out.println();
        System.out.println("--- Alterando nota de Radigunda via teclado ---");
        System.out.print("Digite a nova nota do Grau B para Radigunda: ");
        double novaNotaGB=teclado.nextDouble();
        radigunda.setNotaGB(novaNotaGB);
        System.out.println("Nota alterada com sucesso! A nova média final de Radigunda é: "+radigunda.calculaMediaFinal());
    }
}
