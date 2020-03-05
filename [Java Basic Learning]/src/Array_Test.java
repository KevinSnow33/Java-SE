public class Array_Test {
    public static void main(String[] args){

        //数组三种定义格式
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{1,2,3};
        int[] arr3 = {1,2,3};

        int[] arr_test = new int[5];
        arr_test[0] = 0;
        arr_test[1] = 1;
        arr_test[2] = 2;

        System.out.println(arr_test[0]);
        System.out.println(arr_test[1]);
        System.out.println(arr_test[2]);
        System.out.println(arr_test[3]);   //未赋值的话初值为0
        System.out.println(arr_test[4]);   //未赋值的话初值为0
        System.out.println("数组长度为："+arr_test.length);   //输出数组长度

        System.out.println("标准for循环遍历数组格式：");
        for(int i = 0; i < arr_test.length; i++){
            System.out.println(arr_test[i]);
        }

    }
}
