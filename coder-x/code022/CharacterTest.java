package code022;

public class CharacterTest {

    public static void main(String[] args) {
        char[] charArray ={ 'a', '2', 'c', 'D', 'e' };
        for (char c: charArray) {
            if (Character.isLetter(c)) {
                System.out.println(c + " is letter~");
            }
            if (Character.isDigit(c)) {
                System.out.println(c + " is digit~");
            }
            if (Character.isLowerCase(c)) {
                System.out.println(c + " is lowercase~");
            }
            if (Character.isUpperCase(c)) {
                System.out.println(c + " is uppercase~");
            }
        }
    }

}
