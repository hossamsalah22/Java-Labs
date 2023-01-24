import java.util.function.Function;

class Task01 {
    public static int TempConvert(int celsius, Function<Integer, Integer> convertToFahrenheit) {
        return convertToFahrenheit.apply(celsius);
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("You Must Provide a Temprature to convert");
        } else {
            Function<Integer, Integer> convertToFahrenheit = (celsius) -> (celsius * 9 / 5) + 32;
            int fehr = TempConvert(Integer.parseInt(args[0]), convertToFahrenheit);
            System.out.println("Temp " + args[0] + "C = " + fehr + "F");
        }
    }
}
// (0°C × 9/5) + 32 = 32°F