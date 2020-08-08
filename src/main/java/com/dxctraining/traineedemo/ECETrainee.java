package studentdemo;

public class ECETrainee extends Trainee {
	
    private String deviceused;
    
    public ECETrainee(int id, String name,String devices)
    {
        super(id, name);
        this.deviceused=deviceused;
    }

    public String getDeviceused() {
        return deviceused;
    }

    public void setDeviceused(String deviceused) {
        this.deviceused = deviceused;
    }
}
