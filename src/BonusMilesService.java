public class BonusMilesService {

    public int calculate(int price){

        int oneMileForTheAmount = 20;

        int miles = price / oneMileForTheAmount;

        return miles;
    }
}