public class Main {
    public static void main(String[] args) {
        //Массивы. Начало
        //task1
        int[] muse = new int[3];
        muse[0] = 1;
        muse[1] = 2;
        muse[2] = 3;
        double[] doubleMuse = {1.57, 7.654, 9.986};
        int x = 10;
        int y = 7;
        boolean[] toBeOrNotToBe = {x > y, x == y, x < y};
        //task2
        for (int i = 0; i < muse.length; i++) {
            if (i == muse.length - 1) {
                System.out.println(muse[i]);
            } else {
                System.out.print(muse[i] + ", ");
            }
        }
        for (int i = 0; i < doubleMuse.length; i++) {
            if (i == doubleMuse.length - 1) {
                System.out.println(doubleMuse[i]);
            } else {
                System.out.print(doubleMuse[i] + ", ");
            }
        }
        for (int i = 0; i < toBeOrNotToBe.length; i++) {
            if (i == toBeOrNotToBe.length - 1) {
                System.out.println(toBeOrNotToBe[i]);
            } else {
                System.out.print(toBeOrNotToBe[i] + ", ");
            }
        }
        //task3
        for (int i = muse.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(muse[i]);
            } else {
                System.out.print(muse[i] + ", ");
            }
        }
        for (int i = doubleMuse.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleMuse[i]);
            } else {
                System.out.print(doubleMuse[i] + ", ");
            }
        }
        for (int i = toBeOrNotToBe.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(toBeOrNotToBe[i]);
            } else {
                System.out.print(toBeOrNotToBe[i] + ", ");
            }
        }
        //task4
        for (int i = 0; i <= muse.length - 1; i++) {
            if (muse[i] % 2 != 0) {
                muse[i]=muse[i]+1;
            }
            System.out.print(muse[i]+"  ");
        }
    }
}