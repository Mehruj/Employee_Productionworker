public class Employee {
    String name;
    String employeeNumber;
    String hireDate;

    public Employee(){
        name= " ";  // JAVA CEATES AUTOMATICALLY
        employeeNumber= " ";
        hireDate= " ";
    }
    public Employee(String name, String employeeNumber, String hireDate){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }
    public Employee(String name, String employeeNumber){
        this.name= name;
        this.employeeNumber= employeeNumber;
        hireDate="12/12/12";
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public String getName(){
            return name;
    }
    public String getHireDate(){
        return hireDate;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber= employeeNumber;
    }
    public void setHireDate(String hireDate){
        this.hireDate= hireDate;
    }

}
