public class ass{
     public static void generatefibonacci(int n){
        int first = 0, second = 1;

        System.out.println("first" + n + "fibonacci numbers are:");
        for(int i = 1; i <= n; i++){
            System.out.println(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
     }
     public static void main(strng[]args){ 
        generatefibonacci(10);
     }
}


