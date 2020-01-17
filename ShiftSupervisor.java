public class ShiftSupervisor extends Employee {
    int annualSalary;
    int annualBonus;
    public ShiftSupervisor(){
        annualSalary= 120;
        annualBonus= 100;
    }
    public ShiftSupervisor( int annualSalary, int annualBonus){
        this.annualSalary= annualSalary;
        this.annualBonus= annualBonus;
    }
    public ShiftSupervisor(int annnualSalary){
        this.annualSalary= annualSalary;
        annualBonus= 0;
    }
    public int getAnnualSalary(){
        return annualSalary;
    }
    public int getAnnualBonus(){
        return annualBonus;
    }
    public void setAnnualSalary(int annualSalary){
        this.annualSalary= annualSalary;
    }
    public void setAnnualBonus(int annualBonus){
        this.annualBonus= annualBonus;
    }
}
