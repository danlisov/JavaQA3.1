public class BonusMilesService {
    public int calculate(int ticketPrice){
        int bonusPrice = 20;
        int bonus = ticketPrice / bonusPrice;

        return bonus;
    }
}
