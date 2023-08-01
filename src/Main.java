public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fornecedor Fornecedor1 = new Fornecedor("jose", "Bahia", "9999999999", 100, 20);
        System.out.println(Fornecedor1.ObterSaldo());
        Fornecedor1.setValorDivida(100);
        System.out.println(Fornecedor1.getValorDivida());
        System.out.println(Fornecedor1.getNome());
        Empregado empregado1 = new Empregado("jose", "Bahia", "9999999999", 100, 2600, 7.5);
        System.out.println(empregado1.calcularSalario());
        System.out.println(empregado1.getImposto());
        Administrador administrador1 = new Administrador("jose", "Bahia", "9999999999", 100, 2600, 7.5, 1000);
        System.out.println(administrador1.calcularSalario());
        Operario Operario1 = new Operario("jose", "bahia", "9999999999", 100,  1100, 7.5, 5000, 5);
        System.out.println(Operario1.calcularSalario());
        Vendedor Vendedor1 = new Vendedor("jose", "bahia", "9999999999", 100,  1100, 7.5, 5000, 5);
        System.out.println(Vendedor1.calcularSalario());
    }
}