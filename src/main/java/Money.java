
public class Money {

	private float money;

	private Money(Float money) {
		this.money = money;
	}

	public static Money getInstanceOf(Float money) {
		return new Money(money);
	}
	
	public Float value() {
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
