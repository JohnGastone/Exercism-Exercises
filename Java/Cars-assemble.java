public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // Base production rate calculation
        double baseProductionRate = speed * 221;
        double successRate = 1.0;

        // Adjust success rate based on speed
        if (speed >= 1 && speed <= 4) {
            successRate = 1.0; // 100%
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9; // 90%
        } else if (speed == 9) {
            successRate = 0.8; // 80%
        } else if (speed == 10) {
            successRate = 0.77; // 77%
        }

        // Apply success rate to base production rate
        return baseProductionRate * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        // Use the productionRatePerHour method to get the rate per hour
        double productionRatePerHour = productionRatePerHour(speed);
        
        // Convert the hourly rate to a per-minute rate and return as int
        return (int) (productionRatePerHour / 60);
    }
}
