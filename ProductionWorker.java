public class ProductionWorker extends Employee{
    int shift;
    double hourlyPay;
    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPay){
        super(name,employeeNumber,hireDate);
        this.shift= shift;
        this.hourlyPay= hourlyPay;
    }
    public ProductionWorker(int shift, double hourlyPay){
        this.shift= shift;
        this.hourlyPay= hourlyPay;
    }
    public ProductionWorker(){
        shift= 1;
        hourlyPay= 9;
    }
    public int getShift(){
        return shift;
    }
    public double hetHourlyPay(){
        return hourlyPay;
    }
    public void setShift(int shift){
        this.shift= shift;
    }
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }

}
