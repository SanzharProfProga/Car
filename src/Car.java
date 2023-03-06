import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Car {
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private short power;
    private LocalDate yearOfRelease;
    private long id;
    private boolean status;
    private BigDecimal rentalPrice;


    public Car(String brandCar, String modelCar, String colorCar, short power, LocalDate yearOfRelease,int id,boolean status,BigDecimal rentalPrice) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.power = power;
        this.yearOfRelease = yearOfRelease;
        this.id = id;
        this.status = status;
        this.rentalPrice = rentalPrice;
    }
    public Car(){

    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Car[] getAllCars(Car[] cars){
       return cars;
    }
    public String getInfo (){
        return "\nCar" +
                "\nBrand: " + brandCar +
                "\nModel: " + modelCar +
                "\nColor: " + colorCar +
                "\nPower: " + power + " PH" +
                "\nYear of release: " + yearOfRelease +
                "\nRental price: " + rentalPrice + " $\n";
    }


}
