package Patterns;

enum MySweetSingletonEnum{
    INSTANCE;

    MySweetSingletonEnum() {
        System.out.println("HE'S LIFE, WHITH ENUM !!!");
    }
}
public class SingletonEnumPattnern {
    public static void main(String[] args) {
        System.out.println(MySweetSingleton.INSTANCE);
    }
}
