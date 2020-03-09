package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
    
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date vencimento;
	private Double quantidade;
	
	public Parcela(Date vencimento, Double quantidade) {
		this.vencimento = vencimento;
		this.quantidade = quantidade;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return sdf.format(vencimento) + " - " + quantidade;
	}
	
}
