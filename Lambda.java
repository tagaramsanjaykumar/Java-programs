public class Lambda {
    public static void main(String[] args){
        Audi a=new Audi();
        a.drive("2");
        Car c1=new Car(){
            public void drive(String str){
                System.out.println("Driving Tata");
            }
        };
        c1.drive("1");
        Car c2=s -> {System.out.println(s);};
        c2.drive("Rollce royce");
    }
}
class Audi implements Car{
    @Override
    public void drive(String str) {
        System.out.println("Driving BMW"+str);
    }
}
interface Car {
    public void drive(String str);
}