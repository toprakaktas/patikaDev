public class Employee {
    String name;
    double salary;
    int workHours;
    int hiredYear;

    //constructor
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredYear = hireYear;
    }

    public double tax(){
        if ( this.salary < 1000)
            return 0.0;
        else
            return this.salary  * 0.03;
    }

    public double bonus(){
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        else
            return 0.0;
    }

    public double raiseSalary(){
        if (this.hiredYear <= 2021){
            if (2021 - this.hiredYear < 10)
                return this.salary * 0.05;
            else if (this.hiredYear > 9 && this.hiredYear < 20)
                return this.salary * 0.1;
            else
                return this.salary * 0.15;
        }else return 0.0;
    }

    public String toString(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hired Year: " + this.hiredYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary raise: " + raiseSalary());
        System.out.println("Salary with bonuses and taxes: " + (this.salary - tax() + bonus()));
        System.out.println("Total salary: " + (this.salary + raiseSalary() + bonus() - tax()));
        return null;
    }
}
