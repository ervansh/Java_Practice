package designpattern.builderpattern;

public class Bicycle {

	private String bicycletype;
	private String gear;
	private boolean doublestand;
	private boolean carrier;

	private String wheels;
	private String breaks;

	private Bicycle(BicycleBuilder builder) {
		this.bicycletype = builder.bicycletype;
		this.gear = builder.gear;
		this.doublestand = builder.doublestand;
		this.carrier = builder.carrier;
		this.wheels = builder.wheels;
		this.breaks = builder.breaks;
	}

	public String getBicycletype() {
		return bicycletype;
	}

	public void setBicycletype(String bicycletype) {
		this.bicycletype = bicycletype;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public boolean isDoublestand() {
		return doublestand;
	}

	public void setDoublestand(boolean doublestand) {
		this.doublestand = doublestand;
	}

	public boolean isCarrier() {
		return carrier;
	}

	public void setCarrier(boolean carrier) {
		this.carrier = carrier;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}

	@Override
	public String toString() {
		return "Bicycle [bicycletype=" + bicycletype + ", gear=" + gear + ", doublestand=" + doublestand + ", carrier="
				+ carrier + ", wheels=" + wheels + ", breaks=" + breaks + "]";
	}

	public static class BicycleBuilder {
		private String bicycletype;
		private String gear;
		private boolean doublestand;
		private boolean carrier;

		private String wheels;
		private String breaks;

		public BicycleBuilder(String wheels, String breaks) {
			this.wheels = wheels;
			this.breaks = breaks;
		}

		public BicycleBuilder setBicycletype(String bicycletype) {
			this.bicycletype = bicycletype;
			return this;
		}

		public BicycleBuilder setGear(String gear) {
			this.gear = gear;
			return this;
		}

		public BicycleBuilder setDoublestand(boolean doublestand) {
			this.doublestand = doublestand;
			return this;
		}

		public BicycleBuilder setCarrier(boolean carrier) {
			this.carrier = carrier;
			return this;
		}

		public BicycleBuilder setWheels(String wheels) {
			this.wheels = wheels;
			return this;
		}

		public BicycleBuilder setBreaks(String breaks) {
			this.breaks = breaks;
			return this;
		}

		public Bicycle build() {
			return new Bicycle(this);
		}
	}
}
