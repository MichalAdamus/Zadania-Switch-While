public class Salary {
    public static void main(String[] args) {
        int salary = 2000;
        int newSalary = salary > 2000 ?salary : salary +200;

        System.out.println("Salary: " + salary);
        System.out.println("New Salary: " + newSalary);
        var i = (newSalary / salary)*10;
        System.out.println("Brawo ! Twoja wypłata jest wyższa o "+ i +"%");
    }
}
