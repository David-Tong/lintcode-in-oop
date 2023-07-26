
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Park Plan 1");
		parkPlan();
		
		System.out.println("Park Plan 2");
		parkPlan2();
		
		System.out.println("Park Plan 3");
		parkPlan3();
	}
	
	private static void parkPlan() {
		int level = 1;
		int num_rows = 1;
		int spots_per_row = 12;
		ParkingLot parkingLot = new ParkingLot(level, num_rows, spots_per_row);
		
		Motorcycle motorcycle = new Motorcycle();
		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		Bus bus = new Bus();
		
		System.out.println(parkingLot.parkVehicle(motorcycle));
		System.out.println(parkingLot.parkVehicle(car));
		System.out.println(parkingLot.parkVehicle(car2));
		System.out.println(parkingLot.parkVehicle(car3));
		System.out.println(parkingLot.parkVehicle(car4));
		System.out.println(parkingLot.parkVehicle(car5));
		System.out.println(parkingLot.parkVehicle(bus));
		parkingLot.unParkVehicle(car5);
		System.out.println(parkingLot.parkVehicle(bus));
	}
	
	private static void parkPlan2() {
		int level = 1;
		int num_rows = 1;
		int spots_per_row = 14;
		ParkingLot parkingLot = new ParkingLot(level, num_rows, spots_per_row);
		
		Motorcycle motorcycle = new Motorcycle();
		Motorcycle motorcycle2 = new Motorcycle();
		Motorcycle motorcycle3 = new Motorcycle();
		Motorcycle motorcycle4 = new Motorcycle();
		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		Car car6 = new Car();
		Car car7 = new Car();
		Bus bus = new Bus();
		
		System.out.println(parkingLot.parkVehicle(motorcycle));
		System.out.println(parkingLot.parkVehicle(motorcycle2));
		System.out.println(parkingLot.parkVehicle(motorcycle3));
		System.out.println(parkingLot.parkVehicle(car));
		System.out.println(parkingLot.parkVehicle(car2));
		System.out.println(parkingLot.parkVehicle(car3));
		System.out.println(parkingLot.parkVehicle(motorcycle4));
		System.out.println(parkingLot.parkVehicle(car4));
		System.out.println(parkingLot.parkVehicle(car5));
		System.out.println(parkingLot.parkVehicle(car6));
		System.out.println(parkingLot.parkVehicle(car7));
		System.out.println(parkingLot.parkVehicle(bus));
		parkingLot.unParkVehicle(car);
		parkingLot.unParkVehicle(motorcycle4);
		parkingLot.unParkVehicle(car3);
		parkingLot.unParkVehicle(car6);
		System.out.println(parkingLot.parkVehicle(bus));
		parkingLot.unParkVehicle(car7);
		System.out.println(parkingLot.parkVehicle(bus));
	}
	
	private static void parkPlan3() {
		int level = 1;
		int num_rows = 3;
		int spots_per_row = 76;
		ParkingLot parkingLot = new ParkingLot(level, num_rows, spots_per_row);
		
		Motorcycle motorcycle = new Motorcycle();
		Motorcycle motorcycle2 = new Motorcycle();
		Motorcycle motorcycle3 = new Motorcycle();
		Motorcycle motorcycle4 = new Motorcycle();
		Motorcycle motorcycle5 = new Motorcycle();
		Motorcycle motorcycle6 = new Motorcycle();
		Motorcycle motorcycle7 = new Motorcycle();
		Motorcycle motorcycle8 = new Motorcycle();
		Motorcycle motorcycle9 = new Motorcycle();
		Motorcycle motorcycle10 = new Motorcycle();
		Motorcycle motorcycle11 = new Motorcycle();
		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		Bus bus = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		Bus bus4 = new Bus();
		Bus bus5 = new Bus();
		Bus bus6 = new Bus();
		Bus bus7 = new Bus();
		Bus bus8 = new Bus();
		Bus bus9 = new Bus();
		Bus bus10 = new Bus();
		Bus bus11 = new Bus();
		Bus bus12 = new Bus();
		Bus bus13 = new Bus();
		
		System.out.println(parkingLot.parkVehicle(motorcycle));
		System.out.println(parkingLot.parkVehicle(bus));
		System.out.println(parkingLot.parkVehicle(bus2));
		System.out.println(parkingLot.parkVehicle(motorcycle2));
		System.out.println(parkingLot.parkVehicle(bus3));
		System.out.println(parkingLot.parkVehicle(motorcycle3));
		System.out.println(parkingLot.parkVehicle(motorcycle4));
		System.out.println(parkingLot.parkVehicle(bus4));
		parkingLot.unParkVehicle(bus3);
		System.out.println(parkingLot.parkVehicle(car));
		parkingLot.unParkVehicle(motorcycle2);
		System.out.println(parkingLot.parkVehicle(motorcycle5));
		System.out.println(parkingLot.parkVehicle(car2));
		System.out.println(parkingLot.parkVehicle(bus5));
		System.out.println(parkingLot.parkVehicle(bus6));
		parkingLot.unParkVehicle(motorcycle);
		System.out.println(parkingLot.parkVehicle(motorcycle6));
		parkingLot.unParkVehicle(bus4);
		System.out.println(parkingLot.parkVehicle(car3));
		System.out.println(parkingLot.parkVehicle(car4));
		parkingLot.unParkVehicle(car4);
		System.out.println(parkingLot.parkVehicle(motorcycle7));
		System.out.println(parkingLot.parkVehicle(bus7));
		System.out.println(parkingLot.parkVehicle(motorcycle8));
		System.out.println(parkingLot.parkVehicle(car5));
		System.out.println(parkingLot.parkVehicle(motorcycle9));
		System.out.println(parkingLot.parkVehicle(motorcycle10));
		System.out.println(parkingLot.parkVehicle(bus8));
		System.out.println(parkingLot.parkVehicle(bus9));
		System.out.println(parkingLot.parkVehicle(bus10));
		parkingLot.unParkVehicle(car2);
		System.out.println(parkingLot.parkVehicle(motorcycle11));
		System.out.println(parkingLot.parkVehicle(bus11));
		System.out.println(parkingLot.parkVehicle(bus12));
		System.out.println(parkingLot.parkVehicle(bus13));
	}
}
