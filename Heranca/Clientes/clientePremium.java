
public class clientePremium extends Cliente {
	
	@Override
	String calcularDesconto(double getValorPedido) {
		double desconto = 0.15 * super.getValorPedido();
		return "O valor com desconto � R$" + (super.getValorPedido() - desconto);
	}
	
}