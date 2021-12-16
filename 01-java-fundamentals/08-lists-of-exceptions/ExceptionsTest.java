import java.util.ArrayList;
public class ExceptionsTest {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        try{
            myList.add();
            System.out.println("Item added");
        } catch (ItemNotAddedException e){
            
        }
        myList.add("13");
        myList.add("hllo world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            Integer castedValue = (Integer) myList.get(i);
        }
    }
}
