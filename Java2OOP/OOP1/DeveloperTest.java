public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("-----DEVELOPER TEST-----");

        Developer dev1 = new Developer();
        dev1.name= "Pepper";
        dev1.skills.add("Sleeping on the keyboard");
        dev1.display();

        Developer dev2 = new Developer();
        dev2.name="Heidi";
        Developer dev3 = new Developer();
        dev3.name="John";

        dev2.display();
        dev3.display();
    }
}