import java.util.*;
class demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enetr the no od rows");
                int rows = sc.nextInt();
                //char ch = 'A';
                //int num = ;
                for(int i = 1;i<=rows;i++){
                	//char ch = 'A';
                	int num = 96+rows;
                        for(int j = 1;j<=rows;j++){
                                //System.out.print(ch);
                                System.out.print((char)num+"\t");
                         
                                num--;
                        }

                        System.out.println();
                }
		System.out.println();
		for(int i = 1;i<=rows;i++){
			int num = 64+rows;
                        for(int j = 1;j<=rows;j++){
                                //System.out.print(ch);
                                System.out.print((char)num+"\t");

                                num--;
                        }

                        System.out.println();
		}
		System.out.println();
		for(int i = 1;i<=rows;i++){
			int num = 64;
                        for(int j = 1;j<=rows;j++){
                                //System.out.print(ch);
                                System.out.print((char)num+"\t");

                                num++;
                        }
			System.out.println();
        }
		System.out.println();
		for(int i = 1;i<=rows;i++){
			int num = 97;
                        for(int j = 1;j<=rows;j++){
                                //System.out.print(ch);
                                System.out.print((char)num+"\t");

                                num++;
                        }

                        System.out.println();
		}
	}
}
