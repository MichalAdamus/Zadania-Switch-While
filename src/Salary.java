public class Salary {
    public static void main(String[] args) {
        int salary = 2000;
        int newSalary = 0;
        if (salary == 100) {
            newSalary = salary + 1000;
        }
        if (salary == 2000) {
            newSalary = salary + 200;
        }
        if (salary == 2500) {
            newSalary = salary + 25;
        }
        double i = ((double)newSalary/ salary)*100-100;
        System.out.println("Salary: " + salary);
        System.out.println("New Salary: " + newSalary);
        System.out.println("Brawo ! Twoja wypłata jest wyższa o " + i + "%");
    }
}
