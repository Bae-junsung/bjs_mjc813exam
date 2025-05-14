package unit5;

public class Example {
    public static void main(String[]args){
        //6번
        int[][] array1 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87 ,88}
        };
        System.out.println("6-1번: " + array1.length);
        System.out.println("6-2번: " + array1[2].length);

        //7번
        int[] array2 = {1, 5, 3, 8, 2};
        int max = array2[0];
        for(int i = 0; i < array2.length; i++){
            if(array2[i] > max){
                max = array2[i];
            }
        }
        System.out.println("7번: " + max);

        //8번
        int[][] array3 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87 ,88}
        };
        int sum = 0;
        int count = 0; //항목수?
        for(int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sum += array3[i][j]; //??
                count++; //항목수?
            }
        }
        int avg = sum / count;
        System.out.println("8번 합: " + sum);
        System.out.println("8번 평균: "+ avg); //소수점은 버림
    }
}
