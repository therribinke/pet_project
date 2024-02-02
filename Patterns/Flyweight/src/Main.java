import java.util.*;

public class Main {
    public static void main(String[] args) {
        FrequencyFactory frequencyFactory =new FrequencyFactory();
        List<Frequency> list = new ArrayList<>();
        list.add(frequencyFactory.getFrequency(1));
        list.add(frequencyFactory.getFrequency(2));
        list.add(frequencyFactory.getFrequency(3));
        list.add(frequencyFactory.getFrequency(1));
        list.add(frequencyFactory.getFrequency(2));
        list.add(frequencyFactory.getFrequency(3));
        list.add(frequencyFactory.getFrequency(1));

        Random random = new Random();
        for (Frequency f:list){
            int MHz = random.nextInt(10000);
            int time = random.nextInt(10000);
            f.change(MHz,time);
        }
    }
}