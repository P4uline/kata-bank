package fr.coderetreat.bank;

import java.util.List;

public class Account implements IBank {
	
	List<Float> operations;
	

	public Float solde() {
		return operations.stream().reduce((sum, current)-> sum += current).get();
	}
	
//	public Object reduce(Object initialValue, callback)  {
//		Object sum = initialValue;
//		for (Item item : list) {
//			sum = callback(sum, item)
//		}
//		return sum
//	}
	
	
	public void deposit(Float f) {
		operations.add(Math.abs(f));
	}

	public void WithDrawal(Float f) {
		operations.add(- Math.abs(f));
	}

	public String extract() {
		StringBuilder sb = new StringBuilder();	
		Float solde = solde();
		List<Float> last5Operations = operations.subList(operations.size() - 5, operations.size());
		//print solde avant		
		Float soldeAvant = solde - last5Operations.stream().reduce((current, sum)-> current + sum).get();
		sb.append(soldeAvant);
		//print the last 5 operations
		last5Operations.stream().forEach(sb::append);
		//print solde
		sb.append(solde);
		// TODO Auto-generated method stub
		return null;
	}

}
