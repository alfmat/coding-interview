package CallCenter;

import java.util.List;
import java.util.ArrayList;

public class Center {
    
    // properties
    private List<Manager> managers;
    private List<Respondent> respondents;
    private List<Director> directors;

    public Center() {
        this.managers = new ArrayList<Manager>();
        this.respondents = new ArrayList<Respondent>();
        this.directors = new ArrayList<Director>();
    }

    public void addEmployee(String name, String title) {
        if(title.equals("Manager")) {
            this.managers.add(new Manager(name, title));
        } else if(title.equals("Respondent")) {
            this.respondents.add(new Respondent(name, title));
        } else {
            this.directors.add(new Director(name, title));
        }
    }

    public String dispatchCall() {
        for(Respondent emp: this.respondents) {
            if(!emp.isBusy()) {
                emp.setBusy();
                return emp.name;
            }
        }

        for(Manager emp: this.managers) {
            if(!emp.isBusy()) {
                emp.setBusy();
                return emp.name;
            }
        }

        for(Director emp: this.directors) {
            if(!emp.isBusy()) {
                emp.setBusy();
                return emp.name;
            }
        }
        return "None Available";
    }
}
