package comsci.justfriend.car_rent;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by HP on 29/4/2560.
 */

public class CarTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String Car_TaBle = "CarTABLE";
    public static final String COLUMN_ID_CAR = "id";
    public static final String COLUMN_Car = "Car";
    public static final String COLUMN_Pic = "pic";
    public static final String COLUMN_Price = "Price";


    public CarTABLE(Context context) {
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }//Constructor

    public long addNewUser(String strid, String strCar, String strpic, String strPrice) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_ID_CAR, strid);
        objContentValues.put(COLUMN_Car, strCar);
        objContentValues.put(COLUMN_Pic, strpic);
        objContentValues.put(COLUMN_Price, strPrice);
        return readSqLiteDatabase.insert(Car_TaBle, null, objContentValues);
    }//mainclass
}
