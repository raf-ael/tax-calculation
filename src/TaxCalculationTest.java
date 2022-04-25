public class TaxCalculationTest {

	public static void main(String[] args) {
		Taxes iss = new ISS();
		Taxes icms = new ICMS();
		
		Budget budget = new Budget(500.0);
		
		TaxCalculation calculator = new TaxCalculation();
		
		calculator.calculation(budget, iss);
		calculator.calculation(budget, icms);
	}
}
