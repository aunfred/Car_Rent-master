package comsci.justfriend.car_rent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by HP on 30/4/2560.
 */

public class ListTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

    public ListTABLE(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }//Constructor
}
