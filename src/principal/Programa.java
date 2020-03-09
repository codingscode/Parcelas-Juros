package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ContratoServico;
import servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		/*
		Entre com informação do contrato:
		Número: 8028
		Data (dd/MM/yyyy): 25/06/2018
		Valor do contrato: 600.00
		Entre com o número de parcelas: 3
		Parcelas:
		25/07/2018 - 206.04
		25/08/2018 - 208.08
		25/09/2018 - 210.12
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Digite dados de contrato : ");
        System.out.println("Número do contrato: ");
        int numero = sc.nextInt();
        System.out.println("Date (dd/MM/yyyy): ");
        Date data = sdf.parse(sc.next());
        System.out.println("Valor do contrato: ");
        double valortotal = sc.nextDouble();
        
        Contrato contrato = new Contrato(numero, data, valortotal);
        
        System.out.println("Digite número de parcelas: ");
        int n = sc.nextInt();
        
        ContratoServico contratoservico = new ContratoServico(new ServicoPaypal());
		
        contratoservico.ProcessoContrato(contrato, n);
		
        System.out.println("Parcelas: ");
        for (Parcela x : contrato.getParcelas()) {
        	System.out.println(x);
        }
        
		sc.close();
	}

}
