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

// The provided Java class, `CarsAssemble`, contains two methods,
// `productionRatePerHour` and `workingItemsPerMinute`, designed to calculate
// the production rate of an assembly line in a car factory based on its speed.
// Let's break down the implementation and functionality of each part:

// ### `productionRatePerHour(int speed)` Method

// - **Base Production Rate Calculation**: The method starts by calculating the
// base production rate as `speed * 221`, where `221` is the number of cars
// produced per hour at the lowest speed (`1`). This base rate assumes a 100%
// success rate.

// - **Success Rate Adjustment**: The success rate varies based on the speed of
// the assembly line:
// - For speeds `1` to `4`, the success rate is 100% (`successRate = 1.0`).
// - For speeds `5` to `8`, the success rate drops to 90% (`successRate = 0.9`).
// - For speed `9`, the success rate further drops to 80% (`successRate = 0.8`).
// - For speed `10`, the success rate is at its lowest, 77% (`successRate =
// 0.77`).

// - **Applying the Success Rate**: The base production rate is then multiplied
// by the success rate to adjust for the likelihood of producing faulty cars,
// which need to be discarded. The result is the actual production rate per
// hour, taking into account the speed and success rate of the assembly line.

// - **Return Value**: The method returns this adjusted production rate as a
// `double`, representing the number of cars produced per hour.

// ### `workingItemsPerMinute(int speed)` Method

// - **Hourly to Minute Conversion**: This method leverages the
// `productionRatePerHour` method to calculate the production rate per hour
// first. It then converts this hourly production rate into a per-minute rate by
// dividing by `60` (since there are 60 minutes in an hour).

// - **Return as Integer**: The problem statement specifies that the return type
// should be an `int`. Therefore, the method casts the result of the division to
// an `int`. This casting truncates any decimal points, providing the number of
// working cars produced per minute as a whole number.

// ### Summary

// The `CarsAssemble` class accurately models the production capabilities of a
// car factory's assembly line, considering both the speed of the line and the
// variable success rates at different speeds. The `productionRatePerHour`
// method calculates how many cars are expected to be produced in an hour given
// a certain speed, while the `workingItemsPerMinute` method breaks this down to
// a per-minute basis, providing a useful metric for understanding the assembly
// line's output in smaller time increments.