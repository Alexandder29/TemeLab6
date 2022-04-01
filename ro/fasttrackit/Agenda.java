package ro.fasttrackit;

import java.util.Arrays;
// return -1 if number not found;

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
        System.out.println("Replace element in agenda");
        System.out.println(replace(agendaArr,16,8));
        System.out.println("Searched number in filled agenda:");
        System.out.println(find(agendaArr, 9));
    }

    public static int addToAgenda(int[] agenda, int numbersToFill) {
        int i = 0;
        while (i < agenda.length && agenda[i] != 0) {
            i++;
        }
        if (i == agenda.length) {
            return -1;
        }
        agenda[i] = numbersToFill;
        return i;
    }

    public static int replace(int[] agenda, int numberToReplace, int replaceWith) {
        for (int j : agenda) {
            if (j == numberToReplace) {
                return replaceWith;
            }
        }
        return -1;
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