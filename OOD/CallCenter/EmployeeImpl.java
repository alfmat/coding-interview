package CallCenter;

public class EmployeeImpl implements EmployeeInterface {

    public String name;
    public String title;
    public boolean busy;

    public EmployeeImpl(String n, String t) {
        this.name = n;
        this.title = t;
        this.busy = false;
    }

    public boolean isBusy() {
        return this.busy;
    }

    public void setBusy() {
        this.busy = true;
    }

    public void setFree() {
        this.busy = false;
    }
    
}
