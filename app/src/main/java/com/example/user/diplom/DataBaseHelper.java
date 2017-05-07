package com.example.user.diplom;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataBaseHelper extends SQLiteOpenHelper {

    // путь к базе данных вашего приложения
   public static String DB_PATH = "/data/data/BD/databases/";
<<<<<<< HEAD
   public static String DB_NAME = "bD6";
=======
   public static String DB_NAME = "bD5";
>>>>>>> origin/master
   public static String TABLE_CONTACTS = "contacts2";
   public static String TABLE_FOOD = "food";
   public static String TABLE_DIET = "diet";
   public static String TABLE_PRODUCTS = "products";


   public SQLiteDatabase myDataBase;
   public final Context mContext;
   public   static final int DB_VERSION=1;

    //Тестовая База
   public   static final String KEY_ID = "_id";
   public   static final String KEY_NAME = "name";
   public   static final String KEY_MAIL = "mail";

    //Переменные для базы данных блюд
   public   static final String FOOD_ID = "_id";
   public   static final String FOOD_NAME = "name";
   public   static final String FOOD_TEXT = "text";
   public   static final String FOOD_OPS = "ops";


    //Переменные для базы данных рационов
   public static final String DIET_ID = "_id";
   public static final String DIET_NAME = "name";
   public static final String DIET_TYPE = "type";
   public static final String DIET_DAYLYNORM = "dayops";
   public static final String DIET_FOODB1 = "food1";
   public static final String DIET_FOODB2 = "food2";
   public static final String DIET_FOODB3 = "food3";
   public static final String DIET_FOODD1 = "food4";
   public static final String DIET_FOODD2 = "food5";
   public static final String DIET_FOODD3 = "food6";
   public static final String DIET_FOODS1 = "food7";
   public static final String DIET_FOODS2 = "food8";
   public static final String DIET_FOODS3 = "food9";


//Заполнение базы данный блюд
        int[] STARTFOOD_ID = {1,2,3,4,5,6,7,8,9,10,11};
     String[] STARTFOOD_NAME ={"Котлета по-киевски","Ризото","СКОРО","СКОРО","НЕ СКОРО","666","7","8","9","10","11"};
     String[] STARTFOOD_TEXT = {"Котлета по-киевски — разновидность котлеты, представляющая собою отбитое куриное филе, в которое завёрнут кусочек холодного сливочного масла."
             ,"Я не знаю описания данного продукта но мне нужно протестировать максимальную длину текста и то как он будет выглядить с вертикальным листанием.Могу попробывать написать еще что то но в голову ничего не приходит. Потому я просто буду спамить одной буквой ёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёёё"
             ,"СКОРО","СКОРО","НЕ СКОРО","6","7","8","9","10","11"};
<<<<<<< HEAD
        int[] STARTFOOD_OPS = {291,168,0,0,0,0,0,0,0,0,0};
=======
        int[] STARTFOOD_OPS = {291,0,0,0,0,0,0,0,0,0,0};
>>>>>>> origin/master


    //Заполнение базы данных рационов
    int[] STARTDIET_ID = {1,2};
    String[] STARTDIET_NAME={"STANDART","TEST"};
    int[] STARTDIET_TYPE = {1,2};//1 - поддержание веса, 2 - сброс веса, 3 - набор веса
    int[] STARTDIET_DAYLYNORM = {600,800};
    int[] STARTDIET_FOODB1 = {1,0};
    int[] STARTDIET_FOODB2 = {0,2};
<<<<<<< HEAD
    int[] STARTDIET_FOODB3 = {3,0};
=======
<<<<<<< HEAD
    int[] STARTDIET_FOODB3 = {3,0};
=======
    int[] STARTDIET_FOODB3 = {0,0};
>>>>>>> origin/master
>>>>>>> origin/master
    int[] STARTDIET_FOODD1 = {2,0};
    int[] STARTDIET_FOODD2 = {0,1};
    int[] STARTDIET_FOODD3 = {0,0};
    int[] STARTDIET_FOODS1 = {0,0};
<<<<<<< HEAD
    int[] STARTDIET_FOODS2 = {2,0};
=======
<<<<<<< HEAD
    int[] STARTDIET_FOODS2 = {2,0};
=======
    int[] STARTDIET_FOODS2 = {0,0};
>>>>>>> origin/master
>>>>>>> origin/master
    int[] STARTDIET_FOODS3 = {1,2};

    /**
     * Конструктор
     * Принимает и сохраняет ссылку на переданный контекст для доступа к ресурсам приложения
     * @param context
     */
    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.mContext = context;
    }

  /*  *//**
     * Создает пустую базу данных и перезаписывает ее нашей собственной базой
     * *//*
    public void createDataBase() throws IOException {
        boolean dbExist = checkDataBase();

        if(dbExist){
            //ничего не делать - база уже есть
        }else{
            //вызывая этот метод создаем пустую базу, позже она будет перезаписана
            this.getReadableDatabase();

            try {
                copyDataBase();
            } catch (IOException e) {
                throw new Error("Error copying database");
            }
        }
    }
*/
 /*   *//**
     * Проверяет, существует ли уже эта база, чтобы не копировать каждый раз при запуске приложения
     * @return true если существует, false если не существует
     *//*
    private boolean checkDataBase(){
        SQLiteDatabase checkDB = null;

        try{
            String myPath = DB_PATH + DB_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
            //база еще не существует
        }
        if(checkDB != null){
            checkDB.close();
        }
        return checkDB != null ? true : false; //Если ЧекДб не пустой то возвращает тру, элс фолс
    }
*/
    /**
     * Копирует базу из папки assets заместо созданной локальной БД
     * Выполняется путем копирования потока байтов.
     * */
  /*  private void copyDataBase() throws IOException{
        //Открываем локальную БД как входящий поток
        InputStream myInput = mContext.getAssets().open(DB_NAME);

        //Путь ко вновь созданной БД
        String outFileName = DB_PATH + DB_NAME;

        //Открываем пустую базу данных как исходящий поток
        OutputStream myOutput = new FileOutputStream(outFileName);

        //перемещаем байты из входящего файла в исходящий
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer))>0){
            myOutput.write(buffer, 0, length);
        }

        //закрываем потоки
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }*/

 /*   public void openDataBase() throws SQLException {
        //открываем БД
        String myPath = DB_PATH + DB_NAME;
        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    @Override
    public synchronized void close() {
        if(myDataBase != null)
            myDataBase.close();
        super.close();
    }
*/
    @Override
    public void onCreate(SQLiteDatabase db) {

        ContentValues contentValues = new ContentValues();

        //Тестовая база
        db.execSQL("CREATE TABLE " + TABLE_CONTACTS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_MAIL + " TEXT" + ");");

        //База данных блюд
        db.execSQL("create table " + TABLE_FOOD + "(" + FOOD_ID + " integer primary key," + FOOD_NAME + " text," + FOOD_TEXT + " text," + FOOD_OPS + " integer" + ");");

        //База данных рационов
        db.execSQL("create table " + TABLE_DIET + "(" + DIET_ID + " integer primary key," + DIET_NAME + " text," + DIET_DAYLYNORM + " integer," + DIET_TYPE + " integer," + DIET_FOODB1 + " integer," + DIET_FOODB2 + " integer," + DIET_FOODB3 + " integer," + DIET_FOODD1 + " integer," + DIET_FOODD2 + " integer," + DIET_FOODD3 + " integer," + DIET_FOODS1 + " integer," + DIET_FOODS2 + " integer," + DIET_FOODS3 + " integer" + ");");

        //Заполнение базы данных блюд

        for (int i = 0; i < STARTFOOD_ID.length; i++ ){
            Log.d(FOOD_ID,"You are suck");
            contentValues.clear();
            contentValues.put(FOOD_ID,STARTFOOD_ID[i]);
            contentValues.put(FOOD_NAME,STARTFOOD_NAME[i]);
            contentValues.put(FOOD_TEXT,STARTFOOD_TEXT[i]);
            contentValues.put(FOOD_OPS,STARTFOOD_OPS[i]);
            db.insert(TABLE_FOOD, null, contentValues);
        }
        for (int i = 0; i < STARTDIET_ID.length; i++ ){
            Log.d(DIET_ID,"You are suck");
            contentValues.clear();
            contentValues.put(DIET_ID,STARTDIET_ID[i]);
            contentValues.put(DIET_NAME,STARTDIET_NAME[i]);
            contentValues.put(DIET_DAYLYNORM,STARTDIET_DAYLYNORM[i]);
            contentValues.put(DIET_TYPE,STARTDIET_TYPE[i]);
            contentValues.put(DIET_FOODB1,STARTDIET_FOODB1[i]);
            contentValues.put(DIET_FOODB2,STARTDIET_FOODB2[i]);
            contentValues.put(DIET_FOODB3,STARTDIET_FOODB3[i]);
            contentValues.put(DIET_FOODD1,STARTDIET_FOODD1[i]);
            contentValues.put(DIET_FOODD2,STARTDIET_FOODD2[i]);
            contentValues.put(DIET_FOODD3,STARTDIET_FOODD3[i]);
            contentValues.put(DIET_FOODS1,STARTDIET_FOODS1[i]);
            contentValues.put(DIET_FOODS2,STARTDIET_FOODS2[i]);
            contentValues.put(DIET_FOODS3,STARTDIET_FOODS3[i]);
            db.insert(TABLE_DIET, null, contentValues);
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_CONTACTS);
        db.execSQL("drop table if exists " + TABLE_DIET);
        db.execSQL("drop table if exists " + TABLE_FOOD);

       onCreate(db);
    }

    // Здесь можно добавить вспомогательные методы для доступа и получения данных из БД
    // вы можете возвращать курсоры через "return myDataBase.query(....)", это облегчит их использование
    // в создании адаптеров для ваших view
}