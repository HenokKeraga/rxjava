package edu.miu;


import io.reactivex.Observable;
import io.reactivex.functions.Consumer;


public class Test {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("how", "to", "do", "in", "java");

        //consumer
        Consumer<? super String> consumer = System.out::println;

        //Attaching producer to consumer
        observable.subscribe(consumer);



    }
}
