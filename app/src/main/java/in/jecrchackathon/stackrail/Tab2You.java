package in.jecrchackathon.stackrail;

/**
 * Created by mcbook on 08/01/18.
 */

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;


public class Tab2You extends Fragment {
    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    Button button;
    View rootView3;
    public TextView name;
    public TextView age;
    public TextView doj;
    public TextView station_1;
    public TextView station_2;
    public TextView arrival;
    public TextView seat;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView3 = inflater.inflate(R.layout.tab_you, container, false);


        name = (TextView) rootView3.findViewById(R.id.you_name);
        age = (TextView) rootView3.findViewById(R.id.you_age);
        doj = (TextView) rootView3.findViewById(R.id.you_doj);
        station_1 = (TextView) rootView3.findViewById(R.id.to_station);
        station_2 = (TextView) rootView3.findViewById(R.id.from_station);
        arrival = (TextView) rootView3.findViewById(R.id.you_arrival);
        seat = (TextView) rootView3.findViewById(R.id.you_seat);

        button = (Button) rootView3.findViewById(R.id.button_tabyou);

        //replace the text




        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                navigateToLoginActivity();
            }
        });



        return rootView3;
    }


    private void navigateToLoginActivity() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }
    /*private void navigateToLoginActivity() {
        Intent intent;
        intent = new Intent(Tab2You.this, LoginActivity.class);
        startActivity(intent);
    }*/



    }


