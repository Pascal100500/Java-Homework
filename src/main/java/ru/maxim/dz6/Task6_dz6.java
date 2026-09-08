package ru.maxim.dz6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Task6_dz6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите среднее время между появлениями пассажиров:");
        int passengerInterval = scanner.nextInt();

        System.out.println("Введите среднее время между появлениями катеров:");
        int boatInterval = scanner.nextInt();

        System.out.println("Введите максимальное количество людей на причале N:");
        int maxPeople = scanner.nextInt();

        Queue<Passenger> passengers = new LinkedList<>();

        int simulationTime = 120;

        int totalWaitingTime = 0;
        int boardedPassengers = 0;
        int maximumQueueSize = 0;

        for (int currentTime = 0; currentTime <= simulationTime; currentTime++) {
            if (currentTime % passengerInterval == 0) {
                Passenger passenger = new Passenger(currentTime);
                passengers.offer(passenger);

                System.out.println(
                        "Минута " + currentTime +
                                ": пришёл пассажир. В очереди: " + passengers.size()
                );
            }

            if (currentTime % boatInterval == 0) {
                boolean finalStop = random.nextBoolean();
                Boat boat = new Boat(finalStop);

                System.out.println(
                        "Минута " + currentTime +
                                ": пришёл катер. Свободных мест: " + boat.getFreeSeats()
                );

                int freeSeats = boat.getFreeSeats();

                while (freeSeats > 0 && !passengers.isEmpty()) {
                    Passenger passenger = passengers.poll();

                    int waitingTime = currentTime - passenger.getArrivalTime();

                    totalWaitingTime += waitingTime;
                    boardedPassengers++;

                    freeSeats--;

                }
            }
            if (passengers.size() > maximumQueueSize) {
                maximumQueueSize = passengers.size();
            }

        }
        double averageWaitingTime = 0;

        if (boardedPassengers > 0) {
            averageWaitingTime =
                    (double) totalWaitingTime / boardedPassengers;
        }
        System.out.println();
        System.out.println("Результаты моделирования:");
        System.out.println("Среднее время ожидания: " + averageWaitingTime);
        System.out.println("Максимальное количество людей на причале: " + maximumQueueSize);

        if (maximumQueueSize <= maxPeople) {
            System.out.println("Интервал движения катеров подходит.");
        } else {
            System.out.println("Интервал движения катеров слишком большой.");
        }
    }
}
