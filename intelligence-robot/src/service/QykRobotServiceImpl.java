package service;

import com.google.gson.Gson;
import model.Response;
import util.HttpUtils;

public class QykRobotServiceImpl implements RobotService{

    private static final String apiTpl = "https://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";
    private static final Gson gson = new Gson();
    @Override
    public Response qa(String msg) {
        String api = String.format(apiTpl, msg);
        String result = HttpUtils.request(api);
        Response response = gson.fromJson(result, Response.class);
        return response;
    }
}
