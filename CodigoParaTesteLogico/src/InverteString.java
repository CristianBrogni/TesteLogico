public class InverteString {
    public static void main(String[] args) {
        System.out.println(stringReversa("teste de inversao"));
    }
    public static String stringReversa(String texto){

        String invertida = "";
        for (int i = texto.length() - 1;  0 <= i; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }
}
