package org.tasks;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.List;

public class TransformPets {
    public Animal PToA(Pet pet) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field Fn = pet.getClass().getDeclaredField("name");
        Fn.setAccessible(true);
        String nameP = (String) Fn.get(pet);
        Field Fst = pet.getClass().getDeclaredField("status");
        Fst.setAccessible(true);
        Status statP = (Status) Fst.get(pet);
        Field Fph = pet.getClass().getDeclaredField("photosList");
        Fph.setAccessible(true);
        List<Photo> photP = (List<Photo>) Fph.get(pet);

        Class<Photo> ph = Photo.class;
        Method mn = ph.getDeclaredMethod("getName");
        Method mu = ph.getDeclaredMethod("getURL");
        mn.setAccessible(true);
        mu.setAccessible(true);

        Animal na = new Animal();
        Class<Animal> Ancl = Animal.class;
        Field Ft = Ancl.getDeclaredField("title");
        Ft.setAccessible(true);
        Field Fs = Ancl.getDeclaredField("isSold");
        Fs.setAccessible(true);
        Field Fa = Ancl.getDeclaredField("isAvailable");
        Fa.setAccessible(true);
        Field Fpm = Ancl.getDeclaredField("photosMap");
        Fpm.setAccessible(true);



        Ft.set(na, nameP);
        if (statP == Status.SOLD) {
            Fs.set(na, true);
            Fa.set(na, false);
        } else {
            Fs.set(na, false);
            Fa.set(na, true);
        }
        HashMap<String, String> mp = new HashMap<String, String>();
        for (int i = 0; i < photP.size(); i++) {
            mp.put((String) mn.invoke(photP.get(i)), (String) mu.invoke(photP.get(i)));
        }
        Fpm.set(na, mp);
        return na;
    }
}
