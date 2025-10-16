public class Car {
    public String carDetails;
    public int carPrice;

    public Car(String carDetails,int carPrice,){
        this.carDetails=carDetails;
        this.carPrice=carPrice;

    }

    public Car() {

    }

    public void displayCarDetails(){
        System.out.println("this is car details"+carDetails);
        System.out.println("this is car price"+carPrice);

    }
}
