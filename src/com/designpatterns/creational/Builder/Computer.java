package com.designpatterns.creational.Builder;

public class Computer {
	//required parameters
	private String HDD;
	private String RAM;
	
	// Optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
		
	}

	public Computer(ComputerBuilder computerBuilder) {
		super();
		HDD = computerBuilder.HDD;
		RAM = computerBuilder.RAM;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	public static class ComputerBuilder {
		//required parameters
		private String HDD;
		private String RAM;
		
		// Optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
