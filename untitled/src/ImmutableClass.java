import java.util.Date;


final class ImmutableClass { // Объявляем класс finale
    private final int i;     // Поля private и finale
    private final Date d;

    public ImmutableClass(int i, Date d) {
        this.i = i;
        this.d = (d == null) ? null : new Date(d.getTime()); // Чтобы ссылочная переменная была immutable в конструкторе создаем копию
    }

    public int getI() {

        return this.i;
    }

    public Date getD() {

        return (d == null) ? null : new Date(d.getTime()); // Также создаем копию в геттере
    }

    public static void main(String[] args) {
        Date d = new Date();
        ImmutableClass immutableClass = new ImmutableClass(3,d);
        d.setTime(0);
        System.out.println(immutableClass.getD());
    }

}