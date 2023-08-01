public class Operario extends Empregado{

    private double valorProducao;
    private double comissao;
    public Operario(String _nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(_nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.comissao = comissao;
        this.valorProducao =valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double calcularComissao(){
        double valor = getValorProducao();
        double comissao = getComissao();
        return valor * (comissao/100);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calcularComissao();
    }
}
