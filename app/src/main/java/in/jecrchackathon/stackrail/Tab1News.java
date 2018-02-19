package in.jecrchackathon.stackrail;

/**
 * Created by mcbook on 08/01/18.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab1News extends Fragment {

    public Tab1News() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView1 = inflater.inflate(R.layout.tab_news, container, false);

        RecyclerView rv1 = (RecyclerView) rootView1.findViewById(R.id.rv_recycler_view_news);
        rv1.setHasFixedSize(true);
        Tab1Adapter adapter2 = new Tab1Adapter(new String[]{"LOST: 1 black coloured luggage name Shashi mentioned", "LOST: Manvi, 5 year old girl, from Jammu , wearing red dress", "BEAWARE: beaware of Chain Snatchers", "CANCELLED: Train 12307 due to technical fault has been cancelled"});
        rv1.setAdapter(adapter2);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv1.setLayoutManager(llm);

        return rootView1;
    }

}