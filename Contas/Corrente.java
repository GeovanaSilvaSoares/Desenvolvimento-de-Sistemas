
public class Corrente extends Generica {
	private double limiteCheque = 0.5 * super.getSaldo();
	
	void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
	
	double getLimiteCheque() {
		return limiteCheque;
	}
	
	// M�todos
	@Override
	String sacar (double quant) {
		
		if (quant <= super.getSaldo()) {
			
			super.setSaldo( super.getSaldo() - super.getQuantia() );
			return "Seu novo saldo � de R$" + getSaldo();
			
		}else if(quant <= (super.getSaldo() +  getLimiteCheque())) {
			
			super.setSaldo( super.getSaldo() - super.getQuantia() );
			setLimiteCheque( getLimiteCheque() - quant );
			return  "Seu novo saldo � de R$" + getLimiteCheque();
			
		} else if (quant> (super.getSaldo() +  getLimiteCheque())){
			
			return "N�o foi poss�vel realizar o saque!! Limite insuficiente!";
		}

		return "Saque conclu�do com sucesso";
		
		
	}
	
	
	
}

