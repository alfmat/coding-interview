package CallCenter;

public class TestCenter {
    public static void main(String args[]) {
        Center center = new Center();
        center.addEmployee("Tom", "Respondent");
        center.addEmployee("Jim", "Director");
        center.addEmployee("Larry", "Manager");

        System.out.println(center.dispatchCall());
        System.out.println(center.dispatchCall());
        System.out.println(center.dispatchCall());
    }
}
