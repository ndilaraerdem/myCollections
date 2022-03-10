package mycollections;

public class Main {


    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<String>();

        System.out.println(myList.size());//0
        myList.add("Ankara");
        myList.add("İzmir");
        myList.add("İstanbul");
        System.out.println(myList.size());//2

        for (String item : myList.items()) {
            System.out.println(item);//Ankara İzmir
        }


        //bütün tiplerin ana nesnesi object'tir.
        //arrayin tipi obje olmalı.
        //Array fonksiyonlarını kullanmak yazak copy concat vs
        //length kullanılabilir.
        //Arraylistler arkada arrayi tutar.

    }
}
