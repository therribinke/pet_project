import java.util.HashMap;
import java.util.Map;

class FrequencyFactory{
    private static final Map<Integer,Frequency> frequencys = new HashMap<>();
    public Frequency getFrequency(Integer name){
        Frequency frequency = frequencys.get(name);
        if (frequency==null){
            switch (name){
                case 1:
                    frequency=new CPU();
                    break;
                case 2:
                    frequency=new GPU();
                    break;
                case 3:
                    frequency=new RAM();
                    break;
            }
            frequencys.put(name,frequency);
        }
        return frequency;
    }
}