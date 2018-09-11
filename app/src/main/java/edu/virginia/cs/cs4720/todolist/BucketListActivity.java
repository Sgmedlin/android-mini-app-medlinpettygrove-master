package edu.virginia.cs.cs4720.todolist;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class BucketListActivity extends AppCompatActivity {

    public ArrayList<BucketItem> itemList;
    public EditText itemField;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        rvItems = (RecyclerView) findViewById(R.id.rvItems);

        // Initialize number of items in pre-populated list
        itemList = BucketItem.createInitialBucketList(50);
        Collections.sort(itemList);

        BucketListAdapter adapter = new BucketListAdapter(this, itemList);
        rvItems.setAdapter(adapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
    }

    //Called when the Add Item button is pressed
    public void addItem(View view){
        // Will send an intent to the Add Item Activity
        // startActivityForResult(Intent )
    }

    public void editItem(View view){
        // Will send an intent to the Edit Item Activity
        //

    }

    public void onCheckboxClicked(View view){
        //BucketListAdapter adapter = new BucketListAdapter(this, itemList);


    }


}





