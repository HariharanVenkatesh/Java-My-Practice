package Inheritance;

public class BusinessLogic {
    static void main(){
        Manager a = new Manager();

        a.setEmployeeName("Ashwin");
        a.setEmployeeNo(1001);
        a.setBusinessUnit("IT");
        System.out.println(a.getEmployeeName());
        System.out.println(a.getEmployeeNo());
        System.out.println(a.getBusinessUnit());

        Employee b = new Employee();
        b.setEmployeeName("Abi");
        b.setEmployeeNo(1002);
        System.out.println(b.getEmployeeName());
        System.out.println(b.getEmployeeNo());
    }
}
