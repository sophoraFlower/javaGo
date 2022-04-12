package code018;

public class GetPackageCourse {

    public void getPackageCourse(Long packageId, long userId) {
        // 不推荐写成 if (packageId == 3)
        if (packageId == CourseTypeEnum.OFFLINE_COURSE.getSeq()) {
            System.out.println("线下课程，无法在线观看");
            return;
        }

        PackageService packageService = new PackageService();
        VideoCourse course = packageService.getByTeacherId(userId);
        // 不推荐写成  if (course.getState() == 2)
        if (course.getState() == BaseCourseState.UNAUTHED_COURSE) {
            System.out.println("未审核课程");
            return;
        }
    }

}
