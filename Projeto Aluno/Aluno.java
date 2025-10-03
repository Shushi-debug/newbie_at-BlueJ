//criando a classe aluno
public class Aluno{
    private String nome;
    private String matricula;
    private double notaGA;
    private double notaGB;
//construtor
public Aluno(String nome, String matricula, double notaGA, double notaGB){
    this.nome=nome;
    this.matricula=matricula;
    this.notaGA=notaGA;
    this.notaGB=notaGB;
    }
//métodos de acesso
public String getNome(){
    return nome;
    }
public String getMatricula(){
    return matricula;
}
public double getNotaGA(){
    return notaGA;
}
public double getNotaGB(){
    return notaGB;
}
//método de calcular media
public double calculaMediaFinal(){
    return (this.notaGA*0.33)+(this.notaGB*0.67);
}
//imprime na tela
public void imprimeInfo(){
    System.out.println("--- Informações do Aluno ---");
    System.out.println("Nome: "+this.getNome());
    System.out.println("Matrícula: "+this.getMatricula());
    System.out.println("Nota do GA: "+this.getNotaGA());
    System.out.println("Nota do GB: "+this.getNotaGB());
    //método! vvvvvv
    System.out.println("Média final: "+this.calculaMediaFinal());
}
//setters :D vv altera nota do ga
public void setNotaGA(double novaNota){
    this.notaGA=novaNota;
}
//altera nota do gb vv
public void setNotaGB(double novaNota){
    this.notaGB=novaNota;
}
//alterar matrícula
public void setMatricula(String novaMatricula){
    this.matricula=novaMatricula;
}
//método para ler~obter a matrícula
public String getMatriculaNova(){
    return this.matricula;
}
}
