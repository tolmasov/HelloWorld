public class SideEffects {
    public static void main(String[] args) {
        int i =0;

        if(true &(++i<=1))
        System.out.println("asdfadf");
        System.out.println(i);
    }
}
