package solution2;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        IntStream.range(0, 7).forEach(i -> machine.consume());
    }
}

