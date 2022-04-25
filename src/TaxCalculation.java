public class TaxCalculation {
	
	public void calculation(Budget budget, Taxes anyTax) {
		
		double icms = anyTax.calculate(budget);
		System.out.println(icms);
	}

}
