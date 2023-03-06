public class PertenceFibonacci {
    public static void main(String[] args) {
        System.out.println(pertence(233));
    }

    public static String pertence(int num){
        int result = 0;
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= num; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;

            if ( num == result){
                return "Pertence";
            }
        }
        return "Não pertence";
    }
}
