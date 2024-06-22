import java.util.Scanner;

class Lock {
int FirstSecuritykey,SecondSecuritykey,ThirdSecuritykey;
int FirstEnteredKey,SecondEnteredkey,ThirdEnteredkey;
boolean Open;
//construtor
public Lock(int Digit){
    ThirdSecuritykey=Digit%10;
    Digit=Digit/10;
    SecondSecuritykey=Digit%10;
    Digit=Digit/10;
    FirstSecuritykey=Digit%10;
    FirstEnteredKey=-1;
    SecondEnteredkey=-1;
    ThirdEnteredkey=-1;
    Open=false;
    System.out.println("Security mumber"+FirstSecuritykey+SecondSecuritykey+ThirdSecuritykey);
}//constructor
public boolean OpenLock() {
return Open=true;
}    
public void close() {
    FirstEnteredKey=-1;
    SecondEnteredkey=-1;
    ThirdSecuritykey=-1;
    Open=false;
}
public void InputDigit (int Digit){
FirstEnteredKey=SecondEnteredkey;
SecondEnteredkey=ThirdEnteredkey;
ThirdEnteredkey=Digit;
if(FirstEnteredKey==FirstSecuritykey) && (SecondEnteredkey==SecondSecuritykey) && (ThirdEnteredkey==ThirdSecuritykey)
Open=true;   
} 
}
public class DigitLock {
    static int Digit;
    public static void main(String[] args) {
        int Digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter the Security key : ");
        Lock lc=new Lock(Digit);
        System.out.println("Static lock of "+lc.Open);
        while (! lc.Open) {
            System.out.println("please enter single digit");
            Digit=sc.nextInt();
            lc.InputDigit(Digit);
        }
        System.out.println("Static of lock " +lc.Open);
    }

    
}
