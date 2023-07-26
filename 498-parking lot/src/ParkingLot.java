import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	
	private int n;
	private int num_rows;
	private int spots_per_row;
	
	public final int MOTORCYCLE_START;
	private final int COMPACT_START;
	private final int LARGE_START;
	
	private int[][][] lots;
	private Map<Vehicle, int[]> parkings;
	
	// @param n number of leves
    // @param num_rows  each level has num_rows rows of spots
    // @param spots_per_row each row has spots_per_row spots
    public ParkingLot(int n, int num_rows, int spots_per_row) {
        // Write your code here
    	this.n = n;
    	this.num_rows = num_rows;
    	this.spots_per_row = spots_per_row;
    	
    	lots = new int[n][num_rows][spots_per_row];
    	parkings = new HashMap<Vehicle, int[]>();
    	
    	MOTORCYCLE_START = 0;
    	COMPACT_START = this.spots_per_row / 4;
    	LARGE_START = COMPACT_START * 3;
    }

    // Park the vehicle in a spot (or multiple spots)
    // Return false if failed
    public boolean parkVehicle(Vehicle vehicle) {
        // Write your code here
    	if (parkings.containsKey(vehicle)) {
    		return true;
    	}
    	
    	int start = 0;
    	VehicleSize vehicleSize = vehicle.getVehicleSize();
    	
    	if (vehicleSize == VehicleSize.Motorcycle) {
    		start = MOTORCYCLE_START;
    	} else if (vehicleSize == VehicleSize.Compact) {
    		start = COMPACT_START;
    	} else if (vehicleSize == VehicleSize.Large) {
    		start = LARGE_START;
    	}
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < num_rows; j++) {
    			for (int k = start; k < spots_per_row; k++) {
    				if (vehicleSize == VehicleSize.Large) {
    					if (k <= spots_per_row - 5) {
    						boolean canPark = true;
    						for (int l = 0; l < 5; l++) {
    							if (lots[i][j][k + l] == 1) {
    								canPark = false;
    								break;
    							}
    						}
    						if (canPark) {
    							for (int l = 0; l < 5; l++) {
    								lots[i][j][k + l] = 1;
    							}
    							int[] indexes = {i, j, k};
    							parkings.put(vehicle, indexes);
    							return true;
    						}
						}
						
					} else {
						if (lots[i][j][k] == 0) {
							lots[i][j][k] = 1;
							int[] indexes = {i, j, k};
							parkings.put(vehicle, indexes);
							return true;
						}
					}
    			}
    		}
    	}
    	
    	return false;
    }

    // unPark the vehicle
    public void unParkVehicle(Vehicle vehicle) {
        // Write your code here
    	if (parkings.containsKey(vehicle)) {
    		int[] indexes = parkings.get(vehicle);
    		int i = indexes[0];
    		int j = indexes[1];
    		int k = indexes[2];
    		if (vehicle.getVehicleSize() == VehicleSize.Large) {
    			for (int l = 0; l < 5; l++) {
    				lots[i][j][k + l] = 0;
    			}
    		} else {
    			lots[i][j][k] = 0;
    		}
    		parkings.remove(vehicle);
    	}
    }
    
}
