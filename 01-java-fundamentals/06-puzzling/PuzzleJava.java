import java.util.Random;
public class PuzzleJava {
    Random randMachine = new Random();
    
    public int[] getTenRolls() {
        int[] myArray;
        myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = 0;
            int r = 0;
            while (r < 1) {
                num = randMachine.nextInt(21);
                if (num > 0) {
                    r = 1;
                }
            }
            myArray[i] = num;
        }
        return myArray;
    }

    public Character getRandomLetter() {
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'y', 'z'};
        int i = randMachine.nextInt(25);
        char letter = alphabet[i];
        return letter;
    }
    
    public String generatePassword() {
        String password = getRandomLetter().toString();
        for (int i = 0; i < 7; i++) {
            String newLetter = getRandomLetter().toString();
            password += newLetter;
        }
        return password;
    }
}
