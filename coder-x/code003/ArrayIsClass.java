package code003;

public class ArrayIsClass {

    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[1];
        intArr = new int[2];

        // 三行四列的二维数组
        String[][] str = new String[3][4];
        str[0] = new String[4];
        str[1] = new String[4];
        str[2] = new String[4];
        str[0][1] = "我";
        str[1][2] = "是";
        str[2][3] = "谁";
        System.out.println(str.length);
        System.out.println(str[2].length);
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str[i].length; j++){
                System.out.print(str[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
