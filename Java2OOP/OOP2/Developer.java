import java.util.ArrayList;
// POJO - Plain Old Java Object
public class Developer{
    // 1. private member variables / attributes (property of this class / what it has)
    private String name;
    private boolean isHungry;
    private ArrayList<String> skills; 
    private int monthsCoding;
    private int braincell;

    // 2. Constructors
    public Developer(){ // new Developer();
        this.name = "Anonymous Developer";
        this.isHungry = true;
        this.skills = new ArrayList<String>();
        this.monthsCoding = 0;
        this.braincell = 10;
    }

    public Developer(String name){
        this.name = name;
        this.isHungry = true;
        this.skills = new ArrayList<String>();
        this.skills.add("Java");
        this.skills.add("Vanilla css");
        this.monthsCoding = 3;
        this.braincell = 9;
    }

    // 3. getters (method to display) & setters (method to reassign)
    // getters: need return, no parameters
    public String getName(){
        return this.name;
    }

    // setters: no return, need parameters
    public void setName(String name){
        this.name = name;
        // this.name : refers to the name of this object
        // name :  search for the closest name in the scope - refers to name in parameters
    }

    public boolean getIsHungry(){
        return this.isHungry;
    }

    public void setIsHungry(boolean isHungry){
        this.isHungry = isHungry;
    }

    public ArrayList<String> getSkills(){
        return this.skills;
    }

    public void setSkills(ArrayList<String> skills){
        this.skills = skills;
    }

    public int getMonthsCoding(){
        return this.monthsCoding;
    }

    public void setMonthsCoding(int monthsCoding){
        this.monthsCoding = monthsCoding;
    }

    public int getBraincell(){
        return this.braincell;
    }

    public void setBraincell(int braincell){
        this.braincell = braincell;
    }

    // 4. Other methods
    public void display(){
        System.out.println("======== Developer Display ========");
        System.out.println("Name: "+ this.name);
        System.out.println("Is hungry?: "+ this.isHungry);
        System.out.println("skills: "+ this.skills);
        System.out.println("monthsCoding: "+ this.monthsCoding);
        System.out.println("braincell: "+ this.braincell);
    }

}