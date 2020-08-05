class Person{

}

class Employee extends Person{
    void computePay(){
        System.out.println("Employee pay");
    }

    static void expenseAllowance(){         // add static, method belongs to the class
        System.out.println("in Employee");
    }
}

class Manager extends Employee{
    @Override
    void computePay(){          // same name, same number of arguments
        System.out.println("Manager pay");
    }

    static void expenseAllowance(){
        System.out.println("in Manager");
    }
}

public class InstanceMethod {
    public static void main(String[] args) {
        Manager man = new Manager();
        Employee emp1 = new Employee();
        Employee emp2 = (Employee)man;

        emp1.computePay();
        man.computePay();

        // upcast Manager class to Employee class
        // however, variable emp2 points to the reference object which is man (Manager class)
        // so computePay method is called, program will start looking from Manager class
        emp2.computePay();

        emp1.expenseAllowance();
        man.expenseAllowance();

        // upcast Manager class to Employee class
        // static method can only be accessed by a member of class
        // it looks up to Employee class ( emp2 is an instance of Employee, it points to Manager class object  )
        emp2.expenseAllowance();
    }
}
