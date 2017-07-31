package com.gtm.proxybanque.presentation;

import com.gtm.proxybanque.constants.ApplicationConstants;
import com.gtm.proxybanque.metier.Client;
import com.gtm.proxybanque.metier.Compte;
import com.gtm.proxybanque.metier.Conseiller;
import com.gtm.proxybanque.service.ClientService;
import com.gtm.proxybanque.service.ConseillerService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConseillerService cs = new ConseillerService();
		Conseiller conseiller = new Conseiller();
		Client fabo = cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		Client sanja = cs.createClient(conseiller, "MyName", "Sanja", "2 rue des lilas", 21000, "Split", "079538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.createClient(conseiller, "NotMyName", "Fabo", "2 rue des lilas", 21000, "Split", "064538298");
		cs.readClientsInformation(conseiller);
		
		Compte compte = cs.createCompteToClient(fabo, 637, 99165428.67f, ApplicationConstants.COMPTE_COURANT);
		Compte compte2 = cs.createCompteToClient(sanja, 643, 991065428.67f, ApplicationConstants.COMPTE_COURANT);

		ClientService clientService = new ClientService();
		clientService.readComptes(fabo);
		
		cs.transferFromCompteToCompte(compte, compte2, 165428.67f);
		clientService.readComptes(fabo);
		clientService.readComptes(sanja);
		boolean result = cs.isClientRich(fabo);
		System.out.println(cs.isClientRich(sanja));
		System.out.println(result);
	}

}
