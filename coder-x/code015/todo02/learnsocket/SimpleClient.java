package code015.todo02.learnsocket;

import java.io.IOException;
import java.net.Socket;

import static code015.todo02.learnsocket.SimpleServer.SERVER_PORT;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        commWithServer();
    }

    private static void commWithServer() throws IOException {

        try (
                // 127.0.0.1
            Socket socket = new Socket("localhost", SERVER_PORT);
        ) {
            Chat chat = new Chat("服务器端", null, socket);
            chat.chatting();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("程序退出！");
    }

}
