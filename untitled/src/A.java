import java.util.Date;


final class A {
    private final int i;
    private final Date d;

    public A(int i, Date d) {
        this.i = i;
        this.d = (d == null) ? null : new Date(d.getTime());
    }

    public int getI() {

        return this.i;
    }

    public Date getD() {

        return (d == null) ? null : new Date(d.getTime());
    }

    public static void main(String[] args) {
        Date d = new Date();
        A a = new A(3,d);
        d.setTime(0);
        System.out.println(a.getD());
    }

}