package com.samples.os.activitymanager;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by use on 05.07.17.
 */
public class SystemInfoItemActivity extends Activity {
    private TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        text = (TextView)findViewById(R.id.text);
        String action = this.getIntent().getAction();
        this.setTitle(action);
        ActivityManager manager =
                (ActivityManager)getSystemService(ACTIVITY_SERVICE);
        if (action.equals(
                getResources().getString(R.string.itemDeviceConfigInfo))) {
                // Информация о конфигурации устройства
        }
        else if (action.equals(
                getResources().getString(R.string.itemMemoryInfo))) {
                // Информация о памяти
        }
        else if (action.equals(
                getResources().getString(R.string.itemRunningAppProcesses))) {
                // Информация о выполняющихся процессах
        }
        else if (action.equals(
                getResources().getString(R.string.itemRunningServices))) {
                // Информация о выполняющихся службах
        }
        else if (action.equals(
                getResources().getString(R.string.itemRunningTasks))) {
                // Информация о выполняющихся заданиях
        }
        else if (action.equals(
                getResources().getString(R.string.itemRecentTasks))) {
                // Информация о последних выполненных заданиях
        }
        else if (action.equals(
                getResources().getString(R.string.itemProcessesInErrorState))) {
                // Информация о процессах в состоянии ошибки
        }
    }
}
