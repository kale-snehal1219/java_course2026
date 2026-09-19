import java.util.*;
class demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enetr the no od rows");
                int rows = sc.nextInt();
                //char ch = 'A';
                //int num = 1;
                for(int i = 1;i<=rows;i++){
                	char ch = 'A';
                	int num = 1;
                        for(int j = 1;j<=rows;j++){
                                System.out.print(ch);
                                System.out.print(num+"\t");
                                ch++;
                                num++;
                        }

                        System.out.println();
                }
        }
}
