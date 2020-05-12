public class AppMain {

    public static void main(String[] args){
        System.out.println("Hello World");
        int i = multi(8,9);
        System.out.println("Summe: " + i);
        compare(10,9);
    }

    public static int multi(int a, int b){
        return a*b;
    }

    public static void compare(int a, int b){
        if(a>b){
            System.out.println(a + " ist größer als " + b);
        }
        else if(a==b){
            System.out.println(a + " ist genauso groß wie " + b);
        }
        else{
            System.out.println(a + " ist kleiner als " + b);
        }
    }

}
