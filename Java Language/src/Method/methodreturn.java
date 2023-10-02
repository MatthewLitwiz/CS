package Method;
public class methodreturn {

	public static void main(String[] args) {
        int x = 5;
        int y = 15;
        int d = add(x, y);
        System.out.println(d);
        System.out.println(add(x, y));

    }

    static int add(int x, int y){

        int c = x + y; // Note: can also just return x + y instead of c
        return c;

    }
	
}
