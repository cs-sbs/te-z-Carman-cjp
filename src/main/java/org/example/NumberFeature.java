import java.util.Scanner;  
  
public class OddEvenFeatureValue {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = 0;  
        int position = 1; // 数位从1开始  
  
        // 将整数转换为字符串，以便从右向左遍历每一位数字  
        String numberStr = Integer.toString(number);  
  
        // 从右向左遍历每一位数字  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = Character.getNumericValue(numberStr.charAt(i)); // 获取当前位的数字  
  
            // 检查数字与数位的奇偶性是否一致  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                // 如果一致，则将当前二进制位值加到结果中  
                // 由于是从右向左遍历，所以二进制位值实际上是2的(length-1-i)次方  
                // 但由于我们是从1开始计数位，且每次向左移动都乘以2（即左移一位），  
                // 因此可以直接用position变量（它每次循环都会乘以2）来代表当前的二进制位值  
                result += position;  
            }  
  
            // 数位加1，准备检查下一位数字  
            position *= 2;  
        }  
  
        // 输出结果  
        System.out.println(result);  
    }  
}
