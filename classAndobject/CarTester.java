class CarTester { 
	public static void main (String []args){
		Car car = new Car();
		
		System.out.println(car);
		System.out.println(car.brandName);
		
		Car car1 = new Car();
		
		System.out.println(car1);
		System.out.println(car1.brandName);
		
		CarTester CarTester= new CarTester();
		
	}
	
	CarTester(){
		System.out.println("creating object of carTester");
	}
	
}