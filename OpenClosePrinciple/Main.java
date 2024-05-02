package OpenClosePrinciple;

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("Lance", "Student", 250.00);
        Customer senior = new Customer("JM", "Senior Citizen", 300.00);
        Customer regular = new Customer("Lem", "Regular", 200.00);
    
        System.out.println("Student Discounted price is " + student.applyDiscount(student.getAmount()));
        System.out.println("Senior Discounted price is " + senior.applyDiscount(senior.getAmount()));
        System.out.println("Regular Discounted price is " + regular.applyDiscount(regular.getAmount()));
    }
}
