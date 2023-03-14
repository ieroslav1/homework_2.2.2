public class Main {
    public static void main(String[] args) {

        Bicycle stels = new Bicycle("Стелс", 2);
        Bicycle kama = new Bicycle("Кама", 2);


        Car lada = new Car("Лада", 4);
        Car kia = new Car("Киа", 4);


        Truck man = new Truck("Ман", 6);
        Truck kamaz = new Truck("Камаз", 8);


        ServiceStation station = new ServiceStation();
        station.check(stels);
        System.out.println();
        station.check(kama);
        System.out.println();
        station.check(lada);
        System.out.println();
        station.check(kia);
        System.out.println();
        station.check(man);
        System.out.println();
        station.check(kamaz);
    }
}