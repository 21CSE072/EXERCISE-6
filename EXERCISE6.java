public class ThrowUsedCarExceptions {

    public static void main(String[] args) {
        UsedCar[] usedCars = new UsedCar[7];
		try {
			usedCars[0] = new UsedCar("5000", "Ford", 2003, 60000, 20000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[1] = new UsedCar("3400", "Honda", 1983, 5000, -22220);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[2] = new UsedCar("5123", "Toyota", 2021, 5320, 40000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[3] = new UsedCar("2251", "Chrysler", 1999, 152000, 12000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[4] = new UsedCar("330", "Other", 2008, 50000, 32000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[5] = new UsedCar("0100", "Other", 2000, 15000, 43000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[6] = new UsedCar("5000", "Other", 2011, -60000, 12000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < usedCars.length; i++) {
			if(usedCars[i] != null) {
				System.out.println(usedCars[i].toString() + " is a valid car.");
			}
		}
    }
    
}

class UsedCar {
	public String vin;
	public String make;
	public int year;
	public int mileage;
	public int price;
	
	public UsedCar(String vin, String make, int year, int mileage, int price) throws UsedCarException {
		if(vin.length() < 4) {
			throw new UsedCarException(vin);
		}
		if(!(make.equals("Ford") || make.equals("Honda") || make.equals("Toyota") || make.equals("Chrysler")|| make.equals("other"))) {
			throw new UsedCarException(vin);
		}
		if(year < 1990 && year > 2014) {
			throw new UsedCarException(vin);
		}
		if(mileage < 0) {
			throw new UsedCarException(vin);
		}
		if(price < 0) {
			throw new UsedCarException(vin);
		}
		
	}
	
}

class UsedCarException extends Exception {
	public UsedCarException(String vin) {
		super("Problems with Vehicle Identification Number: " + vin);
	}
}

