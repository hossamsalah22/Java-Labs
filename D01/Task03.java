
class Task03 {
	public static void main(String args[]) {
		if (args.length != 2) {
			System.out.println("Arguments must be only 2");
		} else {
			if (args[0].matches("\\d+")) {
				int x = Integer.parseInt(args[0]);

				for (int i = 0; i < x; i++) {
					System.out.println(args[1]);
				}
			} else {
				System.out.println("First Args Must Be Number");
			}
		}
	}
}
