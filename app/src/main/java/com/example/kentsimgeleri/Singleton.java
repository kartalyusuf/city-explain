package com.example.kentsimgeleri;

import android.graphics.Bitmap;

public class Singleton {

    private Bitmap resimsec ;
    private static Singleton singleton;





    public Bitmap getResimsec() {
        return resimsec;
    }

    public void setResimsec(Bitmap resimsec) {
        this.resimsec = resimsec;
    }

    private Singleton() {


    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

            return singleton;

        }

    }




