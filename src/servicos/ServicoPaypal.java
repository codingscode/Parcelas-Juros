package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double taxa_pag = 0.02;
	private static final double jurosmensal = 0.01;
	
	@Override
	public double taxapagamento(double quantidade) {
		return quantidade*taxa_pag;
	}
	
	@Override
	public double juro(double quantidade, int meses) {
		return quantidade*meses*jurosmensal;
	}
	
}
