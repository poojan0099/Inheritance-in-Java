//Program on Multi-level Inheritance
class Employee{
    int salary=40000;
    int a,b;
    int sum_employee()
    {
        a = 5;
        b = 6;
        int c = a+b;
        return c;
    }
}
class Branch extends Employee{
    String branch[] = {"Pune", "Mumbai", "Banglore"};
    void inBranch()
    {
        System.out.println("\nBranch Class Method called!!");
        System.out.println(sum_employee());
    }
}
class Programmer extends Branch{
    void display()
    {
        String name = "Poojan";
        System.out.println(salary+" "+name+" "+branch[1]);
        inBranch();
    }
public static void main(String[] args)
{
    Programmer p = new Programmer();
    p.display();
}
}
