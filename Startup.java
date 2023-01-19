// Improved SimpleStarup.java code. Code in Game.java is not ready yet to take this changes.
// package Battleships;
// import java.util.ArrayList;

// public class Startup {

//     // Change the int array to an ArrayList hat holds Strings
//     private ArrayList<String> locationCells;

//     //private int[] locationCells;
//     //private int numOfHits = 0;

//     public void setLocationCells(ArrayList<String> locs) {
//         locationCells = locs;
//     }

//     // The argument userInput is now a String - it needs to accept a value like "A3"
//     public String checkYourself(String userInput) {
//         // Make a variable to hold the result we'll return. Put "miss" as the default
//         String result = "miss";

//         // Find out if the user guess is in the ArrayList, by asking for its index.
//         // If it's not in the list, then indexOf() return a -1 (The indexOf() method returns -1 if this list does not contain the element.)
//         int index = locationCells.indexOf(userInput);

//         // If index is greater than or equal to zero, the user guess is definitely in the list, so REMOVE it
//         if (index >= 0) {
//             locationCells.remove(index);

//             if (locationCells.isEmpty()) {
//                 result = "kill";
//             }

//             else {
//                 result = "hit";
//             }
//         }

//         return result;
//     }
// }
