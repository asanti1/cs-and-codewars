package BuyingACar;

public class Kata {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double savings = 0;
        double startPOld = startPriceOld;
        double startPNew = startPriceNew;
        while ((savings + startPOld) < startPNew) {
            startPNew -= (startPNew * percentLossByMonth) / 100;
            startPOld -= (startPOld * percentLossByMonth) / 100;
            if (month % 2 == 0) {
                percentLossByMonth += 0.5;
            }
            month++;
            savings += savingperMonth;
        }
        if ((savings+startPOld - startPNew) - (int)(savings+startPOld - startPNew) > 0.5 ) {
            return new int[] {month, (int) Math.ceil(savings+startPOld - startPNew)};
        } else {
            return new int[] {month, (int) Math.floor(savings+startPOld - startPNew)};
        }
    }
}
