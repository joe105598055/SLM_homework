package steps;

/**
 * Created by joe on 2017/2/27.
 */
public class Hello {
    private final String greeting;
    public Hello(String greeting){
        this.greeting=greeting;
    }

    public String sayHi() {
        return greeting+" World";
    }
}
