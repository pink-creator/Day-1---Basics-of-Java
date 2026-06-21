import java.util.*;

class Question1_Variables {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        float percentage = sc.nextFloat();
        char ch = sc.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + ch);

        sc.close();
    }
}