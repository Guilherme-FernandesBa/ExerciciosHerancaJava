public class Pessoa {
    //String nome; String endereço;
    //String telefone;
    private String Nome;
    private String Endereco;
    private String Telefone;


    public Pessoa(String _nome, String endereco, String telefone) {
        this.Nome = _nome;
        this.Endereco = endereco;
        this.Telefone = telefone;
    }


    public void setNome(String nome) {
        this.Nome = nome;
    }
    public void  setEndereco(String endereco){
        this.Endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String  getNome(){
        return Nome;
    }

    public String getEndereco() {
        return Endereco;
    }
    public String getTelefone() {
        return Telefone;
    }
}
