package com.example.user.diplom;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataBaseHelper extends SQLiteOpenHelper {

    // путь к базе данных вашего приложения
   public static String DB_PATH = "/data/data/BD/databases/";
   public static String DB_NAME = "bD992";
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
   public static final String DIET_NAME = "DIET_NAME";
   public static final String DIET_TYPE = "type";
   public static final String DIET_DAYLYNORM = "dayops";
   public static final String DIET_SELECTED = "DIET_SELECTED";
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
        int[] STARTFOOD_ID = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
     String[] STARTFOOD_NAME ={
    /*1*/         "Картофель, тушённый с грибами 250г"
   /*2*/         ,"Сыр российский 40г"
   /*3*/         ,"Молочная манная каша 300г"
   /*4*/         ,"Треска жареная 75г"
   /*5*/         ,"Батон нарезной 100г"
   /*6*/         ,"Гречневая каша 150г"
   /*7*/         ,"Сметана 50 г "
   /*8*/         ,"Булочка 70г"
   /*9*/         ,"Блины 250г"
   /*10*/         ,"Салат из сырых овощей 100г"
   /*11*/         ,"Борщ 500г"
 /*12*/    ,"Плов с тушеным мясом 270г"
 /*13*/    ,"Макароны 200г"
 /*14*/    ,"Яйцо варёное 1шт"
 /*15*/    ,"Курица отворная 75г"
 /*16*/    ,"Котлеты жареные 200г"
 /*17*/    ,"Сосиски, сардельки 100г"
 /*18*/    ,"Овощной бульон 500г"
 /*19*/    ,"Суп вермишеливый куриный 500г"
 /*20*/    ,"Яблочный сок 200г"
 /*21*/    ,"Кофе с молоком 200г"
 /*22*/    ,"Яблоко 100г"
 /*23*/    ,"Пелмени 250г"
 /*24*/    ,"Творог 150г"
 /*25*/    ,"Омлет 90г"};
     String[] STARTFOOD_TEXT = {
    /*1*/           "Хорошо промытые грибы (можно взять любые сухие грибы) залить водой на 2-а часа, затем мелко нарезать. Лук очистить и мелко нарезать. Картофель очистить и нарезать.Смешать лук, картофель, грибы, положить в кастрюлю. Добавить 0.5 стакана воды, масло и тушить под крышкой на слабом огне пока картофель не станет мягким (при необходимости добавить еще воды).Сметану смешать с мукой, добавить соль, перец. Разбавить сметану 1 ст. ложкой воды, тщательно перемешать, заправить полученным соусом тушённые овощи и тушить ещё 5-10 минут.Готовое блюдо посыпать свежей зеленью."
   /*2*/            ,"-"
   /*3*/            ,"-"
   /*4*/            ,"-"
   /*5*/            ,"-"
   /*6*/            ,"Гречка отварная без соли и масла"
   /*7*/            ,"-"
   /*8*/            ,"-"
   /*9*/            ,"В небольшом количестве воды или молока растворяют соль, сахар, добавляют предварительно разведенные дрожжи, смесь процеживают, соединяют состальной водой, подогретой до температуры 35-40° С, добавляют муку, яйца и перемешивают до образования однородной массы, затем вводят растопленный жир и снова перемешивают до образования однородной массы. Замешанное тесто оставляют в теплом месте (25-35° С) на 3-4 ч. В процессе брожения тесто перемешивают (обминают).Блины выпекают с обеих сторон на нагретых чугунных сковородах, смазанных жиром; толщина блинов должна быть не менее 3 мм.Отпускают по 3 шт. на порцию."
   /*10*/           ,"-"
   /*11*/           ,"В кипящий бульон или воду закладывают нашинкованную капусту и варят 0-15 мин. Затем кладут тушеную свеклу (с. 61), пассерованные овощи и варят до готовности. За 5-10 мин до окончания варки добавляют соль, сахар, специи. При использовании квашеной капусты ее в тушеном виде вводят в борщ вместе со свеклой. Борщ можно заправить пассерованной мукой, разведенной бульоном или водой (10 г на 1000 г борща)."
 /*12*/    ,"1. В разогретое масло засыпать специи, немного обжарить \n" +
             "2. Мясо слегка обжарить на растительном масле \n" +
             "3. Лук, морковь нарезать соломкой, добавить к мясу, слегка обжарить \n" +
             "4. Рис промыть на 3-4 раза, немного обсушить полотенцем, добавить к мясу, и прогреть минут 5, до прозрачности. \n" +
             "5. На этом этапе солим, заливаем КИПЯТКОМ, и накрываем крышкой \n" +
             "6. Минут через 20 втыкаем в плов дольки чеснока \n" +
             "7. Ещё через 10 минут плов готов."
 /*13*/    ,"-"
 /*14*/    ,"-"
 /*15*/    ,"-"
 /*16*/    ,"Калорийность - 177 кКал; белки - 16 г; жиры - 11 г; углеводы - 2 г на 100 грамм.\n" +
             "Ингредиенты\n" +
             "Баранина (Жарка котлеты)\t251 г\n" +
             "Лук репчатый (Жарка)\t70 г\n" +
             "Яйцо куриное (Жарка яичница)\t25 г\n" +
             "Соль поваренная пищевая\t5 г\n" +
             "Отруби пшеничные\t10 г\n" +
             "Общая масса ингредиентов \t 361 г\n" +
             "Масса готового блюда\t 271 г\n" +
             "Время приготовления: 30 мин\n" +
             "Описание\n" +
             "баранину порубить (мясорубкой, блендером) в фарш, \n" +
             "лук мелко порезать или пропустить через мясорубку, \n" +
             "вбить яйцо, \n" +
             "соль, перец по вкусу, \n" +
             "сформовать котлеты, запанировать в отрубях, жарить на сухой сковороде или в мультиварке по 7 мин с каждой стороны. \n" +
             "приятного аппетита!"
 /*17*/    ,"-"
 /*18*/    ,"вода - 3 л;\n" +
             "морковь - 2 шт;\n" +
             "лук репчатый - 1 большая или 2 средних луковицы;\n" +
             "стебель сельдерея - 2 шт;\n" +
             "стебли петрушки и/или укропа;\n" +
             "чеснок - 4 зубчика;\n" +
             "черный перец горошком - 5-7 горошин;\n" +
             "лавровый лист - 1-2 шт;\n" +
             "соль. "
 /*19*/    ,"Ингредиенты\n" +
             "Куриная грудка (филе) (Варка)\t330 г\n" +
             "Курица, бройлеры или цыплята, грудка, только мясо, сырое\t325 г\n" +
             "Вода Ордана\t2750 г\n" +
             "Морковь, красная (Варка без слива)\t163 г\n" +
             "Лук репчатый (Варка без слива)\t188 г\n" +
             "Картофель (Варка без слива)\t428 г\n" +
             "Петрушка (Варка без слива)\t49 г\n" +
             "Укроп (Варка без слива)\t48 г\n" +
             "Масло подсолнечное\t15 г\n" +
             "Соль морская натуральная с ламинарией Salute di Mare\t25 г\n" +
             "Сельдерей (Варка без слива)\t1 г\n" +
             "Макароны из муки в/с\t110 г\n" +
             "Общая масса ингредиентов\t 4432 г\n" +
             "Масса готового блюда\t 3540 г\n" +
             "Время приготовления: 1 ч\n" +
             "\n" +
             "Порезать курицу (филе) на кусочки 1,5-2 см и поставить вариться бульон. \n" +
             "Через 15-20 минут посолить и добавить сушеных листьев сельдерея. \n" +
             "Почистить, картошку, морковку и лук, порезать и потереть, как вам больше нравится. \n" +
             "Порезать зелень - и листья, и хвостики. \n" +
             "Когда курица практически сварилась, положить в бульон картошку и порезанные хвостики зелени. \n" +
             "На подсолнечном масле спассеровать морковку и лук. \n" +
             "Когда картошка будет готова, добавить вермишель и пассерованные овощи, дать покипеть 3 минуты, досолить, если нужно. \n" +
             "Добавить порезанную зелень (можно сразу в тарелку) и выключить. \n" +
             "Приятного аппетита!! "
 /*20*/    ,"-"
 /*21*/    ,"-"
 /*22*/    ,"-"
 /*23*/    ,"-"
 /*24*/    ,"30% жирности"
 /*25*/  ,"-"};
    int[] STARTFOOD_OPS = {427,148,273,173,393,101,145,250,520,74,280,438,325,63,166,480,277,186,156,84,137,46,547,294,117};


    //Заполнение базы данных рационов
    int[] STARTDIET_ID = {1};
    String[] STARTDIET_NAME={"Четверг"};
    int[] STARTDIET_TYPE = {3};//1 - поддержание веса, 2 - сброс веса, 3 - набор веса
    int[] STARTDIET_DAYLYNORM = {1800};
    int[] STARTDIET_SELECTED = {0};
    int[] STARTDIET_FOODB1 = {21};
    int[] STARTDIET_FOODB2 = {8};
    int[] STARTDIET_FOODB3 = {3};
    int[] STARTDIET_FOODD1 = {5};
    int[] STARTDIET_FOODD2 = {7};
    int[] STARTDIET_FOODD3 = {11};
    int[] STARTDIET_FOODS1 = {1};
    int[] STARTDIET_FOODS2 = {5};
    int[] STARTDIET_FOODS3 = {16};

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
        db.execSQL("create table " + TABLE_DIET + "(" + DIET_ID + " integer primary key," + DIET_NAME + " text," + DIET_DAYLYNORM + " integer," + DIET_SELECTED + " integer," + DIET_TYPE + " integer," + DIET_FOODB1 + " integer," + DIET_FOODB2 + " integer," + DIET_FOODB3 + " integer," + DIET_FOODD1 + " integer," + DIET_FOODD2 + " integer," + DIET_FOODD3 + " integer," + DIET_FOODS1 + " integer," + DIET_FOODS2 + " integer," + DIET_FOODS3 + " integer" + ");");

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
            contentValues.put(DIET_SELECTED,STARTDIET_SELECTED[i]);
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

    public void update(String tableDiet, ContentValues barsikValues, String s, String strings) {
    }


    // Здесь можно добавить вспомогательные методы для доступа и получения данных из БД
    // вы можете возвращать курсоры через "return myDataBase.query(....)", это облегчит их использование
    // в создании адаптеров для ваших view
}