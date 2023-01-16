import java.util.Scanner;

//问题描述
//　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
//输出格式
//　　按从小到大的顺序输出满足条件的四位十进制数。


public class Main {
    public static void main(String[] stgs) {
        Scanner in=new Scanner(System.in);
    int i=1000;
       while(i<=9999){
           if(judgeReverseNumber(i))
               System.out.println(i);
           i++;
       }

    }
    private static  boolean judgeReverseNumber(int num)
    {
        int reverseNumber=0;
        if(num%10==0)
            return false;
        while(num>reverseNumber)
        {
            reverseNumber=reverseNumber*10+num%10;
            num/=10;
        }
        if(num==reverseNumber)
            return true;
        else
            return false;
    }

}