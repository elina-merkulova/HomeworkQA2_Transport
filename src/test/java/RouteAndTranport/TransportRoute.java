package RouteAndTranport;

import org.junit.jupiter.api.Test;

public class TransportRoute {
    @Test
    public void workingWithTransportRoute() {


            Transport firstTransport = new Transport();
            firstTransport.setType("Car");
            firstTransport.setTankVolume(60);
            firstTransport.setFuelUsagePer100kn(4.6);

            Transport secondTransport = new Transport();
            secondTransport.setType("Train");
            secondTransport.setTankVolume(1500);
            secondTransport.setFuelUsagePer100kn(106.67);

            Transport thirdTransport = new Transport();
            thirdTransport.setType("Plane");
            thirdTransport.setTankVolume(198380);
            thirdTransport.setFuelUsagePer100kn(236.5);

            Route firstRoute = new Route();
            firstRoute.setDestinationName("Vladivostok");
            firstRoute.setStartingPointName("Riga");
            firstRoute.setDistanceKm(10110);

            Route secondRoute = new Route();
            secondRoute.setDestinationName("Vilnius");
            secondRoute.setStartingPointName("Riga");
            secondRoute.setDistanceKm(285.9);

            Route thirdRoute = new Route();
            thirdRoute.setDistanceKm(213.3);
            thirdRoute.setDestinationName("Liepaja");
            thirdRoute.setStartingPointName("Riga");

            System.out.println("Riga-Vladivostok");
            System.out.println(firstRoute.getDistanceKm());
            System.out.println("Car:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(firstRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (firstRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() <= firstTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (firstRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() > firstTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Train:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(firstRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (firstRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() <= secondTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (firstRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() > secondTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Plane:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(firstRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (firstRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() <= thirdTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (firstRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() > thirdTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Riga-Vilnius");
            System.out.println(secondRoute.getDistanceKm());
            System.out.println("Car:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(secondRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (secondRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() <= firstTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (secondRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() > firstTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Train:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(secondRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (secondRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() <= secondTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (secondRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() > secondTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Plane:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(secondRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (secondRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() <= thirdTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (secondRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() > thirdTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Riga-Liepaja");
            System.out.println(thirdRoute.getDistanceKm());
            System.out.println("Car:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(thirdRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (thirdRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() <= firstTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (thirdRoute.getDistanceKm() / 100 * firstTransport.getFuelUsagePer100kn() > firstTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Train:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(thirdRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (thirdRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() <= secondTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (thirdRoute.getDistanceKm() / 100 * secondTransport.getFuelUsagePer100kn() > secondTransport.getTankVolume()) {
                System.out.println("NO");
            }
            System.out.println("Plane:");
            System.out.println("Fuel needed for distance(in liters):");
            System.out.println(thirdRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn());
            System.out.println("Is it Possible to reach destination using one fuel tank?");
            if (thirdRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() <= thirdTransport.getTankVolume()) {
                System.out.println("YES");
            } else if (thirdRoute.getDistanceKm() / 100 * thirdTransport.getFuelUsagePer100kn() > thirdTransport.getTankVolume()) {
                System.out.println("NO");
        }

    }
}
