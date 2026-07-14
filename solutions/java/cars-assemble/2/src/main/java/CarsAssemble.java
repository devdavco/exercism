public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int PRODUCTION_PER_HOUR  = (speed*221);
        double production = 0;

        if(speed >= 1 && speed <= 4){
            production = PRODUCTION_PER_HOUR;
        }else if(speed >= 5 && speed <= 8){
            production = PRODUCTION_PER_HOUR * 0.9;
        }else if(speed == 9 ){
            production = (PRODUCTION_PER_HOUR)*0.8;
        }else if(speed == 10){
            production = (PRODUCTION_PER_HOUR) * 0.77;
        }

        return production;
    }

    public int workingItemsPerMinute(int speed) {

        return (int)productionRatePerHour(speed)/60;
    }
}
