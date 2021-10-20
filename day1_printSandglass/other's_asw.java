//other's answer
//i+1在计算最大行数的循环中非常重要，自己的问题就在这，循环使用不熟练以至于变得相当麻烦!!!!!!!!!!!!

import java.util.Scanner;
 
 
public class algo{
 
 
 
    public static void main(String[] args) {
 
        Scanner sc =new Scanner(System.in);
        String[] firstLine =sc.nextLine().split(" ");
        int  n =Integer.parseInt(firstLine[0]);
        char c =firstLine[1].charAt(0);
 
        int i=1;
        for(;;i++){
 
            if(n<2*(i+1)*(i+1)-1){//i+1!!!!!!!!!!!
 
                break;
            }
        }
/**
 进行n<2*(i+1)*(i+1)-1判断的原因：
 1 7 17 31 49
 即
 2*（1）*（1）-1=1
 2*（2）*（2）-1=7
 2*（3）*（3）-1=17
 2*（4）*（4）-1=31
 ……
 **/
 
        for(int j=i;j>0;j--){
 
            for(int blank=i-j;blank>0;blank--){
 
                System.out.print(" ");
            }
            for(int count=j*2-1;count>0;count--){
 
                System.out.print(c);
            }
            System.out.println();
        }
 
        for(int j=2;j<=i;j++){
 
            for(int blank=i-j;blank>0;blank--){
 
                System.out.print(" ");
            }
            for(int count=j*2-1;count>0;count--){
 
                System.out.print(c);
            }
            System.out.println();
        }
 
        System.out.println(n-(2*i*i-1));  //
    }
}
