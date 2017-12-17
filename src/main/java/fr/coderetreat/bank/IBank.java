package fr.coderetreat.bank;

public interface IBank {
	
	void deposit(Float f);
	
	void withdrawal(Float f); // nom alors que ça devrait être un verbe
	
	String extract();
	
	/*
	 * 100 |
	 *     | 1
	 *     | 55
	 *     | 20
	 *     | 10
	 *     
	 * à la creation du compte on a au moins 3 ligne
	 * solde 0 + virement de creation du compte
	 */
	

}
