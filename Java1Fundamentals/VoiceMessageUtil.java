import java.util.Date;
import java.util.ArrayList;

class VoiceMessageUtil{
    // overloading methods (same name, different signature)
    public String greetMessage(){
        Date currentDate = new Date();
        return "Hi, it is "+ currentDate;
    }

    public String greetMessage(String name){
        return "Hi, "+ name;
    }

    public String greetMessage(int count){
        return "Hi with count, "+ count;
    }

    // loops
    // no return, traditional for-loop (could use enhanced for-loop)
    public void printArray(int[] array){
        for(int i = 0 ; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    
        // no return, enhanced for-loop (could use traditional for-loop)
    public void printArray(String[] array){
        for(String element : array){
            System.out.println(element);
        }
    }

    public void printArray(ArrayList<String> array){
        // traditional for-loop for arrayList
        for(int i =0 ; i<array.size(); i++){
            System.out.println(array.get(i));
        }

        // enhanced for-loop for arrayList (same as fixed array)
        for(String element : array){
            System.out.println(element);
        }
    }

}