public class Fibonacci {
    public static  void main (String[] args){
        int first = 1;
        int second = 1;

        while (first <= 500){
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
