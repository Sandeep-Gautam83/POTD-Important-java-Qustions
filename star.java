// public class star {

//     public static void main(String[] args) {
//         int n=5;
//         for(int line=1; line<=n; line++){
//             for(int star=1; star<=line; star++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// qus 2?

// public class star {
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){

//             for(int j=1;j<=n-i+1;j++){
            
//                 System.out.print(" * ");
            
//             }
//             System.out.println();
//         }
//     }
// }

// qus 3

// public class star {

//     public static void main(String[] args) {
//        int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

public class star {

    public static void main(String[] args) {
        char ch='A';
        int n=4;
        for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}