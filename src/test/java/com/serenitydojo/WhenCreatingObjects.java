package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog Kobe = new Dog("Kobe", "Bone", 5);
        Assert.assertEquals(Kobe.getName(), "Kobe");
        Assert.assertEquals(Kobe.getFavoriteToy(), "Bone");
        Assert.assertEquals(Kobe.getAge(), 5);
    }

    @Test
    public void whenADogBarks() {
        Dog Kobe = new Dog("Kobe", "Bone", 5);

        String dogSound = "";
        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        dogSound = Kobe.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog Kobe = new Dog("Kobe", "Bone", 5);

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:

        fido.feed();
        System.out.println(fido.isFed());

        Kobe.feed();


        Assert.assertTrue(Kobe.isFed());

    }


    @Test
    public void pet_makes_noise() {
        Pet floppy = new Cat("floppy", "Mouse", 2);
        Pet kobe = new Dog("kobe", "Bugs Bunny", 6);
        Pet Rusty = new Hampster("Rusty", "Wheel", 1);
        System.out.println("Cat name is " + floppy.getName() + " His Age is " + floppy.getAge());
        System.out.println("Dog name is " + kobe.getName() + " His Age is " + kobe.getAge());
        System.out.println("Hampster name is " + Rusty.getName() + " His Age is " + Rusty.getAge());

    }

    @Test
    public void whenAnimalsPlay() {


        Pet Kobe = new Dog("Kobe", "Bone", 5);
        Pet floppy = new Cat("floppy", "String", 5);
        Pet Rusty = new Hampster("Rusty", "Wheel", 1);

        assertThat(Kobe.play(), equalTo("plays with bone"));
        assertThat(floppy.play(), equalTo("plays with string"));
        assertThat(Rusty.play(), equalTo("runs in wheel"));


    }
}
