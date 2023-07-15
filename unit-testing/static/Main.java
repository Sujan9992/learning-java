public class Main {
  
    public static void main(String[] args) {
        Employee james = new Employee("James", "Assistant");
        System.out.println(james);
        System.out.println(Employee.getHiredCount());
        Employee jack = new Employee("Jack", "Assistant");
        System.out.println(jack);
        System.out.println(Employee.getHiredCount());
    }
  
}
