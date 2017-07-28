package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.List;

import fr.formation.exo2.Constants;

public class Freelance implements Payrole {

	public static final String TRAVEL_FEES = "Frais de déplacement - ";
	private String name;
	private String siren;
	private List<Invoice> invoices;
	
	public Freelance() {
		//super();
		this.invoices = new ArrayList<>();
	}

	public String getName() {
		return "L'independant " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	@Override
	public int calculateSalary() {
		
		int result = 0;
		
		for(final Invoice invoice: this.invoices) {
			
			if(!invoice.getLabel().startsWith(Constants.TRAVEL_FEES)) {
				result += invoice.getTotal();
				
			}
			
		}
		return result;
		
	}

}
