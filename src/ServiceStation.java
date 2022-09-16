import java.security.Provider;

public class ServiceStation implements Service {
    @Override
    public void updateTyre(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            if (transports[i] != null) {
                System.out.println("Обслуживаем " + transport.getModelName());
            }
            System.out.println("Меняем покрышку");
        }
    }

    public void checkEngine(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (cars[i] != null) {
                System.out.println("Обслуживаем " + car.getModelName());
            }
            System.out.println("Проверяем двигатель");
        }
    }

    public void checkEngine(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            if (trucks[i] != null) {
                System.out.println("Обслуживаем " + truck.getModelName());
            }
            System.out.println("Проверяем двигатель");
        }
    }

    public void checkTrailer(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            if (trucks[i] != null) {
                System.out.println("Обслуживаем " + truck.getModelName());
            }
            System.out.println("Проверяем прицеп");
        }
    }
}