package com.samples.os.activitymanager;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SystemInfoListActivity extends ListActivity {

    private String[] items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.simple_list_item_1);

        items = new String[] {
                getResources().getString(R.string.itemDeviceConfigInfo),
                getResources().getString(R.string.itemMemoryInfo),
                getResources().getString(R.string.itemRunningAppProcesses),
                getResources().getString(R.string.itemRunningServices),
                getResources().getString(R.string.itemRunningTasks),
                getResources().getString(R.string.itemRecentTasks),
                getResources().getString(R.string.itemProcessesInErrorState)
        };

        setListAdapter(new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, items));

    }
    @Override
    protected void onListItemClick(
            ListView parent, View v, int position, long id) {

        String item = items[position];

        Intent intent = new Intent(getApplicationContext(),
                SystemInfoItemActivity.class);
        intent.setAction(item);

        startActivity(intent);

    }
}
