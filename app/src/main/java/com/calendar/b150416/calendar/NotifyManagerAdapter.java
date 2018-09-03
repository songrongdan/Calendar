package com.calendar.b150416.calendar;

import android.util.Log;

public class NotifyManagerAdapter implements NotifyManager {
    public void notifyEvent(int id,Event e){
        Log.d("NofifyManagerAdapter",String.format("Notify Event ,id=%d,deccription=%s",id,e.description));
    }
}
