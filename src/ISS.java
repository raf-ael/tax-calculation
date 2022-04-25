public class ISS implements Taxes {

	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * 0.06;
	}

}
