public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("-----DEVELOPER TEST-----");
        System.out.println("Developer Count: "+ Developer.getDevCount());
        System.out.println("Total skills in Developer class: "+ Developer.getTotalSkills());
        Developer dev1 = new Developer("Pepper"); // +2 skills

        // dev1.skills.add("Sleeping on the keyboard");
        // dev1.display();

        Developer dev2 = new Developer("Heidi"); // +2 skills
       
        Developer dev3 = new Developer();
        
        System.out.println("Developer Count: "+ Developer.getDevCount());
        System.out.println("Total skills in Developer class: "+ Developer.getTotalSkills());
        // dev2.display();
        // dev3.display();
        dev2.learnNewSkill("Tailwind");
        System.out.println("Total skills in Developer class: "+ Developer.getTotalSkills());
        dev2.display();
    }
}