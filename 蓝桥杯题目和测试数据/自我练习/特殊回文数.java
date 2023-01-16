import java.util.Scanner;

//问题描述
//　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
//　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
//输入格式
//　　输入一行，包含一个正整数n。
//输出格式
//　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
//样例输入
//52
//样例输出
//899998
//989989
//998899
//数据规模和约定
//　　1<=n<=54。


public class Main {
    public static void main(String[] stgs) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=10000;i<=999999;i++)
        {
            if(judgeReverseNumber(i)&&compareNumber(i,n))
                System.out.println(i);
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
        return reverseNumber==num||num==reverseNumber/10;
    }
    private static boolean compareNumber(int num,int comparedNum)
    {
        int sum=0;
        while(num!=0)
        {
            sum=num%10+sum;
            num/=10;
        }
        if(sum==comparedNum)
            return true;
        else
            return false;
    }
}