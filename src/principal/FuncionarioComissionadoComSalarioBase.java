package principal;

public class FuncionarioComissionadoComSalarioBase extends FuncionarioComissionado {
    
    private double salarioBase;
    
    public FuncionarioComissionadoComSalarioBase (String nome, String sobrenome, String cpf, 
            double vendasBrutasSemanais, double taxaDeComissao, double salarioBase) {
        
        super (nome, sobrenome, cpf, vendasBrutasSemanais, taxaDeComissao);
        
        setSalarioBase(salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase < 0.0 ? 0.0 : salarioBase;
    }
    
    @Override
    public double salario () {
        
        return getSalarioBase() + super.salario();
        
    }
    
    @Override
    public String toString () {
        
        return String.format ("%s %s; %s: R$ %,.2f\n",
                "Comissionado com Salário Base", super.toString(),
                "Salário Base", getSalarioBase());
        
    }
    
    
}
