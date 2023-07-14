import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Ram", "Assistant");
        Employee assisManager = new Employee("Nicholas", "Sales Manager");
        Employee manager = new Employee("Shyam", "CEO");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}
