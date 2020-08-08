package studentdemo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
    Map<Integer, Trainee> traineemap = new HashMap<>();
    Set<CSTrainee> cstraineeSet = new HashSet<>();
    Set<ECETrainee> eceTrainees = new HashSet<>();

    public static void main(String[] args) {
        TraineeMain Traineeapp = new TraineeMain();
        Traineeapp.runApp();
    }

    public void runApp() {
        Trainee trainee1 = new CSTrainee(1, "preeti", 8);
        Trainee trainee2 = new CSTrainee(2, "priya", 6);
        Trainee trainee3 = new ECETrainee(3, "ece1", "device1");
        Trainee trainee4 = new ECETrainee(4, "ece2", "device2");
        traineemap.put(trainee1.getId(), trainee1);
        traineemap.put(trainee2.getId(), trainee2);
        traineemap.put(trainee3.getId(), trainee3);
        traineemap.put(trainee4.getId(), trainee4);
        
        for (Trainee trainee : traineemap.values()) {
            Trainee Trainees = (Trainee) trainee;
            boolean iscse = Trainees instanceof CSTrainee;
            if (iscse) {
                cstraineeSet.add((CSTrainee) Trainees);
            } else {
                eceTrainees.add((ECETrainee) Trainees);
            }
        }
        System.out.println("###CSE Trainee###");
        for(CSTrainee cseset:cstraineeSet)
        {
            int id=cseset.getId();
            int language=cseset.getLanguages();
            String name=cseset.getName();
            System.out.println("The name="+name+" Id="+id+" Languages="+language);
        }
        
        System.out.println("###ECE Trainee###");
        for(ECETrainee eceset:eceTrainees)
        {
            int id=eceset.getId();
            String deviceused=eceset.getDeviceused();
            String name=eceset.getName();
            System.out.println("The name="+name+" Id="+id+" devices="+deviceused);
        }

    }
}