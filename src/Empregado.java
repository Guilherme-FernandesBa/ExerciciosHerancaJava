public class Empregado extends Pessoa {

    private  int codigoSetor;
    private double salarioBase;
    private  double imposto;

    public Empregado(String _nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(_nome, endereco, telefone);
        this.codigoSetor =codigoSetor;
        this.salarioBase= salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double salarioBase = getSalarioBase();
        double imposto = getImposto();
        double retencao = (salarioBase*(imposto/100));
        return (salarioBase - retencao);
    }

}
