public class byusingMethod {
    String color;
    int age;
    void initobj (String c,int a){
        color=c;
        age=a;
    }
    void display()
     {
        System.out.println(color+ " " +age);
    }
public static void main(String[] args) {
    byusingMethod s1=new byusingMethod();
    s1.initobj("block",10);
    s1.display();
}
}
