package in.jecrchackathon.stackrail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.Serializable;


public class DetailActivity extends AppCompatActivity {

    public Button upload_ticket;
    public EditText editName;
    public EditText editAge;
    public EditText editFrom;
    public EditText editTo;
    public EditText editDate;
    public EditText editArrival;
    public EditText editSeat;
    public Button confirm;


    public String enteredName ;
    public String enteredAge ;
    public String enteredFrom ;
    public String enteredTo ;
    public String enteredDate ;
    public String enteredArrival;
    public String enteredSeat ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        upload_ticket = (Button) findViewById(R.id.upload_ticket);
        editName = (EditText) findViewById(R.id.editName);
        editAge = (EditText) findViewById(R.id.editAge);
        editFrom = (EditText) findViewById(R.id.editFrom);
        editTo = (EditText) findViewById(R.id.editTo);
        editDate = (EditText) findViewById(R.id.editDate);
        editArrival = (EditText) findViewById(R.id.editArrival);
        editSeat = (EditText) findViewById(R.id.editSeat);
        confirm = (Button) findViewById(R.id.editConfirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  enteredName = editName.getText().toString().trim();
                  enteredAge = editAge.getText().toString().trim();
                  enteredFrom = editFrom.getText().toString().trim();
                  enteredTo = editTo.getText().toString().trim();
                  enteredDate = editDate.getText().toString().trim();
                  enteredArrival = editArrival.getText().toString().trim();
                  enteredSeat = editSeat.getText().toString().trim();

                 //call a function to do intent as earlier


                 editName.setText("");
                 editAge.setText("");
                 editFrom.setText("");
                 editTo.setText("");
                 editFrom.setText("");
                 editDate.setText("");
                 editArrival.setText("");
                 editSeat.setText("");





            }





                //replace the text in textView on class Tab2You


        });


    }



}




