package code015.todo03.learnsocket;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GetHtmlContentAppMain {
    public static void main(String[] args) throws IOException {
        System.out.println("解析域名……");
        InetAddress inetAddress = InetAddress.getByName("www.hao123.com");
        System.out.println("网站地址为：" + inetAddress);
        System.out.println("尝试连接到主机……");
        Socket s = new Socket();
        SocketAddress sa = new InetSocketAddress(inetAddress, 80);
        s.connect(sa, 10000);
        System.out.println("已经连接到主机，开始模拟发送http请求……");

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), StandardCharsets.UTF_8));

        StringBuffer sb = new StringBuffer();
        // TODO 这是HTTP协议标准的请求头
        sb.append("GET /index.html HTTP/1.1\r\n");
        sb.append("Host: www.hao123.com\r\n");
        sb.append("Connection: Keep-Alive\r\n");
        sb.append("\r\n");
        pw.write(sb.toString());
        pw.flush();

        System.out.println("请求已经发送，开始读取主页内容……");

        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream(),
            StandardCharsets.UTF_8));

        reader.lines().forEach(System.out::println);

    }
}
