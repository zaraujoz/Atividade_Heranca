public class Teste{
    public static void main (String args[]){
        //criando o objeto empregado 
        Empregado empregado = new Empregado();
        empregado.setCodigoSetor(1);
        empregado.setsalarioBase(3000);
        empregado.setimposto(300);
        empregado.setNome("Matheus Araujo");
        empregado.setEndereco("Rua José Pereira Mendes, 79 - Jardim das Acácias - Pompéia-SP ");
        empregado.setTelefone("14981598854");
        //Os metodos setnome, setendereco, settelefone são herdados da classe pessoa
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        //Apresentando o salario liquido 
        System.out.println(empregado.calculaSalario());
    }
}