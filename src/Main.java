public class Main {
    public static void main(String[] args) {

        int account = 100;      //колличество денег на счету
        int cash = 1900;        //сумма пополнения
        int cashback = 0;       //состояние бонусного счета (если важно сохранять бонусные рубли
                                //с предыдущих операций)
        if (cash >= 1000) {
            cashback = cashback + cash / 100;
            account = account + cash + cashback;
        } else {
            account = account + cash + cashback;
        }
        System.out.println("На вашем счету: " + account + " рубля(ей)\n" + "Из них бонусных рублей: " + cashback);

    }
}

