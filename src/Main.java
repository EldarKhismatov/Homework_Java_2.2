public class Main {
    public static void main(String[] args) {
        int value = 100;
        int add = 1100;
        int bonus;
        if (add > 1000){
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int result = value + add + bonus;
        System.out.println( "Итоговый счёт: " + result + "\n" + "Количество бонусных рублей: " + bonus);
    }
}