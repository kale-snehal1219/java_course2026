class triangle{
	public static void main(String[] args){
		int a = 6;
		int b = 5;
		int c = 5;
		if (a==b && b==c && a==c){
			System.out.println("Equilateral Triangle");
		}else if ((a==b && a!=c)||(b==c && b!=a)||(a==c && a!=b)){
			System.out.println("Isosceles Triangle");
		}else{
			System.out.println("Scalene Triangle");
		}
	}
}
