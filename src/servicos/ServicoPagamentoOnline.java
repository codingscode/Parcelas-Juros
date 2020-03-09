package servicos;

public interface ServicoPagamentoOnline {
      double taxapagamento(double quantidade);
	  double juro(double quantidade, int meses);
	
}
