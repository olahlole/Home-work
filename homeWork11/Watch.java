package homeWork11;

public class Watch {
    public static void main(String[] args) {
        int n = (int) (Math.round(Math.random() * 288801));
        System.out.println("До конца рабочего дня осталось" + n + "секунды");
        System.out.println();

        int dayEnd = n /3600;

        if ( dayEnd > 1) {
            System.out.println("осталось " + dayEnd + " часов ");
        } else if (dayEnd == 1) {
            System.out.println("остался час");
        } else {
            System.out.println("осталось меньше часа");
        }

    }
}
