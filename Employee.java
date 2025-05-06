public class Employee {
    String name;
    int id;
    double salary;
    int phoneno;
    public Employee(String name,int id, double salary,int phoneno){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.phoneno=phoneno;
    }
    public void displayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Phoneno: "+phoneno);
    }
    public static void main(String[] args){
        Employee emp1=new Employee("XYZ", 101, 50000.0,89098776);
        emp1.displayInfo();
    }
    
}
