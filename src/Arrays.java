public class Arrays {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multi = 1; //произведение массива изначально задаем как 1
        for(int i = 0; i < array.length; i++){
            multi *= array[i];
        }
        System.out.println("Произведение чисел массива = " + multi); //Вывод на консоль ответа
    }
}
