import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private String name;
    private Car car;

    public boolean carFix(Car car) {
        if (car.getCarCondition().equals(CarCondition.BROKEN)) {
            car.setCarCondition(CarCondition.WORKING);
            return true;
        }
        System.out.println("Car is working!");
        return false;
    }
}