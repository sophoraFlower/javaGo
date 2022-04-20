package code021;

public class DichotomyTest {

    public boolean binary_search(int[] list, int target) {
        if (list == null) {
            return false;
        }
        int low_index = 0;
        int high_index = list.length-1;

        while(low_index <= high_index){
            int mid = (low_index + high_index) / 2;
            int guess = list[mid];

            if (guess == target) {
                return true;
            } else if (guess < target) {
                low_index = mid + 1;
            } else {
                high_index = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DichotomyTest dichotomyTest = new DichotomyTest();
        boolean isFind = dichotomyTest.binary_search(new int[]{2, 4, 8, 10, 13, 22}, 10);
        System.out.println(isFind);
    }

}
