import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "RS7", "Black", (short) 600, LocalDate.ofYearDay(2019, 6),
                1, true, new BigDecimal("3200"));
        Car car1 = new Car("Nissan", "GTR 35 nismo", "Ultimate Silver", (short) 600, LocalDate.ofYearDay(2019, 5),
                2, true, new BigDecimal("2500"));
        Car car2 = new Car("Toyota", "Supra A90", "Ice Gray Metallic", (short) 390, LocalDate.ofYearDay(2021, 5),
                3, true, new BigDecimal("4200"));
        Car car3 = new Car("Mercedes-Benz", "Maybach S580", "Black Obsidian", (short) 503, LocalDate.ofYearDay(2022, 7),
                4, true, new BigDecimal("2300"));
        Car car4 = new Car("Honda", "Civic", "Milano Red", (short) 140, LocalDate.ofYearDay(2018, 7),
                5, true, new BigDecimal("4300"));
        Car car5 = new Car("Mitsubishi ", "Lancer", "Amethyst Black", (short) 241, LocalDate.ofYearDay(2011, 6),
                6, true, new BigDecimal("1300"));

        Car[] cars = {car, car1, car2, car3, car4, car5};

        String[] title = {car.getBrandCar(), car1.getBrandCar(), car2.getBrandCar(), car3.getBrandCar(), car4.getBrandCar(), car5.getBrandCar()};

        Management managements = new Management(cars);
        User user = new User();

        int a = cars.length;
        int b = 0;

        System.out.println(welcome());
        boolean isTrue = true;
        while (isTrue) {

            a++;
            b++;
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode) {
                case 1 -> {
                    Management.getTitleCat(title);
                    int select = new Scanner(System.in).nextInt();
                    managements.setSelectCarUser(select);

                    boolean isTrue1 = true;
                    while (isTrue1) {
                        System.out.println("""
                                1: Sign in
                                2: Sign up
                                """);
                        switch (new Scanner(System.in).nextInt()) {
                            case 1 -> {
                                System.out.println("Enter phone number");
                                long phoneNumber = new Scanner(System.in).nextLong();
                                System.out.println("Enter password");
                                String password = new Scanner(System.in).nextLine();
                                if (password.equals(saveUsers(null,0,0).getPassword()) &&
                                        phoneNumber == saveUsers(null,0,0).getPhoneNumber()){
                                    System.out.println(user.toString());
                                }
                            }
                            case 2 -> {
                                System.out.println(user.saveUser());
                                saveUsers(user, a, b);

                            }
                        }
                    }


                }
                case 2 -> {
                    isTrue = false;
                }

            }
        }


        /**  BOOKING SERVICE :
         БРОНЬ МАШИН.
         ПРИ ЗАПУСКЕ ПРОГРАММЫ КЛИЕНТ ПОЛУЧАЕТ ВЕСЬ СПИСОК ДОСТУПНЫХ МАШИН (МЕНЮ)
         ДОБРО ПОЖАЛОВАТЬ
         ВЫБЕРИТЕ МАРКУ МАШИНЫ, КОТОРУЮ ХОТЕЛИ БЫ ЗАБРОНИРОВАТЬ
         ДОСТУПНЫЕ МАШИНЫ
         1. ФЕРРАРИ
         2. ХОНДА
         3. МЕРС
         4. ТОЙОТА
         5. КИА
         6. АУДИ
         7. БМВ

         ---------------------------------------------------------------------------------




         ---------------------------------------------------------------------------------


         ДЛЯ ОСУЩЕСТВЛЕНИЯ ПРОЕКТА СОЗДАЕМ ТАКИЕ КЛАССЫ КАК
         CAR
         DRIVER
         USER
         MANAGEMENT
         У класса менеджмент должны иметься такие поля как массив USERS и CARS и DRIVERS
         Чтобы у менеджмента была база данных клиентов, машин и рабочих(водителей)

         ---------------------------------------------------------------------------------

         Домашняя работа:
         ДОБАВИТЬ ЦЕНУ МАШИНАМ, А ТАК ЖЕ ПРИНЯТЬ ОПЛАТУ В СЧЕТ КОМПАНИИ
         ДЛЯ ЭТОГО СОЗДАЕМ КЛАСС BANK (поля баланс) и добавляем методы у клиента (User)
         pay() deposit()
         В этом случае программа при брони будет выглядеть следующим образом
         ВВЕДИТЕ ИМЯ
         ВВЕДИТЕ АДРЕС
         ВВЕДИТЕ НОМЕР ТЕЛЕФОНА
         ВНЕСИТЕ ОПЛАТУ
         ВЫВЕСТИ НА ЭКРАН:
         "ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ" < -- ЕСЛИ У КЛИЕНТА ДОСТАТОЧНО ДЕНЕГ
         ВЫ УСПЕШНО ЗАБРОНИРОВАЛИ МАШИНУ, ОНА К ВАШИМ УСЛУГАМ !!!
         И НА ЭТОМ ОСТАНОВИТЬ ПРОГРАММУ
         ---------------------------------------------------------------------------------
         В СЛУЧАЕ ЕСЛИ У НЕГО НЕТ ДОСТАТОЧНЫХ СРЕДСТВ ВЫВЕСТИ:
         "К СОЖАЛЕНИЮ В ВАШЕМ СЧЕТУ НЕТ ДОСТАТОЧНО ДЕНЕГ,
         ЕСЛИ ХОТИТЕ МОЖЕТЕ ПОПОЛНИТЬ БАЛАНС НЕ ВЫХОДЯ ИЗ СИСТЕМЫ, ВЫ ЖЕЛАЕТЕ?(ДА/НЕТ")
         ЕСЛИ ОН НАПИШЕТ ДА
         ТО -->
         "ЧТОБЫ ВНЕСТИ ДЕНЬГИ НА СЧЕТ, ВВЕДИТЕ ИМЯ ПОЛЬЗОВАТЕЛЯ И ПАРОЛЬ"
         ЕСЛИ ВСЕ ПРАВИЛЬНО ВЫПОЛНИТЬ ОПЕРАЦИЮ
         И ОБРАТНО ПОПРОБОВАТЬ ВНЕСТИ ОПЛАТУ ЗА БРОНЬ
         ВНЕСИТЕ ОПЛАТУ
         ВЫВЕСТИ НА ЭКРАН:
         "ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ" < -- ЕСЛИ У КЛИЕНТА ДОСТАТОЧНО ДЕНЕГ
         ВЫ УСПЕШНО ЗАБРОНИРОВАЛИ МАШИНУ, ОНА К ВАШИМ УСЛУГАМ !!!
         И НА ЭТОМ ОСТАНОВИТЬ ПРОГРАММУ
         ЕСЛИ НЕТ ВЫВЕСТИ ОБ ОШИБКЕ ВЫПОЛНЕНИЯ
         И ВЫБРОСИТЬ ИЗ СИСТЕМЫ!*/
    }

    static String welcome() {
        return """
                ~~~~~~~~~~Welcome~~~~~~~~~~
                ``````````Select mode ``````````
                1: Start system
                2: End the program""";
    }

    static void brandCar(String[] titleArray) {
        for (int i = 0; i < titleArray.length; i++) {
            System.out.println(i + 1 + " " + titleArray[i]);
        }

    }

    static User saveUsers(User user, int length, int count) {
        User[] users = new User[length];
        users[count] = user;
        return users[count];
    }
}