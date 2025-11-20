package TAU;

public class Addition {
    public int addNumber(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Addition goat = new Addition();
        int result = goat.addNumber(2,40);
        System.out.println(result);
    }
}
