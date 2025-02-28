package org.acme.quarkus.reservation.inventory;

import java.util.List;

public interface InventoryClient {

    List<Car> allCars();
}
