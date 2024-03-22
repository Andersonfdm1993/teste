class Funcionario {
    private String matricula;
    private String nome;
    private double salarioBruto, inss;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setInss(double inss){
        this.inss = inss;
    }

    public double getInss(){
        return inss;

    }


    public Funcionario(String matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularINSS() {
        return salarioBruto * 0.15;
    }

    public double calcularSalarioLiquido() {
        double inss = calcularINSS();
        return salarioBruto - inss;
    }

    public void imprimirContracheque() {
        double inss = calcularINSS();
        double salarioLiquido = calcularSalarioLiquido();
        System.out.println("Contracheque:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Dedução INSS: " + inss);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}