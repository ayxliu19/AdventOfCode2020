package src;
import java.util.List;

public class Day1 extends AOCtemplate{

    public Day1() {
        super("1");
    }

    @Override
    public void solve(List<String> inputString) {
        List<Integer> input = convertToInts(inputString);
        boolean part1complete = false;
        for(int i = 0; i < input.size(); i++) {
            if (part1complete) {
                break;
            }
            for (int j = 0; j< input.size(); j++) {
                int n1 = input.get(i);
                int n2 = input.get(j);
                if (n1 + n2 == 2020) {
                    System.out.println(n1 *n2);
                    part1complete = true;
                    break;
                }
            }
        }
        for(int i = 0; i < input.size(); i++) {
            for (int j = 0; j< input.size(); j++) {
                for (int k = 0; k< input.size(); k++) {
                    int n1 = input.get(i);
                    int n2 = input.get(j);
                    int n3 = input.get(k);
                    if (n1 + n2 + n3 == 2020) {
                        System.out.println(n1 * n2 * n3);
                        return;
                    }
                }
            }
        }
        return;
    }
}