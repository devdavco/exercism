public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven(){
        int time = 40;

        return time;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int remaining){

        int time = expectedMinutesInOven() - remaining;

        return time;
    }
    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layers){

        int totalTime = layers * 2;

        return totalTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int minutesRemaining){

        int preparationTime = preparationTimeInMinutes(layers);

        int total = preparationTime + minutesRemaining ;

        return total;

    }
}
