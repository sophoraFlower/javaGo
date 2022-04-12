package code018;

public enum CourseTypeEnum {

    /**
     * 允许官方和讲师创建和运营
     */
    VIDEO_COURSE(1, " 录播课程"),

    /**
     * 只允许官方创建和运营，且限制人数上限
     */
    LIVE_COURSE(2, " 直播课程"),

    /**
     * 只允许官方创建和运营
     */
    OFFLINE_COURSE(3, " 线下课程");

    private final int seq;
    private final String desc;
    CourseTypeEnum(int seq, String desc) {
        this.seq = seq;
        this.desc = desc;
    }

    public int getSeq() {
        return seq;
    }

    public String getDesc() {
        return desc;
    }

}
