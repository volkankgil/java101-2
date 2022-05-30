package diziler;

public class çokboyutludiziler {
    public static void main(String[] args) {
        int[] list =new int[5]; //5 sayýsý array 'in indis sayýsýný belirtiyor. yani 0 da olduðu için 6'dýr.

        int [] list2 ={10,20,30,40};
        System.out.println(list2[2]);


        int[][]matrix=new int[6][6];
        matrix [0][0]=0;
        matrix [2][3]=859;
        System.out.println(matrix[2][3]);


        int matrixbir[][] ={{5,12,14,15}};//deðiþken ismini köþeli parantezden öncede sonrada koyabiliriz.çoklu dizilerde 2 tane süslü parantez oluyor.
        System.out.println(matrixbir[0][3]);

        int matrixiki[][] = {{0, 453, 939, 243, 783, 891},
                             {453, 0, 490, 384, 620, 439},
                             {939, 490, 0, 839, 863, 423},
                             {243, 384, 839, 0, 544, 823},
                             {783, 620, 863, 544, 0, 1045},
                             {891, 439, 423, 823, 1045, 0}};

        System.out.println(matrixiki[3][4]);


        int[][] matris4 =new int[6][8];
        System.out.println(matris4.length);
        System.out.println(matris4[0].length); // satýrý sýfýrdan baþlatýp saða doðru sütun sayýsýný veriyor.

        int[][] matrix5 = new int[3][4];
        //matrix5 =[0][1],[0][2],.....,[0][n]
        int number = 1;
        for(int i=0;i<matrix5.length ;i++) {
            for (int j = 0; j < matrix5[i].length; j++) {
                matrix5[i][j] = number++;
                System.out.print(matrix5[i][j]+",");
            }
            System.out.println();
        }
        System.out.println(matrix5[2][3]);



    }
}
