package principal;

public class FuncionarioHorista extends Funcionario {
    
    private double salarioHora;
    private double horasTrabalhadas;
    
    public FuncionarioHorista (String nome, String sobrenome, String cpf, double salarioHora, double horasTrabalhadas) {
        
        super (nome, sobrenome, cpf);
        
        setSalarioHora (salarioHora);
        
        setHorasTrabalhadas (horasTrabalhadas);
        
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora < 0.0 ? 0.0 : salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        
        this.horasTrabalhadas = ((horasTrabalhadas >= 0.0) && (horasTrabalhadas <= 168.0)) ? horasTrabalhadas : 0.0;
        
    }
    
    @Override
    public double salario () {
        
        if (getHorasTrabalhadas() <= 40)
            
            return getHorasTrabalhadas() * getSalarioHora();
        
        else
            
            return 40 * getSalarioHora() + (getHorasTrabalhadas() - 40) * getSalarioHora() * 1.5;

    }
    
    @Override
    public String toString () {
        
        return String.format ("Funcionario horista: %s\nSalario por Hora: R$ %,.2f\nHoras trabalhadas: %,.2f\n",
                super.toString(),
                getSalarioHora(),
                getHorasTrabalhadas());
        
    }
}
