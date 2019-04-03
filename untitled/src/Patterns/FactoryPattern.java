package Patterns;

public class FactoryPattern {
    public static void main(String[] args) {
        String music = "bosse";
        FactorySystem factorySystem = new FactorySystem();
        MusicSystems musicSystems = factorySystem.getSystem(music);
        musicSystems.getMusicSystem();
    }
}
interface MusicSystems{
    void getMusicSystem();
}
class Mazda implements MusicSystems{
    @Override
    public void getMusicSystem() {
        System.out.println("Installed BOSSE music system");
    }
}
class BMW implements MusicSystems{
    @Override
    public void getMusicSystem() {
        System.out.println("Installed BENQ OLSEN music system");
    }
}
class Kia implements MusicSystems{
    @Override
    public void getMusicSystem() {
        System.out.println("Installed MARK LEVINSON");
    }
}
class FactorySystem{
    public MusicSystems getSystem(String systemMusic){
        MusicSystems musicSystems = null;
        if (systemMusic.equals("bosse")){
            musicSystems = new Mazda();
        } else if(systemMusic.equals("benq")){
            musicSystems = new BMW();
        } else if (systemMusic.equals("mark")){
            musicSystems = new Kia();
        } return musicSystems;

    }
}
