package com.gtm.proxybanque.metier;

import java.util.Date;

public class Compte {

	private int numeroCompte;
	private float solde;
	private Date ouvertureDate;
	
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Date getOuvertureDate() {
		return ouvertureDate;
	}
	public void setOuvertureDate(Date ouvertureDate) {
		this.ouvertureDate = ouvertureDate;
	}
	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + ", ouvertureDate=" + ouvertureDate + "]";
	}
	public Compte(int numeroCompte, float solde, Date ouvertureDate) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.ouvertureDate = ouvertureDate;
	}
	
	public void verser(float amount) {
		
		if (amount < 0)  {
			
			System.out.println("You don't have enough money on Your account!");
		}
		else {
			
			solde = solde + amount;
			System.out.println("Your deposit of " + amount + " has been added on Your account!\nYour new solde is " + solde);
			
		}
	}
	
	public boolean retirer(float amount) {
		
		boolean result = false;

		if (amount <0)  {
			
			System.out.println("You don't have enough money on Your account!");
		}
		else {
			
			if (amount > solde) {
				System.out.println("Invalide request!");
				
			}
			else {
				solde = solde - amount;
				System.out.println(amount + " has been taken from Your account!\nYour new solde is " + solde);
				
				result = true;
			}
			
		}
		return result;
	}	
}
