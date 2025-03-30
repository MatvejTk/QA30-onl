package lesson_1;

class TestingPurpose {
    public static void main(String[] args) {
        getFullName();

        System.out.println(getFullName());
    }
    public static String getFullName() {
        System.out.println("Hello, world!");
        // void значит, что метод ничего не возвращает
        // если заменить ключевое слово void на любую другой тип переменной
        // то метод обязан его вернуть

        return "Archil Sikharulidze";

    }
}