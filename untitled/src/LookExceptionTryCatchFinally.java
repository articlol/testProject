

public class LookExceptionTryCatchFinally {
    public static void main(String[] args) {
        System.out.println(getValue(0));

    }
        public static int getValue(int a) {
            try {
                if (a == 0) {throw new Exception("Something happened...");}
                else{ return 1;}
            } catch(Exception e) {
                throw new Exception("Oh, what's again...");
            } finally {
                return 3 + a;
            }

        }


}
