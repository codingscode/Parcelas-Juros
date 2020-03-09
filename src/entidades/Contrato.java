package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valortotal;
	
	private List<Parcela> parcelas = new ArrayList<>();

	public Contrato(Integer numero, Date data, Double valortotal) {
		this.numero = numero;
		this.data = data;
		this.valortotal = valortotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValortotal() {
		return valortotal;
	}

	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void adicionarParcela(Parcela parcela) {
		parcelas.add(parcela);
	}	
	
	public void removerParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}
	
}
