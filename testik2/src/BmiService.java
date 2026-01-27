public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {

        double bmiIndex = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmiIndex;
    }
}
