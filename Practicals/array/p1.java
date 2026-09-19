import java.io.*;
class array{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		/*int size =  Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter the elements of array" );
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			//System.out.println(arr[i]);
		
		}
		System.out.println("array elements are");
		for(int index = 0;index<size;index++){
		System.out.println(arr[index]);
	}*/
		/*int noofEmp = Integer.parseInt(br.readLine());
		int empAge[]=new int[noofEmp];
		System.out.println("Enter the array elements");
		for (int i = 0 ; i<noofEmp;i++){
			empAge[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Ages of employee are");
		for(int i = 0;i<noofEmp;i++){
			System.out.println(empAge[i]);
		}



		int size = Integer.parseInt(br.readLine());
		char ch[] = new char[size];

		for(int i = 0;i<size;i++){
			ch[i]=br.readLine().charAt(0);
		}
		for(int i=0;i<size;i++){
			if((ch[i]=='A'|| ch[i]=='E'||ch[i]=='I'|| ch[i]=='O'||ch[i]=='U')||(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')){
				System.out.println(ch[i]+"are vowel present at index"+i);
			}else{
				System.out.println(ch[i]+ "are not vowel");
			}
	}*/
		





		// count
		int size = Integer.parseInt(br.readLine());

		int divby4[] = new int[size];

		for(int i = 0;i<size;i++){
                        divby4[i]=Integer.parseInt(br.readLine());
		}

		int count = 0;
		for(int i = 0;i<size;i++){
			if(divby4[i]%4==0){
				count++;
			}
			System.out.println(divby4[i]);
			//System.out.println(count);
		}
		System.out.println(count);



	}
}

