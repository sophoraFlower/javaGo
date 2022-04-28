package code023;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.after(new Date(1651137266804L)));
        System.out.println(date.before(new Date(1651137266804L)));
        System.out.println(date.equals(new Date(1651137266804L)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date(1651137266804L)));

        // 初始化 Date 对象
        Date date1 = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date1);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date1);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date1);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date1);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date1);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date1);
    }

}
