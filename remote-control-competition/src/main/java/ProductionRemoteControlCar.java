class ProductionRemoteControlCar implements RemoteControlCar{
    int distance ;
    int numberOfVictories;
    public void drive() {
        distance += 10;
      
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}
