public class cliente {
    //atributos nomes etc....colocar private como medida de segurança
    private String nome;
    private int idade;
    private String cpf;
    private float saldo;

    public cliente(String nome0, String cpf0){  //construtor
        this.nome = nome0;
        this.cpf = cpf0;
        this.idade = 0;
        this.saldo = 0;
    }
    public cliente(String nome0, float saldo0){
        this.nome = nome0;
        this.cpf = cpf;
        this.idade = 0;
        this.saldo = saldo0;
    }
    public cliente(String nome0, String cpf0, int idade0, float saldo0){
        this.nome = nome0;
        this.cpf = cpf0;
        this.idade = 0;
        this.saldo = saldo0;
    }

    //metodos get e set para atributos privados
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getCpf(){
        return this.cpf;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }
    public void setSaldo (float novoSaldo){
        this.saldo = saldo;
    }
    //metodos
    public
}
