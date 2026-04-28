package MyPractice;
//Single Responsibility Principle
class Cake {
    public void bakeCake(){
        System.out.println("Baking High Quality Cake");
    }
}

class InventoryManager{
    public void manageInventory(){
        System.out.println("Managing Inventories......!!!!");
    }
}

class SupplyOrder{
    public void orderSupplies(){
        System.out.println("Ordering Supplies");
    }
}

class CustomerService{
    public void serveCustomers(){
        System.out.println("Serving to Customers");
    }
}

public class CakeMaker{
    public static void main(String[] args){
        Cake a = new Cake();
        InventoryManager b = new InventoryManager();
        SupplyOrder c = new SupplyOrder();
        CustomerService d = new CustomerService();

        a.bakeCake();
        b.manageInventory();
        c.orderSupplies();
        d.serveCustomers();
    }
}

