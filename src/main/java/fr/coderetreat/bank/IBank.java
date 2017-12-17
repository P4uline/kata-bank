package fr.coderetreat.bank;

// contrainte : on ne change pas le nom de l'interface
// l'interface est imposée par client
public interface IBank {
	
	void deposit(Float f);
	
	void WithDrawal(Float f); // nom alors que ça devrait être un verbe, nommage de methode respecte pas la convention java
	
	String extract();
	
	/*
	 * Toutes les 5 operations
	 * solde precedant
	 * 100 |
	 *     | 1
	 *     | 55
	 *     | 20
	 *     | 10
	 * nouveau solde
	 * à la creation du compte on a au moins 3 ligne
	 * solde 0 + virement de creation du compte
	 */
	

}
