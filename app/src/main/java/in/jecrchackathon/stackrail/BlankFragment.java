package in.jecrchackathon.stackrail;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.firebase.client.Firebase;

/**
 * Created by mcbook on 07/01/18.
 */
public class BlankFragment extends Fragment {


    DatabaseReference rootRef, demoRef;
    //private Firebase mRef;
    public String card1;
    TextView realtime_text;
    public String card2;
    //String card3;
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootRef=FirebaseDatabase.getInstance().getReference();
        demoRef = rootRef.child("Data");
        demoRef.child("Train").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                card1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        demoRef.child("delay").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                card2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        realtime_text = (TextView) rootView.findViewById(R.id.realtime_text) ;
        rv.setHasFixedSize(true);
        //card2="30 minutes delay on Ajmer station";
        realtime_text.setText(card1);
        //"Train No. 12988 on Platform No. 1"
        //"30 minutes delay on Ajmer station"
        MyAdapter adapter1 = new MyAdapter(new String[]{card1, card2 , "REMIND: Your train will reach the station within 1 hour", "REMIND: Your train will reach the station within 2 hour", "Train 12988 started from the source" , "Train 12988 will start from the source within 30 minutes" , "Train 12988 final chart prepared"});
        rv.setAdapter(adapter1);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }



}