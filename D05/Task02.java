class Task02 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please Enter One Argument to Check");
        } else {
            if (checkAlpha(args[0])) {
                System.out.println("Only Alphapets");
            } else {
                System.out.println("Mixed String");
            }
        }
    }

    public static boolean checkAlpha(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}