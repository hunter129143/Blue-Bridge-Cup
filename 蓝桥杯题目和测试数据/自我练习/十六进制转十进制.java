import java.util.Scanner;

//问题描述
//　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
//　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
//样例输入
//FFFF
//样例输出
//65535



public class Main {
    public static void main(String[] stgs) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int len = arr.length;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            if ((int) arr[i] - 48 > 9) {
                if (arr[i] == 'A')
                    sum += 10 * Math.pow(16, len - i - 1);
                else if (arr[i] == 'B')
                    sum += 11 * Math.pow(16, len - i - 1);
                else if (arr[i] == 'C')
                    sum += 12 * Math.pow(16, len - i - 1);
                else if (arr[i] == 'D')
                    sum += 13 * Math.pow(16, len - i - 1);
                else if (arr[i] == 'E')
                    sum += 14 * Math.pow(16, len - i - 1);
                else if (arr[i] == 'F')
                    sum += 15 * Math.pow(16, len - i - 1);
            } else {
                sum += ((int) arr[i] - 48) * Math.pow(16, len - i - 1);
            }
        }
        System.out.println(sum);
    }
}