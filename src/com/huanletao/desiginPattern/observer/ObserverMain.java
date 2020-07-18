package com.huanletao.desiginPattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author samsung
 * @auther: huangjianfeng
 * @Date: 2020/7/9
 * @Time: 9:03
 * Description: 设计模式 之 观察者模式。
 */
public class ObserverMain{

    public static void main(String[] args) {
        Dog dog = new Dog();
        Observer cat = new Cat();
        Observer perosn = new Perosn();
        dog.registerObserver(cat);
        dog.registerObserver(perosn);
        dog.shout();
    }
}

interface Observer{
    void observe();
}

interface Suject{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

class Cat implements Observer{

    @Override
    public void observe(){
        System.out.println("------- cat run --");
    }
}

class Perosn implements Observer{

    @Override
    public void observe() {
        System.out.println("come on dog");
    }
}

class Dog implements Suject{

   private List<Observer> observers;

   public Dog(){
       observers = new ArrayList<>();
    }

  public void shout(){
      System.out.println("汪汪汪");
      notifyObserver();
  }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.observe();
        }
    }
}