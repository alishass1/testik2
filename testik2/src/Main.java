public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Пример из задания
        double height = 1.87; // рост в метрах
        int weight = 98;      // вес в килограммах

        int bmi = service.calculate(height, weight);
        System.out.println("При росте " + height + " м и весе " + weight + " кг:");
        System.out.println("Индекс массы тела (BMI) = " + bmi);

        // Дополнительные проверки
        System.out.println("\nДополнительные проверки:");

        // Проверка 1: Рост 1.75 м, вес 70 кг
        height = 1.75;
        weight = 70;
        bmi = service.calculate(height, weight);
        System.out.println("Рост: " + height + " м, вес: " + weight + " кг -> BMI: " + bmi);
        // 70 / (1.75 * 1.75) = 70 / 3.0625 = 22.85 -> 22

        // Проверка 2: Рост 1.65 м, вес 55 кг
        height = 1.65;
        weight = 55;
        bmi = service.calculate(height, weight);
        System.out.println("Рост: " + height + " м, вес: " + weight + " кг -> BMI: " + bmi);
        // 55 / (1.65 * 1.65) = 55 / 2.7225 = 20.20 -> 20

        // Проверка 3: Рост 1.80 м, вес 90 кг
        height = 1.80;
        weight = 90;
        bmi = service.calculate(height, weight);
        System.out.println("Рост: " + height + " м, вес: " + weight + " кг -> BMI: " + bmi);
        // 90 / (1.80 * 1.80) = 90 / 3.24 = 27.78 -> 27
    }
}