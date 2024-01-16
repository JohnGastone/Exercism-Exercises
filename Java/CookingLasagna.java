public class Lasagna {
    // Task 1: Define the 'expectedMinutesInOven()' method
    // This method does not take any parameters and returns the expected oven time
    // in minutes, which is 40.
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Define the 'remainingMinutesInOven()' method
    // This method takes the actual minutes the lasagna has been in the oven as a
    // parameter
    // and returns how many minutes the lasagna still has to remain in the oven.
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    // Task 3: Define the 'preparationTimeInMinutes()' method
    // This method takes the number of layers as a parameter and returns
    // how many minutes you spent preparing the lasagna, assuming each layer takes 2
    // minutes to prepare.
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // Task 4: Define the 'totalTimeInMinutes()' method
    // This method takes two parameters: the number of layers and the number of
    // minutes in the oven.
    // It returns the total time you've worked on cooking the lasagna.
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}