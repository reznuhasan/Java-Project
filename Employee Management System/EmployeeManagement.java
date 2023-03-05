import java.util.Scanner;

class Employee {
    public String name;
    protected int id;
    private double salary;
    private String password;

    Employee(String name, int id, double salary, String pass) {
        System.out.println("Created Employee Id is " + id);
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.password = pass;
    }

    public double getSalary() {
        return salary;
    }

    public void displayName() {
        System.out.println(this.name);
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void resetPassword(String password) {
        this.password = password;
    }
}

public class EmployeeManagement {

    static Employee arr[] = new Employee[20];
    static int id = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter your option");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.print("enter your name:");
                sc.nextLine();
                String name = sc.nextLine();
                id += 1;
                System.out.print("enter your Salary:");
                double salary = sc.nextDouble();
                System.out.print("enter your Password:");
                sc.nextLine();
                String pass = sc.nextLine();
                Employee obj = new Employee(name, id, salary, pass);
                arr[id] = obj;
            } else if (n == 2) {
                System.out.println("*************View Employee*************");
                System.out.print("Give Your Employee ID Number:");
                int num = sc.nextInt();
                if (num > id) {
                    System.out.println("*************Wrong Id*************");
                } else {
                    System.out.print("Enter Your Employee Password:");
                    sc.nextLine();
                    String password = sc.nextLine();
                    if (password.equals(arr[num].getPassword())) {
                        System.out.println("Employee Name \t\t\t Employee ID \t\t\t Employee Salary");
                        System.out.println(
                                arr[num].name + " \t\t\t\t " + arr[num].id + " \t\t\t\t " + arr[num].getSalary());
                    } else {
                        System.out.println("*************Wrong Password*************");
                    }
                }

            } else if (n == 3) {
                System.out.println("*************Update Employee*************");
                System.out.print("Give Your Employee ID Number:");
                int num = sc.nextInt();
                if (num > id) {
                    System.out.println("*************Wrong Id*************");
                } else {
                    System.out.print("Enter Your Employee Previous Password:");
                    sc.nextLine();
                    String password = sc.nextLine();
                    if (password.equals(arr[num].getPassword())) {
                        System.out.println("1.change name");
                        System.out.println("2.change salary");
                        System.out.println("3.change password");
                        System.out.println("4.All Data Change");
                        int op = sc.nextInt();
                        if (op == 4) {
                            System.out.print("enter your name:");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.print("enter your Salary:");
                            double salary = sc.nextDouble();
                            System.out.print("enter your Password:");
                            sc.nextLine();
                            String pass = sc.nextLine();
                            arr[num].setName(name);
                            arr[num].setSalary(salary);
                            arr[num].resetPassword(pass);
                        }else if(op==1){
                            System.out.print("enter your name:");
                            sc.nextLine();
                            String setName = sc.nextLine();
                            arr[num].setName(setName);
                        }else if(op==2){
                            System.out.print("enter your Salary:");
                            double setSalary = sc.nextDouble();
                            arr[num].setSalary(setSalary);
                        }else if(op==3){
                            System.out.print("enter your name:");
                            sc.nextLine();
                            String setPassword = sc.nextLine();
                            arr[num].resetPassword(setPassword); 
                        }

                    } else {
                        System.out.println("*************Wrong Password*************");
                    }
                }
            } else if (n == 5) {
                System.out.println("*************Show All Employees Details*************");
                System.out.println("Employee Name \t\t\t Employee ID \t\t\t Employee Salary");
                for (int i = 0; i <= id; i++) {
                    System.out.println(arr[i].name + " \t\t\t\t " + arr[i].id + " \t\t\t\t " + arr[i].getSalary());
                }
            } else if (n == 6) {
                break;
            }

        }

    }
}