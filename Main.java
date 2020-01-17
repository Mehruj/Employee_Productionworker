import java.util.Scanner;        // folders/ Package are in smaller case, Scanner is a Class
public class Main {
    public static void main(String[]args){
        Employee employee1 = new Employee("Tina", "2341", "13/12/13");
        Employee employee2= new Employee();

        Scanner keyBoard= new Scanner(System.in);
        String input;
        System.out.println("Please enter employee name: ");
        input= keyBoard.nextLine(); // take an input now
        employee2.setName(input);
        System.out.println("Enter employee number: ");
        input =keyBoard.nextLine();
        employee2.setEmployeeNumber(input);
        System.out.println("Please enter the hire date: ");
        employee2.setHireDate(keyBoard.nextLine());

        System.out.println(employee2.getName());
        System.out.println(employee2.getEmployeeNumber());
        System.out.println(employee2.getHireDate());

        ProductionWorker productionworker1 = new ProductionWorker("Sam", "21", "12/2/21",1,15.00);
        ProductionWorker productionworker2= new ProductionWorker(2, 15.00);
        System.out.println(productionworker1.getHireDate());
        System.out.println(productionworker2.getShift());

        ShiftSupervisor supervisor= new ShiftSupervisor(50000,7000 );
        System.out.println(supervisor.getAnnualBonus());
    }

}
