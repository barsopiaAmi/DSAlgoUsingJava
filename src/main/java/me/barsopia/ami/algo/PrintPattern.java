package me.barsopia.ami.algo;

public class PrintPattern {

    public void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
