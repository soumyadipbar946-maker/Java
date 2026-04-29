abstract class MotorVehicle{
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String n,int no,double p){
        modelName=n;
        modelNumber=no;
        modelPrice=p;
    }

    abstract void display();
}

class Car extends MotorVehicle{
    double discountRate;

    Car(String n,int no,double p,double d){
        super(n,no,p);
        discountRate=d;
    }

    double discount(){
        return modelPrice*discountRate/100;
    }

    void display(){
        System.out.println("Car Name: "+modelName);
        System.out.println("Model No: "+modelNumber);
        System.out.println("Price: "+modelPrice);
        System.out.println("Discount: "+discount());
    }
}

public class Main{
    public static void main(String args[]){
        Car c=new Car("BMW",2024,5000000,10);
        c.display();
    }
}
