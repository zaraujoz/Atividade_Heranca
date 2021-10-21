public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
//Fazer os métods de acesso público
// set
public void setNome(String nome){
    this.nome=nome;
} 
//get
public String getNome(){
    return this.nome;
}
//set
public void setTelefone(String telefone){
    this.telefone=telefone;
}
//get
public String getTelefone(String telefone){
    return this.telefone;
}
//set
public void setEndereco(String endereco){
    this.endereco=endereco;
}
//get
public String getEndereco(){
    return this.endereco;
}
//construtor padrão, tem o nome da classe e sem parâmetros
public Pessoa(){

} 
//Construtor com um parâmetro
public Pessoa(String nome){
    this.nome=nome; 
}
//Construtor com dois parâmetros
public Pessoa(String nome, String telefone){
    this.nome=nome;
    this.telefone=telefone;
}

}