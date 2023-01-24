class Task01 {
    public static void main(String args[]) {
        int myArray[];
        myArray = new int[1000];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.floor(Math.random() * i));
        }

		long before = System.currentTimeMillis();
		long beforeNano = System.nanoTime();
        int min = myArray[0];
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
		long after = System.currentTimeMillis();
		long afterNano = System.nanoTime();
        System.out.print("Minimum Number in array: ");
        System.out.println(min);
        System.out.print("Maximum Number in array: ");
        System.out.println(max);

		System.out.print("Run time = ");
        System.out.println(after - before);
		System.out.print("Run time Deff in NanoSeconds = ");
        System.out.println(afterNano - beforeNano);

    }
}