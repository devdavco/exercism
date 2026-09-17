public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double production = 0;
        if(speed >= 1 && speed <= 4){
            production = speed * 221;
        }else if(speed >= 5 && speed <= 8){
            production = (speed*221) * 0.9;
        }else if(speed == 9 ){
            production = (speed * 221)*0.8;
        }else{
            production = (speed * 221) * 0.77;
        }

        return production;
    }

    public int workingItemsPerMinute(int speed) {

        return (int)productionRatePerHour(speed)/60;
    }
}
