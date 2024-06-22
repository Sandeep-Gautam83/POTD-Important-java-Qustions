public class Animal {
public void run(){
System.out.println("I am running");
}
public static void main(String []args){
    System.out.println("11111");
    System.out.println("I am flying ");
    System.out.println("I am eating ");
    System.out.println("I am reading ");
    Animal s1=new Animal();
    s1.run();
}
public class Birds{
    public void fly(){
Birds s2=new Birds();
s2.fly();
    }
    public class InnerAnimal {
    public void eat(){
        InnerAnimal s3=new InnerAnimal();
        s3.eat();
    }
    public class Book{
        public void read(){
        Book s4=new Book();
        s4.read();
    }
}
        
    }
}
    }

