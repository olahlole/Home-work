package homeWork11;

public class Weather {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

        System.out.println("Выходные и дождь не идет?");

        boolean isEdakaOpen = true;
        boolean isReweOpen = false;
        boolean canBuyFood = canBuy(isReweOpen, isEdakaOpen);
        System.out.println("Я могу купить еду: " + canBuyFood);
    }
    private static boolean canBuy(boolean isReweOpen, boolean isEdakaOpen) {
        return isReweOpen || isEdakaOpen;
    }

    }



