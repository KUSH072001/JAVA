package Pattern;



public class Hollow_Square {
    public static void main(String[] args) {
//*
//**
//* *
//*  *
//*****




        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                if(i==3 && j==2||i==4&&j==3||i==4&&j==2){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

    }
}
