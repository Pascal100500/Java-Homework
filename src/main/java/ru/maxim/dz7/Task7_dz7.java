package ru.maxim.dz7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class Task7_dz7 {
    public static void main(String[] args) {

        Predicate<LocalDate> isLeapYear = date -> date.isLeapYear();

        BiFunction<LocalDate, LocalDate, Long> daysBetween = (date1, date2) -> ChronoUnit.DAYS.between(date1, date2);

        BiFunction<LocalDate, LocalDate, Long> weeksBetween = (date1, date2) -> ChronoUnit.WEEKS.between(date1, date2);

        Function<LocalDate, DayOfWeek> getDayOfWeek = date -> date.getDayOfWeek();

        System.out.println("--- Проверка лямбда-выражений ---");

        LocalDate testDate1 = LocalDate.of(2024, 5, 10);
        LocalDate testDate2 = LocalDate.of(2026, 9, 21);
        System.out.println("2024 год високосный? " + isLeapYear.test(testDate1));
        System.out.println("2026 год високосный? " + isLeapYear.test(testDate2));

        LocalDate startDate = LocalDate.of(2026, 9, 1);
        LocalDate endDate = LocalDate.of(2026, 9, 21);
        System.out.println("Дней между 1 и 21 сентября: " + daysBetween.apply(startDate, endDate));
        System.out.println("Полных недель между ними: " + weeksBetween.apply(startDate, endDate));

        LocalDate moonLanding = LocalDate.of(1969, 7, 20);
        System.out.println("20 июля 1969 года — это: " + getDayOfWeek.apply(moonLanding));
    }
}
