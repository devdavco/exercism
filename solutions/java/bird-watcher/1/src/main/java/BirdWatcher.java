
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {

        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {

       birdsPerDay[6]++;

    }

    public boolean hasDayWithoutBirds() {

        boolean hasZero = false;
        for(int birds: birdsPerDay){
            if(birds == 0 ){
                hasZero= true;
            }
        }
        return hasZero;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int suma = 0 ;

        if (numberOfDays > 7){
            for(int i = 0 ; i < 7; i++){
                suma = suma + birdsPerDay[i];
            }
        }else{
            for(int i = 0 ; i < numberOfDays; i++){
                suma = suma + birdsPerDay[i];
            }
        }

        return suma;
    }

    public int getBusyDays() {
        int numberDaysBusy = 0;

        for(int numberBirds : birdsPerDay){
            if(numberBirds >= 5 ){
                numberDaysBusy ++;
            }
        }
    return numberDaysBusy;
    }
}
