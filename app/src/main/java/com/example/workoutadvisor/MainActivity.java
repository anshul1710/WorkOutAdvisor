package com.example.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {


 private WorkOutExpert workOutExpert=new WorkOutExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view)
    {
        TextView workouts=(TextView) findViewById(R.id.textView);

        Spinner workout_spinner= (Spinner) findViewById(R.id.workouttype);

        String type=String.valueOf(workout_spinner.getSelectedItem());

        List<String> workOutList=workOutExpert.getWorkOuts(type);

        StringBuilder workOutFormatter=new StringBuilder();
        for(String work: workOutList)
        {
            workOutFormatter.append(work).append('\n').append('\n');
        }

        workouts.setText(workOutFormatter);
    }
}
