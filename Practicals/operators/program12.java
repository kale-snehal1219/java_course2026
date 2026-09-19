class incrementDemo{
        public static void main(String[] args){
                int a = 5;
                if (a++ == 5 && a == 6){
                        System.out.println("number inside if");
                }else{
                        System.out.println("number inside else");
                }
		System.out.println("a:"+a);
        }
}
