public class factorial {

    public  static int factorial(int num){
        int val=1;
        for(int i=1;i<=num;i++){
            val=val*i;
        }
        return  val;
    }

    public static void main(String[] args) {
        int num=1;
        int result=0;
        result=factorial(6);
        System.out.println(result);
    }
}
