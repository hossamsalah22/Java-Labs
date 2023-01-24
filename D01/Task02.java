class Task02 {
	public static void main(String args[]) {
		if (args.length >= 1) {
			System.out.println("Arguments are: ");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("You Must Pass at Leaast one arguments");
		}
	}
}