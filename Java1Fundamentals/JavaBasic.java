// PascalCase (class & filename), camelCase (variable, methods), snake_case
// 1. compile java (javac & java)
public class JavaBasic{
    public static void main(String[] args){
        System.out.println("Hello Java!");
        // 2. variables 
        // 2.1 int, double, boolean, char, String 
        String projectTitle = "Cafe Java"; // array of char --> memeory location --> object
        String developer = "Heidi";
        int totalFiles = 2;
        boolean isDone = true;
        double requiredTime = 1.5;
        char difficulty = 'B';

        System.out.println(projectTitle);
        System.out.println(developer);
        System.out.println(totalFiles);
        System.out.println(isDone);
        System.out.println(requiredTime);
        System.out.println(difficulty);
        // 2.2 Primitive VS Wrapper Class
        //primitive: no null
        // Wrapper: null
        System.out.println(Integer.MIN_VALUE);
        // 3. conditionals & ternary
        if(isDone){
            System.out.println("The assignment is done");
        }else{
            System.out.println("The assignment is not done");
        }

        if(totalFiles > 1){ // conditon has to be a boolean
            System.out.println("Please zip up the files before you submit");
        }

        System.out.println(totalFiles > 1 ? 
            "Please zip up the files before you submit":
            "There is only 1 file in this project");

        // 4. String (length, indexOf, format, trim(), .equals )
        System.out.println("Project title length: " + projectTitle.length());
        // concat String
        String projectDetails = projectTitle + " (" + developer + ")" ;
        System.out.println(projectDetails);

        String projectDetails2 = projectTitle.concat("---").concat(developer);
        System.out.println(projectDetails2);

        String projectDetails3 = String.format("Project title: %s | RequiredTime : %.2f", projectTitle, requiredTime);
        System.out.println(projectDetails3);
        // System.out.printf("Project title: %s | RequiredTime : %.2f", projectTitle, requiredTime);

        // String comparison
        String name1 = "Pepper";
        String name2 = "Pepper";
        String name3 = new String("Pepper");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name3));
   
    }
}
