package Battleships;

public class SimpleStartup {
    public String checkYourself(int guess) {
        // Make a variable to hold the result we'll return. Put "miss" as the default
        String result = "miss";

        // Repeat with each cell in the locationCells array (each cell location of the object)
        for (int cell: locationCells) {
            // Compare the user guess to this element (cell) in the array
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break; // Get out of the loop, no need to test the other cells
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
    }
}
