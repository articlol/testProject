package Patterns;

public class Singleton {
    private static Singleton instance;

    public Singleton() {}
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();

        } return instance;
    }
    public void helife(){
        System.out.println("HE'S A LIFE !!!");
    }
}
class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.helife();

    }
}
