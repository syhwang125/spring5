package industry;


public class Phone {
	
	public static final String model = "LG12089123V";
	
	public static int ID;
	
	public static String getModel() {
		return model;
	}

	private long number = 101234567L;
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long num) {
		this.number = num;
		System.out.println("setnumber....");
	}

}
