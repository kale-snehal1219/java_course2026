import java.io.*;
class mirroraPyramid{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows");
		int rows = Integer.parseInt(br.readLine());
		for(int i = 1;i<=rows;i++){
			 int num = 97;
			for(int sp = 1; sp<=rows-i ;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(j<i){
					System.out.print((char)num+"\t");
					num++;
				}else{
					System.out.print((char)num+"\t");
					num--;
				}
				
			}
			System.out.println();
		}
	}
}
