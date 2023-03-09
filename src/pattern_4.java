//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class pattern_4 {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            if (i <= 5) {
                for (int j=1; j<=i;j++){
    //                if(i>5)
    //                    break;
                    System.out.print("*");
                }
            }
            else {
    //            if(i>5){
                for (int k= 1; k<=10-i ; k++){
                    System.out.print("*");
                }
            }
            System.out.print("\n");


        }
    }
}
