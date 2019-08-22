package week4.ProgrammingExercisesChapter4;

public class Billing {
    public static void main(String[] args) {

        System.out.println(computeBill(10));
        System.out.println(computeBill(10, 2));
        System.out.println(computeBill(10, 2, 5));
    }

    private static double computeBill(double price){
        return 1.08*price;
    }
    private static double computeBill(double price, int numOrdered){
        return 1.08*(price*numOrdered);
    }
    private static double computeBill(double price, int numOrdered, double couponValue){
        return 1.08*(price*numOrdered-couponValue);
    }
}
