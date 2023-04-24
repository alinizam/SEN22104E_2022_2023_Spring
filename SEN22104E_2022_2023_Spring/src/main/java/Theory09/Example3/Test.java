/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory09.Example3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animalsTest=new ArrayList<>();
        animalsTest.add(new Animal());
        animalsTest.add(new Cat());
        animalsTest.add(new Cat());
        animalsTest.add(new Dog());
        
        makeNoiseofAllAnimal(animalsTest);
        
        ArrayList<Cat> catTest=new ArrayList<>();
        makeNoiseofAllAnimal(catTest); 
        
        
        /*Error because of bound
        ArrayList<Object> objectTest=new ArrayList<>();
        makeNoiseofAllAnimal(objectTest);*/ 
        
        //Consumer concept
        addAnimal(new ArrayList<Object>(),"Dog");
        addAnimal(new ArrayList<>(),"Dog");

       // addAnimal(new ArrayList<Dog>(),"Dog"); Compile Error
        
    }
    //Producer with upper bound
    static void makeNoiseofAllAnimal(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
    
    //Consumer concept
    
    static void addAnimal(List<? super Animal> animals, String type){
            if (type.equals("Cat"))
                animals.add(new Cat());
            else if (type.equals("Dog"))
                animals.add(new Dog());
    }
}
