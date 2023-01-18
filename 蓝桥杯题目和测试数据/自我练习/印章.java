//问题描述
//　　共有n种图案的印章，每种图案的出现概率相同。小A买了m张印章，求小A集齐n种印章的概率。
//输入格式
//　　一行两个正整数n和m
//输出格式
//　　一个实数P表示答案，保留4位小数。
//样例输入
//2 3
//样例输出
//0.7500
//数据规模和约定
//　　1≤n，m≤20
import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n和m
        int n = in.nextInt();
        int m = in.nextInt();
        //定义p代表每一次的概率
        double p = 1.0 / n;
        //定义dp数组 dp[m][n] 买m张凑齐n种
        double[][] dp = new double[m + 1][n + 1];
        //i代表买了i张 j代表凑齐j种
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //因为i<j 不可能买了i张凑齐j种 所以dp=0；
                if (i < j) {
                    dp[i][j] = 0;
                } else if (j == 1) {
                    //如果j=1 买了i张凑齐j种 所以dp=p的i-1次方
                    dp[i][j] = Math.pow(p, i - 1);
                } else {
                    //其他情况 买了i张凑齐j种 第i张有两种情况 第一种和之前凑齐的一样 第二种和之前凑齐的不一样
                    dp[i][j] = dp[i - 1][j] * (j * p) + dp[i - 1][j - 1] * ((n - j + 1) * p);
                }
            }
        }
        System.out.printf("%.4f", dp[m][n]);
    }
}
