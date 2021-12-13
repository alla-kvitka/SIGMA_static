public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Stefano", new Car("Mazeratti", CarCondition.WORKING));
        Driver d2 = new Driver("Tonia", new Car("Bugatti", CarCondition.WORKING));
        d1.getCar().setCarCondition(CarCondition.BROKEN);
        System.out.println("For first driver car status is: "+d1.getCar().getCarCondition().toString());
        d2.getCar().setCarCondition(CarCondition.BROKEN);
        System.out.println("For second driver car status is: "+d2.getCar().getCarCondition().toString());
        d1.carFix(d1.getCar());
        System.out.println("For first driver car status after fix is: "+d1.getCar().getCarCondition().toString());
        AutoServiceStation.carFix(d2);
        System.out.println("For first second car status after fix is: "+d1.getCar().getCarCondition().toString());
        AutoServiceStation.carFix(d2);
        System.out.println("For first second car status after fix is: "+d1.getCar().getCarCondition().toString());
    }
}
