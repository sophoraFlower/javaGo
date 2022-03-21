package code001;

public class Print26Chars {

    public static void main(String[] args) {
        char charA = 'a';
        do {
            System.out.println(charA);
            charA += 1;
        } while(charA != 'z');
        System.out.println(charA);
    }

}
