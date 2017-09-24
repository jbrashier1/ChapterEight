/**
 * Created by jackbrashier on 9/22/17.
 */
public class EightPointFour {
    public static void main(String[] args) {
        Employee al = new Employee("Al", 16);
        Employee bob = new Employee("Bob", 22);
        Employee cathy = new Employee("Cathy", 32);
        Employee john = new Employee(); // default employee is named John and works 40 hrs in a week.
        Employee jesse = new Employee("Jesse", 8 );
        Employee[] roster = new Employee[5];
        roster[0] = al;
        roster[1] = bob;
        roster[2] = cathy;
        roster[3] = john;
        roster[4] = jesse;
        System.out.print(Employee.empCount);
        Employee.sort(roster);
        for(int i = 0; i < roster.length; i++) {
            System.out.println(roster[i].getTotalHours());
        }
    }

}
