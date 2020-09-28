package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;



public class User implements Parcelable {
    private String Name;
    private String Age;
    private String Email;

    public User(String name, String age, String email) {
        this.Name = name;
        this.Age = age;
        this.Email = email;
    }

    protected User(Parcel in) {
        Name = in.readString();
        Age = in.readString();
        Email = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return this.Name;
    }

    public String getAge() {
        return this.Age;
    }

    public String getEmail() {
        return this.Email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Age);
        dest.writeString(Email);
    }
}
