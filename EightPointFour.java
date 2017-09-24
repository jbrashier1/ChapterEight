/**
 * Author: Jack Brashier
 * Date: 09/20/2017
 * Purpose: To demonstrate understanding of two dimensional arrays in Java.
 */
public class EightPointFour {
    public static void main(String[] args) {
        Employee al = new Employee(0, 0, 0, 0, 0, 8, 8);
        Employee bob = new Employee(7, 8, 8, 8, 8, 0, 0);
        Employee cathy = new Employee(4, 4, 4, 4, 4, 0, 0);
        Employee john = new Employee(); // default employee works 40 hrs in a week.
        Employee jesse = new Employee(8, 4, 8, 0, 8, 0, 0);
        int[][] roster = {al.getHours(), bob.getHours(), cathy.getHours(), john.getHours(), jesse.getHours()};
        int[][] hours = new int[5][2];
        int count = 0;

        /** Populates the first index of each array in <hours> with the Employee#, a way to keep track of who's who. */
        for (int o = 0; o < roster.length; o++) {
            hours[o][0] = count;
            count++;
        }

        /** Populates the second index of each array in <hours> with the Employee's Total Hours, which they will be sorted by. */
        for (int i = 0; i < roster.length; i++) {
            int hourSum = 0;
            for (int x = 0; x < roster[0].length; x++) {
                hourSum += roster[i][x];
            }
            hours[i][1] = hourSum;
        }

        /** Sorts the 2D Array <hours> by the total hours worked by each employee - in descending order. */
        for(int i = 0; i < hours.length; i++) {
            int[] temp = new int[2];
            for(int x = i + 1; x < hours.length; x++) {
                if(hours[x][1] > hours[i][1]) {
                    temp = hours[i];
                    hours[i] = hours[x];
                    hours[x] = temp;
                }
            }
        }

        /** Prints an easy to understand format of the 2D array. */
        for (int i = 0; i < hours.length; i++) {
            System.out.print("Employee #" +(hours[i][0] + 1) + " Worked " + hours[i][1] + " Hours\n");
        }
    }
}

