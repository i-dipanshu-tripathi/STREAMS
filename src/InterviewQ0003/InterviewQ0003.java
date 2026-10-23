package InterviewQ0003;

import java.util.Collections;
import java.util.List;

public class InterviewQ0003 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 40, 20, 50, 30, 50, 40);
        List<Integer> secondAndThirdHighest =
                    list.stream()
                        .distinct()
                        .sorted(Collections.reverseOrder())
                        .skip(1)
                        .limit(2)
                        .toList();

        System.out.println("2nd Highest : "+secondAndThirdHighest.get(0));
        System.out.println("3rd Highest : "+secondAndThirdHighest.get(1));

    }
}
