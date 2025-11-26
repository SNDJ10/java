package com.xworkz.list.external;

import com.xworkz.list.dto.BiggBoss;

import java.util.ArrayList;
import java.util.List;

public class BiggBossRunner {
    public static void main(String[] args) {
        BiggBoss biggBoss=new BiggBoss(251,true,"Gilli",25000);
        BiggBoss biggBoss1=new BiggBoss(251,true,"kavya",25000);
        BiggBoss biggBoss2=new BiggBoss(251,true,"raghu",25000);
        BiggBoss biggBoss3=new BiggBoss(251,true,"ashwini",25000);
        BiggBoss biggBoss4=new BiggBoss(251,true,"spandana",25000);
        List<BiggBoss> show=new ArrayList<>();
        show.add(biggBoss);
        show.add(biggBoss1);
        show.add(biggBoss2);
        show.add(biggBoss3);
        show.add(biggBoss4);
        System.out.println(show.get(3).getNames());
//        show.forEach(n-> System.out.println(n));
        for (BiggBoss name:show){
            System.out.println(name);
        }
    }
}
