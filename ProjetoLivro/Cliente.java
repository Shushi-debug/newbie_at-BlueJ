//classe cliente
public class Cliente{
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    //construtor :D
    public Cliente(String nome, int idade, char sexo, String email, String senha){
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
        this.email=email;
        this.senha=senha;
    }
    //agora o método de acesso (se eu não esqueci)
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
    public String getEmail(){
        return this.email;
    }
    public String getSenha(){
        return this.senha;
    }    
    public void imprimeInformacoes(){
        System.out.println("--- Informações do Cliente ---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Senha: " + this.getSenha());
    }
}