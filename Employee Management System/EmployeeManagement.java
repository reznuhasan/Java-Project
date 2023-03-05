import java.util.Scanner;
class Employee{
    public String name;
    protected int id;
    private double salary;
    private String password;
    Employee(String name,int id,double salary,String pass){
      this.name=name;
      this.id=id;
      this.salary=salary;
      this.password=pass;
    }
    public double getSalary(){
        return salary;
    }
    public void displayName(){
       System.out.println(this.name); 
    }
}
public class EmployeeManagement{
    
   static Employee arr[]=new Employee[20];
   static int id=-1;
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        while(true){
            System.out.print("enter your option");
            int n=sc.nextInt();
            if(n==1){
                System.out.print("enter your name:");
                sc.nextLine();
                String name=sc.nextLine();
                id+=1;
                System.out.print("enter your Salary:");
                double salary=sc.nextDouble();
                System.out.print("enter your Password:");
                sc.nextLine();
                String pass=sc.nextLine();
                Employee obj=new Employee(name, id, salary, pass);
                arr[id]=obj;
            }else if(n==2){
                for(int i=0;i<=id;i++){
                    System.out.println(arr[i].name);
                }   
            }else if(n==6){
                break;
            }
            
        }
        
    }
}