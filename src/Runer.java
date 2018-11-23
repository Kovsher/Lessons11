import java.util.Scanner;

public class Runer {
    public static void main(String[] args) {


    }


    public static Car createCar(String className) {
        if ("Bmw".equals(className)) {
            return createBmw();
        } else if ("Mazda".equals(className)) {
            return creatMazda();
        }
        return null;

    }

    public static Bmw createBmw() {
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Bmw creation started");
            System.out.println("Enter color");
            String color = sc.next();
            System.out.println("Enter isAutomatic");
            boolean isAutomat = sc.nextBoolean();
            System.out.println("Enter power");
            int power = sc.nextInt();
            System.out.println("Enter numberOfSpoler");
            int spolers = sc.nextInt();
            return new Bmw(color, isAutomat, power, spolers);
        } catch (InvalidCarParametersException) {
            System.out.println("invalid" + e.getMessage());
            return createBmw();
        } catch (InvalidCarParametersException) {
            System.out.println("Invalid");
            return createBmw();
        }
    }

}


