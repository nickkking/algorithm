import java.util.Scanner;
public class algo{
    public static void main(String[] args) {
        // * 19
        Scanner sc=new Scanner(System.in);
        String sign=sc.next();
        int num= sc.nextInt();
 
 
 
        //find the number of the longest line
        int m=1;
        int left=0;
        int ind=0,n=0,all=1;
        while (all<num){
            all+=ind;
            n+=2;
            ind=2*(n+1);
            m=n-3;
        }
        if (num>1){
        left=num-all+ind-4;}
        else {left=0;}
        //System.out.println(String.format("all%d n%d ind%d m%d",all,n,ind,m));
 
        ///up triangle
        for(int i=m;i>=1;i-=2) {
            int x;
            for (x=(m-i)/2;x>0;x--){
                System.out.print(' ');
 
            }
            for (int c = i; c > 0; c--) {
                System.out.print(sign);
            }
 
            System.out.println();
        }
        //down tri
        for(int i=3;i<=m;i=i+2) {
            int mid=(m-i)/2;
            for (int x=mid;x>0;x--){
                System.out.print(' ');
 
            }
            for (int c = i; c > 0; c--) {
                System.out.print(sign);
            }
            System.out.println();
 
        }
        System.out.print(left);
 
    }
}
