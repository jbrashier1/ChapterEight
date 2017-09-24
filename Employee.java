/**
 * Created by jackbrashier on 9/22/17.
 */
public class Employee {
    private String name;
    private int empID;
    private int[] hours = new int[7];
    private int totalHours;
    public static int empCount;

    public Employee() {
        this.name = "John Doe";
        this.empID = 2505314;
        this.hours[0] = 8;
        this.hours[1] = 8;
        this.hours[2] = 8;
        this.hours[3] = 8;
        this.hours[4] = 8;
        this.hours[5] = 0;
        this.hours[6] = 0;
        empCount++;
    }

    public Employee(String name, int totalHours) {
        this.name = name;
        this.totalHours = totalHours;
        empCount++;
    }

    public String getName() {
        return this.name;
    }

    public int getEmpID() {
        return this.empID;
    }

    public int[] getHours() {
        return this.hours;
    }

    public int getTotalHours() {
        int totalHours = 0;
        for(int i = 0; i < this.hours.length; i++) {
            totalHours += this.hours[i];
        }
        return totalHours;
    }

    public void setWeekHours(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday) {
        this.hours[0] = monday;
        this.hours[1] = tuesday;
        this.hours[2] = wednesday;
        this.hours[3] = thursday;
        this.hours[4] = friday;
        this.hours[5] = saturday;
        this.hours[6] = sunday;
    }

    public static void sort(Employee[] empArray) {;
        for(int x = 0; x < empArray.length; x++) {
            Employee tempEmp = new Employee("", 0);
            for(int y = x + 1; y < empArray.length; y++) {
                if(empArray[y].getTotalHours() > empArray[x].getTotalHours()) {
                    tempEmp = empArray[x];
                    empArray[x] = empArray[y];
                    empArray[y] = tempEmp;
                }
            }
        }
    }

    public void setDayHours(int day, int hours) {
        this.hours[day] = hours;
    }

    public String displayWeek() {
        String returnString = "";
        for(int i = 0; i < this.hours.length; i++) {
            returnString += (this.hours[i] + " ");
        }
        return returnString;
    }
}
