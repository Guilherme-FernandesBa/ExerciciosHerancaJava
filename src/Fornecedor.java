public class Fornecedor extends Pessoa {

    private double valorCredito;
    public  double valorDivida;


    public Fornecedor(String _nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(_nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida =valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public double ObterSaldo(){
        double valorDivida = getValorDivida();
        double valorCredto = getValorCredito();
        return (valorCredto-valorDivida);
    }
}
