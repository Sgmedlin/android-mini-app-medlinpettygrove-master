package edu.virginia.cs.cs4720.todolist;

import java.util.ArrayList;

// Class meant for storing all relevant data for each item in to-do list
// Contains getters and setters for each piece of data

public class BucketItem implements Comparable<BucketItem> {
    private String name;
    private String description;
    private float latitude;
    private float longitude;
    private boolean completed;
    private int dueDay;
    private int dueMonth;
    private int dueYear;

    private static int lastBucketItemCount = 0;

    // Empty constructor
    public BucketItem(){
        this.name = "";
        this.description = "";
        this.latitude = 0.0f;
        this.longitude = 0.0f;
        this.completed = false;
    }

    // Constructor with passed-in values
    public BucketItem(String name, String description, float latitude, float longitude, boolean completed, int day, int month, int year){
        this.name = name;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.completed = completed;
        this.dueDay = day;
        this.dueMonth = month;
        this.dueYear = year;
    }

    // Creates original, hard-coded Bucket List and returns it (specified in BucketItem section of requirements)
    public static ArrayList<BucketItem> createInitialBucketList(int numItems){
        ArrayList<BucketItem> itemList = new ArrayList<BucketItem>();

//        for (int i = 1; i <= numItems; i++) {
//            itemList.add(new BucketItem("To-do Item Number " + ++lastBucketItemCount, "Sample to-do list item.",
//                    0.0f, 0.0f, false, 1, 1, 2019));
//        }

//        itemList.add(new BucketItem());
        itemList.add(new BucketItem("Graduate!", "Walk the lawn.", 0.0f, 0.0f, false, 19, 5, 2019));
        itemList.add(new BucketItem("Finish Fall Semester", "One more to go!", 0.0f, 0.0f, false, 11, 12, 2018));

        return itemList;
    }

    // compareTo function in order to sort the ArrayList of BucketItems
    // The BucketItem with the earliest due date comes first
    public int compareTo(BucketItem other) {
        // If the years are the same, check month/day
        if ( other.dueYear == this.dueYear )
        {
            // If the months are the same, check day
            if ( other.dueMonth == this.dueMonth )
            {
                if ( other.dueDay == this.dueDay ) { return 0; } // The dates are the same
                else if ( other.dueDay > this.dueDay ) { return -1; } // this BucketItem comes first
                else { return 1; } // other BucketItem comes first
            }
            else if ( other.dueMonth > this.dueMonth ) { return -1; } // this BucketItem comes first
            else { return 1; } // other BucketItem comes first
        }
        else if ( other.dueYear > this.dueYear ) { return -1; } // this BucketItem comes first
        else { return 1; } // other BucketItem comes first
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public float getLatitude(){
        return latitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public int getDueDay() { return dueDay; }

    public int getDueMonth() { return dueMonth; }

    public int getDueYear() { return dueMonth; }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setLatitude(float latitude){
        this.latitude = latitude;
    }

    public void setLongitude(float longitude){
        this.longitude = longitude;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public void setDueDay(int day) { this.dueDay = day; }

    public void setDueMonth(int month) { this.dueMonth = month; }

    public void setDueYear(int year) { this.dueYear = year; }

}
