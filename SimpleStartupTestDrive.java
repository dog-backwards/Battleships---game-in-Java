package Battleships;

// METHOD String checkYourself(int userGuess)
//  GET the user guess as an int parameter
//  REPEAT with each of the location cells in the int array
//    // COMPARE the user guess to the location cell
//    IF the user guess matches
//       INCREMENT the number of hits
//       // FIND OUT if it was the last location cell:
//       IF number of hits is 3, RETURN “Kill” as the result
//       ELSE it was not a kill, so RETURN “Hit”
//       END IF
//    ELSE the user guess did not match, so RETURN “Miss”
//    END IF
//   END REPEAT
// END METHOD

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        // Instantiate a SimpleStartup object
        SimpleStartup dot = new SimpleStartup();

        // Make an int array for the location of the Startup (3 consecutive ints out of a possible 7)
        int[] locations = {2, 3, 4};
        // Invoke the setter method on the Startup
        dot.setLocationCells(locations);

        // Make a fake user guess
        int userGuess = 2;
        // Invoke the checkYourself() method on the Startup object and pass it the fake guess
        String result = dot.checkYourself(userGuess);
        
        String testResult = "failed";
        // if the fake guess (2) gives back "hit", it's working
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
