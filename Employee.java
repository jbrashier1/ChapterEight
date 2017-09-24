/**
 * Author: Jack Brashier
 * Date: 09/20/2017
 * Purpose: To demonstrate understanding of two-dimensional arrays in Java.
 */
public class Employee {
    /**
     * @param hours an array of the hours worked each day of the week, monday is index 0 and sunday is index 6.
     * @param empCount an unused static variable that keeps track of the amount of employees.
     */
    private int[] hours = new int[7];
    public static int empCount = 0;

    /** Default constructed employees work 8 hours Monday through Friday with weekends off. */
    public Employee() {
        this.hours[0] = 8;
        this.hours[1] = 8;
        this.hours[2] = 8;
        this.hours[3] = 8;
        this.hours[4] = 8;
        this.hours[5] = 0;
        this.hours[6] = 0;
        empCount++;
    }

    /** Custom constructor allows the setting of how many hours an employee works every day of the week */
    public Employee(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday) {
        this.hours[0] = monday;
        this.hours[1] = tuesday;
        this.hours[2] = wednesday;
        this.hours[3] = thursday;
        this.hours[4] = friday;
        this.hours[5] = saturday;
        this.hours[6] = sunday;
        empCount++;
    }

    /** Returns the 7-long array of the hours the employee worked each day of the week. */
    public int[] getHours() { return this.hours; }

}
