package vangthao.app.acitivitydemo.parceablesandbundles;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private int userId;
    private String username;
    private String email;
    private String address;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    public User(int userId, String username, String email, String address) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public User() {
    }

    protected User(Parcel in) {
        userId = in.readInt();
        username = in.readString();
        email = in.readString();
        address = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userId);
        dest.writeString(username);
        dest.writeString(email);
        dest.writeString(address);
    }
}
