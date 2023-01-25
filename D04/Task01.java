class customException extends Exception {
    public customException(String msg) {
        super(msg);
    }
}

class exceptions {
    public void divison(int n1, int n2) throws customException {
        if (n2 == 0)
            throw new customException("Divison By Zero");
    }

    public void negativeRoot(int n1, int n2) throws customException {
        if (n1 < 0)
            throw new customException("Negative number under Root");
    }
}

public class Task01 {
    // Calling Function
    public static void example(int n1, int n2) {
        exceptions newException = new exceptions();
        try {
            newException.divison(n1, n2);
            newException.negativeRoot(n1, n2);
        } catch (customException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

    }

    public static void main(String[] args) {
        example(4, 0);
        example(-5, 5);
    }
}