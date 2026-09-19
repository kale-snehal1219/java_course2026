class login{
        public static void main(String[] args){
                boolean login = true;
		int logincount = 0;
                if (login || ++logincount>0){
                        System.out.println("welcome user");
                }else{
                        System.out.println("loggedIn first");
                }
        }
}
