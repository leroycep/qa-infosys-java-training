package dev.leroycepearson.arraysandfor;

class ArraysAndFor {

    public static void main(String[] args) {
        initArray();
        initArray2();
        enhancedFor1();
        enhancedFor2();
        enhancedFor4();
        bonusTask();
    }

    public static void initArray() {
        int[] values = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        for (int val: values) {
            System.out.println(val);
        }
    }

    public static void initArray2() {
        int[] values = new int[13];
        for (int i = 0; i < values.length; i += 1) {
            values[i] = i+1;
            System.out.println(values[i]);
        }

        for (int i = 0; i < values.length; i += 1) {
            values[i] *= 10;
            System.out.println(values[i]);
        }
    }

    public static void enhancedFor1() {
        String[] values = {"hello", "world", "say", "hi"};
        for (String val: values) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void enhancedFor2() {
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int val: values) {
            System.out.print(val * val + " ");
        }
        System.out.println();
    }

    public static boolean enhancedFor3(int param1) {
        return param1 % 2 == 0;
    }

    public static void enhancedFor4() {
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int val: values) {
            if (enhancedFor3(val)) {
                System.out.print(val * val * val + " ");
            } else {
                System.out.print(val * val + " ");
            }
        }
        System.out.println();
    }

    public static void bonusTask() {
        char[][] cells = {
            {'=','=','=','=','='},
            {'=','-','-','-','='},
            {'=','-','X','-','='},
            {'=','-','-','-','='},
            {'=','=','=','=','='},
        };

        for (char[] row: cells) {
            for (char cell: row) {
                System.out.print("[" + cell + "] ");
            }
            System.out.println();
        }
    }

}
