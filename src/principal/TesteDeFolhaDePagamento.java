package principal;

public class TesteDeFolhaDePagamento {
    
    public static void main (String [] args) {
        
        FuncionarioAssalariado funcionarioAssalariado = 
                new FuncionarioAssalariado("Fulano", "de Tal", "123456789-90", 200.00);
        
        FuncionarioHorista funcionarioHorista = 
                new FuncionarioHorista("Sicrano", "de Tal", "1297894793-99", 20.00, 120.00);
        
        FuncionarioComissionado funcionarioComissionado = 
                new FuncionarioComissionado("José", "Silva", "1212121212-22", 120.00, 0.23);
        
        FuncionarioComissionadoComSalarioBase funcionarioComissionadoComSalarioBase = 
                new FuncionarioComissionadoComSalarioBase("Maria", "do Carmo", "78798797987-22", 100.00, 0.25, 980.00);
        
        System.out.println ("Funcionários Processados Individualmente\n\n");
        
        System.out.println (funcionarioAssalariado + " ganhou R$ " + funcionarioAssalariado.salario());
        
        System.out.println (funcionarioHorista + " ganhou R$ " + funcionarioHorista.salario());
        
        System.out.println (funcionarioComissionado + " ganhou R$ " + funcionarioComissionado.salario());
        
        System.out.println (funcionarioComissionadoComSalarioBase + " ganhou R$ " + funcionarioComissionadoComSalarioBase.salario());
        
        
        Funcionario [] funcionarios = new Funcionario [4];
        
        funcionarios [0] = funcionarioAssalariado;
        funcionarios [1] = funcionarioHorista;
        funcionarios [2] = funcionarioComissionado;
        funcionarios [3] = funcionarioComissionadoComSalarioBase;
        
        for (Funcionario funcionarioAtual : funcionarios) {
            
            System.out.println (funcionarioAtual);
            
            if (funcionarioAtual instanceof FuncionarioComissionadoComSalarioBase) {
                
                FuncionarioComissionadoComSalarioBase funcionario = 
                        (FuncionarioComissionadoComSalarioBase) funcionarioAtual;
                
                funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());
                
                System.out.printf ("Novo salário base mais 10%% é: R$ %,.2f\n",
                        funcionario.getSalarioBase());
                
            }
            
            System.out.printf (" ganhou R$ %,.2f\n\n", funcionarioAtual.salario()); 
        }
        
        for (int i = 0; i < funcionarios.length; ++ i) {
            
            System.out.printf ("Funcionario %d é um %s\n", i,
                    funcionarios[i].getClass().getName());
            
        }
        
    }
    
}
