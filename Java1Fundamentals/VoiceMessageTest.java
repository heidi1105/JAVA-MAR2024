import java.util.ArrayList;

class VoiceMessageTest{
    public static void main(String[] args){
        System.out.println("Test file");

        VoiceMessageUtil newBot = new VoiceMessageUtil();

        System.out.println(newBot.greetMessage());
        System.out.println(newBot.greetMessage("Pepper"));
        System.out.println(newBot.greetMessage(123));
        /* Behind the scene
        1. When VoiceMessageTest.java is compiled, it reads the instantiation of VoiceMessageUtil class
        2. The compiler search for VoiceMessageUtil.java in the same package/folder to compile
        3. Util file is compiled and all the methods in util can be used
        */   

    // 5. dependency injection (using methods in another file) & overloading methods
    // 6. Casting (implicit & explicit, Null VALUE)
    // implicit casting (no loss of data)
    int intAge = 15;
    double intToDoubleAge = intAge;
    System.out.println(intAge);
    System.out.println(intToDoubleAge);

    // explicit casting (loss of data)
    double doubleAge = 15.5;
    int doubleToIntAge = (int) doubleAge;  
    System.out.println(doubleAge);
    System.out.println(doubleToIntAge);

    // 7. Fixed Array & Loops
    int[] messagesPerDay = new int[3];
    // create an empty array with the size of 3
    messagesPerDay[0] = 5;

    int[] messagesPerDay2 = {5 , 8, 6};
    // create an array with these 3 values
    System.out.println(messagesPerDay2);

    newBot.printArray(messagesPerDay);
    newBot.printArray(messagesPerDay2);

    String[] messageArray = { 
        "Please call back!", 
        "Make sure you install jdk",
        "DO NOT INSTALL VS CODE EXTENSION!" 
    };
    newBot.printArray(messageArray);
    // 8. ArrayList     

    // reminders to store an array of String
    ArrayList<String> reminders = new ArrayList<String>();
    reminders.add("Stay hydrated");
    reminders.add("Use Bootstrap");
    reminders.add("Zip up your files");

    System.out.println(reminders);
    System.out.println(reminders.size());
    System.out.println(reminders.contains("Stay hydrated"));

    reminders.remove("Stay hydrated");
    System.out.println(reminders);
    System.out.println(reminders.get(1));

    newBot.printArray(reminders);



    }
}