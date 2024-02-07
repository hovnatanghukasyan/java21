package Airport;

import Airport.model.Plane;
import Airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.createPlane();
        Plane plane1 = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane[] planes = {plane, plane1, plane2};
//        service.printNameAndYear(plane);
//        service.biggerThan(plane);
//        System.out.println(service.planeWithMoreHours(plane1, plane2));
//        service.longestName(plane1, plane2).printPlaneInfo();
        System.out.println();
        service.printPlaneArray(planes);
        service.printMilitaryPlanesAfter2010(planes);
        System.out.println("------------------");
//        service.maxHoursInAir(planes).printPlaneInfo();
//        service.printOldestPlane(planes);
//        service.printNewestMilitaryPlane(planes);
        service.sortByReleaseYear(planes);
    }
}
