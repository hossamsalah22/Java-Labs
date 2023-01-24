import java.util.function.Function;

class ConvertToFahrenheit implements Function<Double, Double> {
    public Double apply(Double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

class Task01 {
    public static Double TempConvert(double celsius, Function<Double, Double> convertToFahr) {
        return convertToFahr.apply(celsius);
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("You Must Provide a Temprature to convert");
        } else {
            Function<Double, Double> convertToFahrenheit = new ConvertToFahrenheit();
            Double fehr = TempConvert(Integer.parseInt(args[0]), convertToFahrenheit);
            System.out.println("Temp " + args[0] + "C = " + fehr + "F");
        }
    }
}
// (0°C × 9/5) + 32 = 32°F