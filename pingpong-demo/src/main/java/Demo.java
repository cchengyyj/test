/**
 * <p> className:    Demo
 * <p> package:    PACKAGE_NAME
 * <p> description:
 * <p> datetime:    2019/8/9   22:38
 * <p> author:   cchengyyj@gmail.com
 */
public class Demo {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i < 300; i ++) {
            boolean flag1 = (i % 2 ) == 1;
            boolean flag2 = (i % 3) == 2;
            boolean flag3 = (i % 5) == 4;
            boolean flag4 = (i % 7) == 0;
            if (flag1 && flag2 && flag3 & flag4){
                num = i;
            }
        }

        if (num == 0) {
            System.out.println("没有");
            return;
        }
        System.out.println("这个数是 ：" + num);



    }
}
