public class AutoServiceStation {
    public static Boolean carFix (Driver d) {
        Car c = d.getCar();
        if (c.getCarCondition().equals(CarCondition.BROKEN)){
            c.setCarCondition(CarCondition.WORKING);
            return true;
        }
        System.out.println("Car is working");
        return false;
    }
}
