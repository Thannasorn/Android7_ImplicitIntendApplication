package com.thannasorn.implicitintendapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    static final String[] ACTIVITY_CHOICES = new String[] {
            "Call First Activity", "Call Second Activity", "Call Third Activity", "Exit Multiple Activity"
    };
    final String searchTerms = "superman";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ACTIVITY_CHOICES));

        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                switch (arg2){
                    case 0:
                        startActivity(new Intent(MainActivity.this,FirstActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,SecondActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,ThirdActivity.class));
                        break;
                    case 3: //exit
                        finish();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}