public class Salary {
    public static void main(String[] args) {
        int salary = 2000;
        int newSalary = 0;
        switch (salary) {
            case 100:
                newSalary = salary + 1000;
                break;
            case 2000:
                newSalary = salary + 200;
                break;
            case 2500:
                newSalary = salary + 25;
                break;
        }
        double i = ((double) newSalary / salary) * 100 - 100;
        System.out.println("Salary: " + salary);
        System.out.println("New Salary: " + newSalary);
        System.out.println("Brawo ! Twoja wypłata jest wyższa o " + i + "%");
    }
}
