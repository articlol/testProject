package Patterns;

import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
    public static void main(String[] args) {
/*      Command command = new MouceClick(); <---   так не по феншую
        command.execute(); */
        Receiver receiver = new Receiver();   // <---  по феншую
        receiver.addCommand(new TV());
        receiver.addCommand(new LifeHouse());
        receiver.RunCommand();
    }
}
interface Pult{
    void execute();
}
class TV implements Pult{

    @Override
    public void execute() {
        System.out.println("click command");
    }
}
class LifeHouse implements Pult{

    @Override
    public void execute() {
        System.out.println("click command press");
    }
}
class Receiver {
    List<Pult> commands = new ArrayList<>();
    void addCommand (Pult command) {
        commands.add(command);
    }
    void RunCommand(){
        for (Pult command : commands){
            command.execute();
        }
    }
}