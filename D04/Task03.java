import java.math.BigDecimal;

class ComplexNumber<T extends BigDecimal> {
    private T real;
    private T img;

    public ComplexNumber(T _real, T _img) {
        this.real = _real;
        this.img = _img;
    }

    public T getReal() {
        return real;
    }

    public T getImg() {
        return img;
    }

    public ComplexNumber<T> addComplex(ComplexNumber<T> number) {
        return new ComplexNumber<T>((T) this.real.add(number.real), (T) this.img.add(number.img));
    }

    public ComplexNumber<T> subtractComplex(ComplexNumber<T> number) {
        return new ComplexNumber<T>((T) this.real.subtract(number.real),
                (T) this.img.subtract(number.img));
    }
}

public class Task03 {

    public static void main(String args[]) {
		if (args.length != 4){
			System.out.println("Missing Arguments, please enter four number");
		} else {
			if(args[0].matches("-?\\d+(\\.\\d+)?") && args[1].matches("-?\\d+(\\.\\d+)?") &&
                args[2].matches("-?\\d+(\\.\\d+)?") && args[3].matches("-?\\d+(\\.\\d+)?")) {
					BigDecimal real1 = new BigDecimal(args[0]);
					BigDecimal img1 = new BigDecimal(args[1]);
					BigDecimal real2 = new BigDecimal(args[2]);
					BigDecimal img2 = new BigDecimal(args[3]);

					ComplexNumber<BigDecimal> complex1 = new ComplexNumber<>(real1, img1);
					ComplexNumber<BigDecimal> complex2 = new ComplexNumber<>(real2, img2);

					ComplexNumber<BigDecimal> result = complex1.addComplex(complex2);
					System.out.println("Addition : " + result.getReal() + " + " + result.getImg() + "i");

					result = complex1.subtractComplex(complex2);
					System.out.println("Subtraction : " + result.getReal() + " + " + result.getImg() + "i");
			} else {
				System.out.println("Invalid Input");
			}
		}
    }
}