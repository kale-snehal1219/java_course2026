import java.io.*;
class pyramid{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1;i<=rows;i++){
			for(int sp = 1;sp<rows-i+1;sp++){
				System.out.print("\t");
			}
			int num = i;
			for(int j = 1;j<=i*2-1;j++){
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}



