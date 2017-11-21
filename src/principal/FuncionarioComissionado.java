package principal;

public class FuncionarioComissionado extends Funcionario {
    
    private double vendasBrutasSemanais;
    private double taxaDeComissao;
    
    public FuncionarioComissionado (String nome, String sobrenome, String cpf, 
            double vendasBrutasSemanais, double taxaDeComissao) {
        
        super (nome, sobrenome, cpf);
        
        setTaxaDeComissao(taxaDeComissao);
        
        setVendasBrutasSemanais(vendasBrutasSemanais);
        
    }

    public double getVendasBrutasSemanais() {
        return vendasBrutasSemanais;
    }

    public void setVendasBrutasSemanais(double vendasBrutasSemanais) {
        this.vendasBrutasSemanais = vendasBrutasSemanais < 0.0 ? 0.0 : vendasBrutasSemanais;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = (taxaDeComissao > 0.0 && taxaDeComissao <= 1.0) ? taxaDeComissao : 0.0;
    }
    
    @Override
    public double salario () {
        
        return getTaxaDeComissao() * getVendasBrutasSemanais();
        
    }
    
    @Override
    public String toString () {
        
        return String.format ("Funcionario comissionado: %s\nVendas brutas semanais: R$ %,.2f\nTaxa de comissão: %,.2f\n",
                super.toString(),
                getVendasBrutasSemanais(),
                getTaxaDeComissao());
        
    }
    
}
