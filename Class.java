public class Class {
    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);
        var firstElement = sda.arr[0];
        System.out.println(firstElement);
        var secondElement = sda.arr[1];
        System.out.println(secondElement);
        System.out.println("Array traversal");
        sda.traverseArray();
        System.out.println("Search in array");
        sda.searchInArray(10);
        sda.searchInArray(1);
        sda.deleteValue(0);
        System.out.println(sda.arr[56]);
    }
    
}
