package edu.virginia.cs.cs4720.todolist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.CheckBox;

import java.util.List;

public class  BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemTextView;
        public CheckBox itemCheckBox;

        public ViewHolder(View itemView) {


            super(itemView);

            itemTextView = (TextView) itemView.findViewById(R.id.todo_list_item);
            itemCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox_todo);

        }




    }

    // CODE AND COMMENTS FROM SHERRIFF EXAMPLE

    // Store a member variable for the contacts
    private List<BucketItem> itemList;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public BucketListAdapter(Context context, List<BucketItem> items) {
        itemList = items;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public BucketListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout (INFLATE ITEM NAME)
        View itemView = inflater.inflate(R.layout.item_bucket, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(BucketListAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        BucketItem item = itemList.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.itemTextView;
        textView.setText(item.getName());

        CheckBox checkBox = viewHolder.itemCheckBox;
        checkBox.setSelected(item.isCompleted());

//        if (checkBox.isChecked()){
//            item.setCompleted(!item.isCompleted());
//            textView.setTextColor(R.color.colorPrimary);
//        }

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
