package Inheritance;

public class Manager extends Employee {

    private String BusinessUnit;

    public Manager(){
    }

    public Manager(String BusinessUnit){
        this.BusinessUnit = BusinessUnit;
    }

    public String getBusinessUnit() {
        return BusinessUnit;
    }

    public void setBusinessUnit(String BusinessUnit){
        this.BusinessUnit = BusinessUnit;
    }
}
