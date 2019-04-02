import java.util.Scanner;

/**
 * Created by 贝鱼 on 2019/4/1.
 */

public class Course {
    public static void main(String[] args) {
        JavaCourse stu1 = new JavaCourse();
        JavaCourse stu2 = new JavaCourse();
        inStu(stu1);
        inStu(stu2);
        stu1.printAll();
        stu2.printAll();
    }

    public static void inStu(JavaCourse stu) {
        boolean inputRight = false;
        Scanner scan = new Scanner(System.in);
        //姓名
        System.out.println("请输入姓名：");
        if (scan.hasNextLine()) {// 判断是否还有输入
            stu.setName(scan.nextLine());
        }
        //学号
        System.out.println("请输入" + stu.getName() + "的学号");
        do {
            scan = new Scanner(System.in);
            try {
                stu.setId(scan.nextInt());
                inputRight = true;
            } catch (Exception e) {
                System.out.println("请输入一个正整数");
            }
        } while (!inputRight || stu.getId() < 0);
        inputRight = false;
        //测试成绩
        System.out.println("请输入" + stu.getName() + "的测试成绩");
        do {
            scan = new Scanner(System.in);

            try {
                stu.setTestScore(scan.nextInt());
                inputRight = true;
            } catch (Exception e) {
                System.out.println("请输入一个正整数");
            }
        } while (!inputRight || stu.getTestScore() < 0);
        inputRight = false;
        //平时成绩
        System.out.println("请输入" + stu.getName() + "的平时成绩");
        do {
            scan = new Scanner(System.in);

            try {
                stu.setDailySocre(scan.nextInt());
                inputRight = true;
            } catch (Exception e) {
                System.out.println("请输入一个正整数");
            }
        } while (!inputRight || stu.getDailySocre() < 0);
        inputRight = false;
        //期末成绩
        System.out.println("请输入" + stu.getName() + "的期末成绩");
        do {
            scan = new Scanner(System.in);

            try {
                stu.setFinalSocre(scan.nextInt());
                inputRight = true;
            } catch (Exception e) {
                System.out.println("请输入一个正整数");
            }
        } while (!inputRight || stu.getFinalSocre() < 0);
        inputRight = false;
    }
}