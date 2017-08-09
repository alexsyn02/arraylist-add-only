package ua.com;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ArrayList<String> arrayList = new ArrayList<String>(2);
        showSize(arrayList);
        arrayList.add("Alexandr");
        showSize(arrayList);
        arrayList.add("Anastasia");
        showSize(arrayList);
        arrayList.add("John");
        showSize(arrayList);
        arrayList.add(3, "Maxim");
        showSize(arrayList);
        arrayList.add(2, "Amanda");
        showSize(arrayList);
        arrayList.remove(1);
    }

    public static void showSize(ArrayList arrayList) {
        System.out.print("Array: ");
        for(Object str : arrayList.elementData) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Length of ArrayList: " + arrayList.elementData.length);
        System.out.println("Amount of values: " + arrayList.size());
        System.out.println();
    }
}
