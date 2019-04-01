public class DefaultMethods implements Jump, Fly {
    public static void main(String[] args) {
        DefaultMethods man = new DefaultMethods();
        man.walk();
    }


}
interface Jump{
    default void walk(){
        System.out.println("do somthing...");
    }
}
interface Fly extends Jump{
    default void walk(){
        System.out.println("do somthing... ewery where");
    }
}


