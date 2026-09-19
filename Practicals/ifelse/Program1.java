class Tickets{
	public static void main(String[] args){
		int age = 10;
		if (age<13){
			System.out.println("Child Tickets");
		}else if (age>=13 && age<=59){
			System.out.println("Adult Ticket");
		}else{
			System.out.println("senior citizen Ticket");
		}
	}
}
