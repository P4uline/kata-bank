
public class Money {

	private float money;

	private Money(Float money) {
		this.money = money;
	}

	public static Money getInstanceOf(Float money) {
		if (money <= 0f) {
			throw new IllegalStateException("Should be positive!");
		}
		if (!money.toString().matches("^\\d+\\.\\d{0,2}$")) {
			throw new IllegalStateException("Max 2 decimals!");
		}
		return new Money(money);
	}
	
	public float value() {
		return money;
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Money)) {
			return false;
		}
		Money m = (Money)object;
		return m.money == money;
	}

}
