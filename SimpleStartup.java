//Old code - version 1 of Startup.java

package Battleships;

public class SimpleStartup {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

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

        // Out of the loop - let's see if we're dead now (hit 3 times) and change the result to "kill"
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        // Display the result for the user ("miss" unless it was changed to "hit" or "kill")
        System.out.println(result);

        // Return the result back to the calling method
        return result;

    }
}
