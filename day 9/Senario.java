abstract class Employee{
    String name;
    int id;
    Employee(String name,int i){
        this.name=name;
        this.id=id;
    }
    abstract double salary();
    
}
class FulltimeEmp extends Employee{
    double monthlysal;
    FulltimeEmp(String name,int id, double monthlysal){
        super(name,id);
        this.monthlysal=monthlysal;
    }
    double salary(){
        return monthlysal;
    }
}
class Parttimeemp extends Employee{
    int numofhours;
    int hoursrate;
    Parttimeemp(String name,int id,int numofhours,int hoursrate){
        super(name,id);
        this.numofhours=numofhours;
        this.hoursrate=hoursrate;
    }
    double salary(){
        return numofhours*hoursrate;
    }
}

public class Senario {
    public static void main(String[] args) {
        Employee e1=new FulltimeEmp("Rohan", 1234, 100000);
        Employee e2=new Parttimeemp("Riyas", 5678,3,20000);
        //System.out.println("Name: "+e1.name+"\nID: "+e1.id+"\nSalary: "+e1.salary());
        System.out.println("Name: "+e2.name+"\nID: "+e2.id+"\nSalary: "+e2.salary());
    }
    
}
