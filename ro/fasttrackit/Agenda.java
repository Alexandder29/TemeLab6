package ro.fasttrackit;

import java.util.Arrays;
// -1 means error;

public class Agenda {
    public static void main(String[] args) {
        int[] agendaArr = new int[5];
        System.out.println(Arrays.toString(agendaArr));
        System.out.println(addToAgenda(agendaArr, 16));
        System.out.println(addToAgenda(agendaArr, 5));
        System.out.println(addToAgenda(agendaArr, 28));
        System.out.println(addToAgenda(agendaArr, 17));
        System.out.println(addToAgenda(agendaArr, 9));
        System.out.println("New agenda looks like:");
        System.out.println(Arrays.toString(agendaArr));
        System.out.println("Searched number in filled agenda:");
        System.out.println(find(agendaArr, 9));
    }

    public static int addToAgenda(int[] agendaArr, int numbersToFill) {
        int i = 0;
        while (i < agendaArr.length && agendaArr[i] != 0) {
            i++;
        }
        if (i == agendaArr.length) {
            return -1;
        }
        agendaArr[i] = numbersToFill;
        return i;
    }

    public static int find(int[] agenda, int search) {
        for (int j : agenda) {
            if (search == j) {
                return j;
            }
        }
        return -1;
    }
}