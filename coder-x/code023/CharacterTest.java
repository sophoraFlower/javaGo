package code023;

public class CharacterTest {

    public static void main(String[] args) {
        char ch1 = 'a';
        // Unicode 字符表示形式
        char uniChar = '\u039A';
        // 字符数组
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        Character ch2 = new Character('a');  // 与下面是=本质相同
        // Character ch2 = 'a';
        Character ch3 = Character.valueOf('a');  // Java9+ 推荐使用

        System.out.println(ch1 == ch2);  // true
        System.out.println(Character.isLetter(ch1));  // true
        System.out.println(Character.isDigit(ch1));  // false
        System.out.println(Character.isWhitespace(ch1));  // false
        System.out.println(Character.isUpperCase(ch1));  // false
        System.out.println(Character.isLowerCase(ch1));  // true
        System.out.println(Character.toUpperCase(ch1));  // A
    }

}
