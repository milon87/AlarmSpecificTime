package com.enableit.alarmatspecifictime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by dinislam on 1/2/17.
 */
public class AlarmReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Your Time is up!!!!!", Toast.LENGTH_LONG).show();
    }
}
