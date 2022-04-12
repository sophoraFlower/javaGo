package code018;

public class PackageService {

    public VideoCourse getByTeacherId(Long userId) {
        if (userId != null) {
            System.out.println(userId);
        }
        VideoCourse videoCourse = new VideoCourse();
        return videoCourse;
    }

}
