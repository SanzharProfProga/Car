import java.util.Arrays;
import java.util.Scanner;

public class Management {
    private User[] users;
    private static Car[] cars;
    private Driver[] drivers;

    public Management(User[] users, Car[] cars, Driver[] drivers) {
        this.users = users;
        this.cars = cars;
        this.drivers = drivers;
    }

    public Management( Car[] cars) {
        this.cars = cars;
    }


    public Management() {
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }





    static void getTitleCat(String[] titles) {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(i + 1 + " " + titles[i]);
        }
    }

    public void setSelectCarUser(int selectCarId) {
        for (int i = 0; i < cars.length; i++) {
            if (selectCarId == cars[i].getId()) {
                if (cars[i].getStatus()) {
                    cars[i].setStatus(false);
                    System.out.println(cars[i].getInfo());
                } else {
                    System.out.println(cars[i].getBrandCar() + " это машина занято");
                }
            }
        }
    }
    public void setSignInOrSignUp (String str){
        for (int i = 0; i < users.length; i++) {
            users[i].setFirstName(str);
        }
    }


}
