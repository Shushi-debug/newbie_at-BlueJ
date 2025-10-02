//classe Livro:
public class Livro{
    private String titulo;
    private String autor;
    private int anoPubli;
    private double preco;
    private int qntPaginas;
    //construtor    
    public Livro(String titulo, String autor, int anoPubli, double preco, int qntPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.anoPubli=anoPubli;
        this.preco=preco;
        this.qntPaginas=qntPaginas;
    }
    //acesso dos atributos/getters
    public String gettitulo(){
        return this.titulo;
    }
    public String getautor(){
        return this.autor;
    }
    public int getanoPubli(){
        return this.anoPubli;
    }
    public double getpreco(){
        return this.preco;
    }
    public int getqntPaginas(){
        return this.qntPaginas;
    }
    
    public double calcularPrecoPorPagina(){
        return this.preco/this.qntPaginas;
    }
    //impressao na tela
    public void imprimeInformacoes(){
        System.out.println("--- Informações do Livro ---");
        System.out.println("Título: " + this.gettitulo());
        System.out.println("Autor: " + this.getautor());
        System.out.println("Ano de Publicação: " + this.getanoPubli());
        System.out.println("Quantidade de Páginas: " + this.getqntPaginas());
        System.out.println("Preço: R$ " + this.getpreco());
        //chamando o método:
        System.out.println("Preço por Página:R$"+this.calcularPrecoPorPagina());
    }
}