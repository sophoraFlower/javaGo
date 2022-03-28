package code014;

import java.util.HashMap;
import java.util.Objects;

public class StudentMark {

    // 学生和各科成绩
    private final HashMap<String, HashMap<String, Integer>> studentCourseGrade = new HashMap<>();
    public StudentMark(){
        // 学生01：课程和成绩
        HashMap<String, Integer> nameGrade01 = new HashMap<String, Integer>();
        nameGrade01.put("语文", 80);
        nameGrade01.put("数学", 90);
        nameGrade01.put("历史", 100);
        // 学生02：课程和成绩
        HashMap<String, Integer> nameGrade02 = new HashMap<String, Integer>();
        nameGrade02.put("语文", 88);
        nameGrade02.put("数学", 88);
        // 学生03：课程和成绩
        HashMap<String, Integer> nameGrade03 = new HashMap<String, Integer>();
        nameGrade03.put("语文", 89);
        nameGrade03.put("历史", 89);
        studentCourseGrade.put("王大锤", nameGrade01);
        studentCourseGrade.put("王二锤", nameGrade02);
        studentCourseGrade.put("王三锤", nameGrade03);
    }

    // 通过学生姓名获取该学生各科成绩
    public String getCourseGradeByStudentName(String studentName){
        HashMap<String, Integer> cg = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String name : studentCourseGrade.keySet()) {
            if (Objects.equals(studentName, name)) {
                cg = studentCourseGrade.get(name);
            }
        }
        for (String name : cg.keySet()) {
            result.append(name).append(": ").append(cg.get(name)).append(" ");
        }
        return studentName + "的各科成绩：" + result;
    }

    // 查询某一门课的全部学生的成绩
    public StringBuilder getAllStudentGradeByStudent(String courseName){
        StringBuilder result = new StringBuilder();
        for (String student : studentCourseGrade.keySet()) {
            String g = null;
            for (String course: studentCourseGrade.get(student).keySet()) {
                // 判断获得指定课程的成绩
                if (Objects.equals(course, courseName)) {
                    g = studentCourseGrade.get(student).get(course).toString();
                }
                if(g==null){
                    g="无成绩";
                }
            }
            result.append(student).append(": ").append(courseName).append(": ").append(g).append(" ");
        }
        return result;
    }

    // 依次打印所有学生的全部成绩
    public StringBuilder printAllStudentsGrade(){
        StringBuilder allStudentGrade = new StringBuilder();
        for (String student: studentCourseGrade.keySet()) {
            allStudentGrade.append(getCourseGradeByStudentName(student)+"\n");
        }
        return allStudentGrade;
    }

    public static void main(String[] args) {
        StudentMark sm01 = new StudentMark();
        System.out.println(sm01.getCourseGradeByStudentName("王大锤"));
        System.out.println(sm01.getCourseGradeByStudentName("王二锤"));
        System.out.println(sm01.getAllStudentGradeByStudent("语文"));
        System.out.println(sm01.getAllStudentGradeByStudent("历史"));
        System.out.println("----------------------------");
        System.out.println(sm01.printAllStudentsGrade());
    }

}