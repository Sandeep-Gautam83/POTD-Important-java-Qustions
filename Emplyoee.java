 class Emplyoee {
int id;
String name;
float salary;
void Emplyoee(int r,String n,float s){
    id=r;
    name=n;
    salary=s;
}    
void display(){
    System.out.println(id+" "+name+" "+salary);
}
}

 public class TestEmplyoee{
    public static void main(String[] args) {
        Emplyoee n1=new Emplyoee(83,"Sandeep",45000);
        Emplyoee n2=new Emplyoee(07,"abshiek",40000);
        Emplyoee n3=new Emplyoee(15,"anatesh",39999);
        n1.display();
        n2.display();
        n3.display();
    }
}
