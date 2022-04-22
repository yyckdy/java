package api;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(200);
        }
        for (int i = 0; i < arr.length; i++) {
            new SortThread(arr[i]).start();
        }
    }
}

class SortThread extends Thread {
    private int n;

    public SortThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            sleep(n*10);
            System.out.println(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
