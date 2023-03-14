public class ServiceStation implements Check {
    @Override
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName() + ":");
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }

    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName() + ":");
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName() + ":");
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName() + ":");
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

}