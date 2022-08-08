public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //переменные
        int a = 4;
        int b = 6;
        System.out.println(a + b);
        // условные операторы
        if (a > b){
            System.out.println("a > b");
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }
        //циклы
        for (int i = a; i <= b; i++){
            System.out.println("i = " + i);
        }

    }
}