import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario("488778", "Bia", 900.00);



        System.out.println("Matricula");
        f.setMatricula(sc.next());
        System.out.println("Nome completo");
        f.setNome(sc.next());
        System.out.println("Salário Bruto");
        f.setSalarioBruto((sc.nextDouble()));
        System.out.println("Dedução INSS");
        f.setInss(sc.nextDouble());
        f.calcularINSS();
        System.out.println("Salário Líquido");
        System.out.println(f.calcularSalarioLiquido());

        f.imprimirContracheque();



    }
}



