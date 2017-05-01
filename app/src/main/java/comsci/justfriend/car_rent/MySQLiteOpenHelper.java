package comsci.justfriend.car_rent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HP on 29/4/2560.
 */

public class MySQLiteOpenHelper  extends SQLiteOpenHelper {
//Explicit
    private static final String DATABASE_NAME = "Carroom.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE  = "create table userTABLE " +
     "(_id integer primary key, User text,Password text , Name text);";
    private static final String CREATE_CAR_TABLE  = "create table carTABLE " +
            "(_id integer primary key, Car text,Price text , Band text);";
    private static final String CREATE_LIST_TABLE  = "create table listTABLE " +
            "(_id integer primary key, Car text, Item text , Desk text);";





    public MySQLiteOpenHelper(Context context) {
        super(context , DATABASE_NAME ,null,DATABASE_VERSION);

    }//constructor


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
        sqLiteDatabase.execSQL(CREATE_CAR_TABLE);
        sqLiteDatabase.execSQL(CREATE_LIST_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//mainclass
