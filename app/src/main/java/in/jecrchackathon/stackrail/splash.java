package in.jecrchackathon.stackrail;

/**
 * Created by mcbook on 08/01/18.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splash extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hola);
        Thread splashThread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    int waited = 0;
                    while (waited < 3000)
                    {
                        sleep(100);
                        waited += 100;
                    }
                } catch (InterruptedException e)
                {
                    // do nothing
                } finally
                {
                    finish();
                    Intent i = new Intent(splash.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        splashThread.start();
    }
}
