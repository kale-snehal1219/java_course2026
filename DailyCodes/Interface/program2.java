package DailyCodes.Interface;

public interface program2 {
    void fun();

}
interface Innerprogram2 {
    void gun();
}
class Demo implements program2,Innerprogram2{
    public void fun(){
        System.out.println("in fun :");
    }
    public void gun(){
        System.out.println("in gun method:");
    }
}
class user{
    public static void main(String[] args) {
        Demo obj =new Demo();
        obj.fun();
        obj.gun();
    }
}
