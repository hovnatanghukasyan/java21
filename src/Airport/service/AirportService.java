package Airport.service;

import Airport.model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in Air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter Release Date");
        plane.setReleaseDate(s.nextInt());
        System.out.println("Is it Military?");
        String m = s.next();
        plane.setMilitary(m.charAt(0) == 'Y' || m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndYear(Plane plane) {
        System.out.println(plane.getName() + ", " + plane.getReleaseDate());
    }

    public void biggerThan(Plane plane) {
        if (plane.getReleaseDate() > 2000)
            System.out.println(plane.getName());
        else
            System.out.println(plane.getHoursInAir());
    }

    public String planeWithMoreHours(Plane plane1, Plane plane2) {
        if (plane1.getHoursInAir() > plane2.getHoursInAir())
            return plane1.getName();
        else
            return plane2.getName();
    }

    public Plane longestName(Plane a, Plane b) {
        return a.getName().length() > b.getName().length()?a:b;
    }
    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes) {
            x.printPlaneInfo();
        }
    }
        public void printMilitaryPlanesAfter2010(Plane[] planes){
            for (Plane x:planes) {
               if (x.isMilitary() && x.getReleaseDate()>2010)
                   x.printPlaneInfo();
            }
    }
    public Plane maxHoursInAir(Plane[] planes){
        Plane max = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > max.getHoursInAir()) {
                max = planes[i];
            }
        }
        return max;
    }

    public void printOldestPlane(Plane[] planes){
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getReleaseDate() < min.getReleaseDate()) {
                min = planes[i];
            }
        }
        min.printPlaneInfo();
    }
    public void printNewestMilitaryPlane (Plane[] planes){
        Plane max = planes[0];
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()){
                max = planes [i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary+1; i < planes.length; i++) {
                if (planes[i].isMilitary() && planes[i].getReleaseDate() > max.getReleaseDate()) {
                max = planes[i];
            }
        }
        max.printPlaneInfo();
    }

    public void sortByReleaseYear (Plane [] planes){
        boolean whileEnters = true;
        int countOfFors = 0;
        while (whileEnters) {
            whileEnters = false;
            for (int i = 0; i < planes.length - 1 - countOfFors; i++) {
                if (planes[i].getReleaseDate() > planes [i+1].getReleaseDate()){
                        Plane zz = planes[i];
                        planes[i] = planes [i+1];
                        planes [i+1] = zz;
                        whileEnters= true;
                }

            }
            countOfFors++;
        }
        printPlaneArray(planes);
    }
}
