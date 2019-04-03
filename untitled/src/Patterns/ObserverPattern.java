package Patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexadecinalObserver(subject);

        subject.setState(123);
    }
}
class Subject{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }
    public void attach( Observer observer){
        observers.add(observer);
    }
    private void notifyAllObserver() {
        for (Observer eachObserver : observers){
            eachObserver.update();
        }
    }
}
abstract class Observer{
    protected Subject subject;
    public abstract void update();
}
class BinaryObserver extends Observer{
    public BinaryObserver (Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary " + Integer.toBinaryString(subject.getState()));
    }
}
class OctalObserver extends Observer{
    public OctalObserver (Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal " + Integer.toOctalString(subject.getState()));
    }
}
class HexadecinalObserver extends Observer{
    public HexadecinalObserver (Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecinal " + Integer.toHexString(subject.getState()));
    }
}
