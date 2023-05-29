public class Main {
    public static void main(String[] args) {
        int num = 7;
        int result = 0;
        result = fact(num);
        System.out.println(result);
    }

    public static int fact(int num) {
        if(num==1)
            return 1;
        return  num*fact(num-1);

        /*
        int value = 1;
        for (int i = 1; i <= num; i++) {
            value = value * i;
        }
        return value;*/
    }
}