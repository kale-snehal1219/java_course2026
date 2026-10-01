package DailyCodes.Interface;

public interface samemethod {
    int x = 50;
    void fun();  
}
/**
 * Innersamemethod
 */
/*interface Innersamemethod{
    void fun(int x);
}
class samechild implements samemethod,Innersamemethod{
    public void fun(int x){
        System.out.println("in para fun method");
    }
    public void fun(){
        System.out.println("in fun method");
    }

}
class user1{
    public static void main(String[] args) {
        samechild obj = new samechild();
        obj.fun(25);
        obj.fun();

    }
}*/


interface innersamemethod{
    void fun ();

}
class samechild implements samemethod,innersamemethod{
    public void fun(){
        System.out.println("In fun method");
    }
}
class user2{
    public static void main(String[] args) {
        samechild obj = new samechild();
        obj.fun();
    }
}
