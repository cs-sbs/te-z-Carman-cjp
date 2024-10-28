package org.example;  
  
import java.util.Scanner;  
  
public class NumberFeature {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = calculateFeatureValue(number);  
        System.out.println(result);  
    }  
  
    public static int calculateFeatureValue(int number) {  
        int sum = 0;  
        int positionValue = 1; // 初始化为二进制最低位的值，即1  
  
        // 将数字转换为字符串以便逐位检查  
        String numberStr = Integer.toString(number);  
  
        // 从字符串的最后一个字符开始，即数字的最低位（个位）  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = Character.getNumericValue(numberStr.charAt(i)); // 获取当前位的数字  
            int position = numberStr.length() - i; // 计算当前位的位置（从1开始）  
  
            // 检查数字与位置的奇偶性是否相同  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                // 如果相同，则将当前位置对应的二进制值加到总和中  
                sum += positionValue;  
            }  
  
            // 准备下一位的计算，二进制值左移一位（乘以2）  
            positionValue *= 2;  
        }  
  
        return sum;  
    }  
}
