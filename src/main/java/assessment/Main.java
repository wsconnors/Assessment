package assessment;

public class Main {
    public static void main(String[] args) {
        NumberToString test = new NumberToString();
        for(int i = 1;i<1000000;i++){
            System.out.println(test.convertNumber(i));
        }
    }
}
