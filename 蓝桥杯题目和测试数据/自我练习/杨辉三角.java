//问题描述
//杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
//
//　　
//它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
//
//　　
//下面给出了杨辉三角形的前4行：
//
//　　
//   1
//
//　　
//  1 1
//
//　　
// 1 2 1
//
//　　
//1 3 3 1
//
//　　
//给出n，输出它的前n行。
//
//输入格式
//输入包含一个数n。
//
//输出格式
//输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
//样例输入
//4
//样例输出
//1
//1 1
//1 2 1
//1 3 3 1
//数据规模与约定
//1 <= n <= 34。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        //用二维数组存储杨辉三角
        for (int i = 0; i < n; i++) {
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        //打印出杨辉三角
        for(int i = 0; i < n; i++) {
            for(int j = 0;j <= i;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
