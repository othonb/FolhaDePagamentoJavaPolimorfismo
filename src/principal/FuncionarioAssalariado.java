package principal;

public class FuncionarioAssalariado extends Funcionario {
    
    private double salarioSemanal;
    
    public FuncionarioAssalariado (String nome, String sobrenome, String cpf, double salario) {
        
        super (nome, sobrenome, cpf);
        
        setSalarioSemanal (salario);
        
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
    }
    
    @Override
    public double salario () {
        
        return getSalarioSemanal();
        
    }
    
    @Override
    public String toString () {
        
        return String.format ("Funcionario assalariado: %s\nSalario Semanal: R$ %,.2f",
                super.toString(),
                getSalarioSemanal());
        
    }
    
    
}
