package com.example.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkOutExpert {
     public List<String> getWorkOuts(String workmates) {
        List <String> workout=new ArrayList<>();

        if(workmates.equals("Chest"))
        {
            workout.add("Benchpress");
            workout.add("Cable Flys");
        }
        else if(workmates.equals("Triceps"))
        {
            workout.add("Triceps Ext");
            workout.add("Triceps Pushdown");

        }
        else if(workmates.equals("Shoulder"))
        {
            workout.add("Shoulder Press");

        }
        else if(workmates.equals("Biceps"))
        {
            workout.add("Biceps curl");
        }
        return workout;
    }
}
