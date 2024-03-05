import java.util.ArrayList;

public class Developer{
    // 1. member variables / attributes (property of this class / what it has)
    public String name;
    public boolean isHungry = true;
    public ArrayList<String> skills = new ArrayList<>(); 
    public int monthsCoding;
    public int braincell = 10;

    // 2. methods
    public void display(){
        System.out.println("======== Developer Display ========");
        System.out.println("Name: "+ this.name);
        System.out.println("Is hungry?: "+ this.isHungry);
        System.out.println("skills: "+ this.skills);
        System.out.println("monthsCoding: "+ this.monthsCoding);
        System.out.println("braincell: "+ this.braincell);
    }

}