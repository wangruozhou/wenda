public class Demo1 {
    public static void print(int i,Object obj){
        System.out.println(i + ", "+obj.toString());
    }
    public static void main(String[] args){
        print(1,"hello");
        print(2,"hello,world");
    }
}
