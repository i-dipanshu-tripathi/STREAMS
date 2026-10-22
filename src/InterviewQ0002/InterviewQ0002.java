package InterviewQ0002;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ0002 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);

        IntSummaryStatistics allAtOnce = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        //sum, average, minimum, maximum, and count
        System.out.println("Sum : "+allAtOnce.getSum());
        System.out.println("Average : "+allAtOnce.getAverage());
        System.out.println("Minimum : "+allAtOnce.getMin());
        System.out.println("Maximum : "+allAtOnce.getMax());
        System.out.println("Count : "+allAtOnce.getCount());

    }
}
