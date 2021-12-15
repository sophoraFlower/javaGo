package ObjectContainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CityDistance {

    public static void main(String[] args) {

        // 城市名ArrayList
        ArrayList<String> cityArrayList = new ArrayList<>();
        int cityNum = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            String cityString = sc.nextLine();
            for (String city: cityString.split("\\s+")) {
                if(!Objects.equals(city, "###")){
                    cityArrayList.add(city);
                }
            }
        }
        cityNum = cityArrayList.size();

        for (String city: cityArrayList) {
            System.out.println(city);
        }

        // 距离矩阵
        ArrayList<ArrayList<Integer>> cityDistanceArrayList = new ArrayList<>();
        for(int i=0; i<cityNum; i++){
            if(sc.hasNextLine()){
                ArrayList<Integer> distanceArrayList = new ArrayList<>();
                String cityDistanceString = sc.nextLine();
                for (String distance: cityDistanceString.split("\\s+")) {
                        distanceArrayList.add(Integer.parseInt(distance));
                }
                cityDistanceArrayList.add(distanceArrayList);
            }
        }

        for (ArrayList<Integer> distanceList : cityDistanceArrayList) {
            System.out.println(distanceList.toString());
        }

        // 任意两城市之间距离查询
        int distanceTwoCity = 0;
        String cityOneName = "";
        String cityTwoName = "";
        if(sc.hasNextLine()){
            String cityStringTwo = sc.nextLine();
            ArrayList<String> cityStringTwoList = new ArrayList<>(Arrays.asList(cityStringTwo.split("\\s+")));
            cityOneName = cityStringTwoList.get(0);
            cityTwoName = cityStringTwoList.get(1);
        }
        int cityOneIndex = cityArrayList.indexOf(cityOneName);
        int cityTwoIndex = cityArrayList.indexOf(cityTwoName);
        distanceTwoCity = cityDistanceArrayList.get(cityOneIndex).get(cityTwoIndex);
        System.out.println(distanceTwoCity);
    }

}
