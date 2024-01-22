public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        int [] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        double[] arr1={1.57, 7.654, 9.986};
        char[] symArr={'П','р','и','в','е','т'};

        //Задание 2
        for(int i=0;i<=2;i++){
            System.out.print(arr[i]);
            if (i!=2){
                System.out.print(", ");
            }

        }
        System.out.println();
        for(int i=0;i<=2;i++){
            System.out.print(arr1[i]);
            if (i!=2){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i=0;i<=5;i++){
            System.out.print(symArr[i]);
            if (i!=5){
                System.out.print(", ");
            }

        }
        System.out.println();


    }
}