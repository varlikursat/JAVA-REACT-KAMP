package com.company;

public class User {

    private int _userId;
    private String _userName;
    private String _userLastName;
    private String _userImage;

    public User(int userId , String userName, String userLastName){

        this._userId = userId ;
        this._userName = userName ;
        this._userLastName = userLastName ;

    }



    public void setUserId(int userId){
        this._userId=userId;
    }

    public void set_userName(String userName){
        this._userName=userName;
    }

    public void set_userLastName(String lastName){
        this._userLastName=lastName;
    }

    public int get_userId() {
        return _userId;
    }

    public String get_userName() {
        return _userName;
    }

    public String get_userLastName() {
        return _userLastName;
    }

    public void set_userImage(String _userImage) {
        this._userImage = _userImage;
    }

    public String get_userImage() {
        return _userImage;
    }
}
