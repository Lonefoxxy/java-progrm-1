public class EmployeeTest {
    public static void main(String args[]) {
        Employee []Staff = new Employee[3];

        Staff[0] = new Employee("abc",200.3);
        Staff[1] = new Employee("fox",202.3);
        Staff[2] = new Employee("akk",201.3);

        for(Employee e: Staff){
            System.out.println(" Name " + e.getName() +" salary " + e.getsalary() + "/n");
        }
    }
}
