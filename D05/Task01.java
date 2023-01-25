import java.util.function.BiPredicate;

class BetterStringMethod {
    public static String betterString(String str1, String str2, BiPredicate<String, String> biPredicate) {
        if (biPredicate.test(str1, str2)) {
            return str1;
        } else {
            return str2;
        }
    }
}

class Task01 {
    public static void main(String[] args) {
        if (args.length != 2) {

        } else {

            String str1 = args[0];
            String str2 = args[1];
            String longerString = BetterStringMethod.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
            System.out.println("The Longest String is " + longerString);
            String firstString = BetterStringMethod.betterString(str1, str2, (s1, s2) -> true);
            System.out.println("The First String is " + firstString);
        }
    }
}
