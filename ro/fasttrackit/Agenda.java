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
        System.out.println("====Filled agenda looks like====");
        System.out.println(Arrays.toString(agendaArr));

        System.out.println("====Replace element in agenda====");
        System.out.println(Arrays.toString(agendaArr));
        System.out.println(replace(agendaArr, 17, 8));
        System.out.println(Arrays.toString(agendaArr));

        System.out.println("====Searched number in filled agenda====");
        System.out.println(Arrays.toString(agendaArr));
        System.out.println(search(agendaArr, 9));

        System.out.println("====Remove element from array====");
        System.out.println("Original array:");
        System.out.println(Arrays.toString(agendaArr));
        int indexToRemove = 3;
        agendaArr = remove(agendaArr, indexToRemove);
        System.out.println("Copy of array(agendaArr-1)");
        System.out.println(Arrays.toString(agendaArr));
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
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == numberToReplace) {
                agenda[i] = replaceWith;
                return i;
            }
        }
        return -1;
    }

    public static int[] remove(int[] agenda, int remove) {
        //if agenda is empty or index not in agenda.length, return original agenda
        if (agenda == null || remove < 0 || remove >= agenda.length) {
            return agenda; //instead of -1
        }
        //new array of size agenda-1
        int[] copy = new int[agenda.length - 1];
        //from the original agenda, copy elements from [0] till "[remove]"
        //then copy from "[remove + 1]" till end
        System.arraycopy(agenda, 0, copy, 0, remove);
        System.arraycopy(agenda, remove + 1, copy, remove, agenda.length - remove - 1);

        return copy;
    }

    public static int search(int[] agenda, int find) {
        int i = 0;
        while (i < agenda.length && agenda[i] != find) {
            i++;
        }
        if (i == agenda.length) {
            return -1;
        }
        return i;
    }
}
