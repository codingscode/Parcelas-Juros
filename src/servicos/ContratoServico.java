package servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcela;

public class ContratoServico {
    private ServicoPagamentoOnline servpagonline;

	public ContratoServico(ServicoPagamentoOnline servpagonline) {
		this.servpagonline = servpagonline;
	}
	 
	public void ProcessoContrato(Contrato contrato, int meses) {
		double parcelbase = contrato.getValortotal()/meses;
		for (int i=1;i<=meses;i++) {
			Date data = addMeses(contrato.getData(), i);
			double parcelatualizada = parcelbase + servpagonline.juro(parcelbase, i);
			double parcelcompleta = parcelatualizada + servpagonline.taxapagamento(parcelatualizada);
			contrato.adicionarParcela(new Parcela(data, parcelcompleta));
		}
	}
	
	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
}
