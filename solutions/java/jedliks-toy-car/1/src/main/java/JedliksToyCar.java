public class JedliksToyCar {
    public int batteryLife = 100;
    public int distanceDriven = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {

        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {

        if(batteryLife > 0 ){
            return "Battery at " + batteryLife + "%";

        }else{
            return "Battery empty";

        }
    }

    public void drive() {
        if(batteryLife>0){
            distanceDriven += 20;
            batteryLife --;
        }

    }
}
