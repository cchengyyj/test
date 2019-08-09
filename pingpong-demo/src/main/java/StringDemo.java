import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p> className:    StringDemo
 * <p> package:    PACKAGE_NAME
 * <p> description:
 * <p> datetime:    2019/8/9   22:56
 * <p> author:   cchengyyj@gmail.com
 */
public class StringDemo {

    public static StringDemo sDemo = new StringDemo();

    private StringDemo(){}


   /* public String splitReString(String str){
        //判断str拆分成char[]的长度
        char[] chars = str.toCharArray();
        boolean flag = (chars.length % 2) == 0;






        }*/

    public static void main(String[] args) {
        System.out.println(getNumOfReg("accccaacccca"));
    }


   public static String getNumOfReg(String orginalString){
       char[] chars = orginalString.toCharArray();
       String reg = String.valueOf(chars[0]);
       for (int i = 1; i < chars.length; i ++) {
           int len = orginalString.split(reg).length;
           if (len == 0){
               int num = orginalString.length() / reg.length();
               return num + reg;
           }else {
               reg += String.valueOf(chars[i]);
               continue;
           }
       }
       return "1" + orginalString;
   }
   
   

   

}



    
