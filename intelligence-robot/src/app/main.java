package app;

import model.Response;
import service.QykRobotServiceImpl;
import service.RobotService;

import java.util.Scanner;

public class main {

    private static final RobotService robotService = new QykRobotServiceImpl();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("老板，麻烦您给我取个响亮的名字吧，按回车键确定！ ");
        String name = scanner.nextLine();
        System.out.println("Hi，我是您的⼩助手 " + name + "，直接对我下达指令");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("886")) {
                System.out.println("欢迎下次使用,拜拜");
                break;
            } else {
                Response response = robotService.qa(input);
                if (response.getCode() == 0) {
                    System.out.println(name + " : " +
                            response.getContent());
                } else {
                    System.out.println(name + " 暂时没明白您的意思，重新告诉我下吧！");
                }
            }
        }
        scanner.close();
    }
}

