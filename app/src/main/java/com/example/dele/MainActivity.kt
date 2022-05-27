package com.example.dele

import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.*
import androidx.recyclerview.widget.RecyclerView
import com.example.dele.recycle.Datasource
import com.example.dele.recycle.FlowerAdapter
import com.example.dele.test.Family
import kotlin.concurrent.thread


//@DelicateCoroutinesApi
class MainActivity : AppCompatActivity() {

    private var msg : Message? = null
    private var s : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Thread.setDefaultUncaughtExceptionHandler()
//        val diffResult = DiffUtil.calculateDiff()
       /* msg.let {  }

        s.isNullOrEmpty()
        val client = OkHttpClient()
        val request: Request = Request.Builder()
            .url("url")
            .build()
        client.newCall(request).execute().use { response -> response.body }
        Looper.myLooper()
        val executorServiceOrNull = ThreadPoolExecutor(0, Int.MAX_VALUE, 60, TimeUnit.SECONDS,
            SynchronousQueue(), threadFactory("OkHttp Dispatcher", false))*/
        //testCoroutines()

        initFamilys() // 初始化家庭数据
//        val adapter = FamilyAdapter(this, R.layout.family_item, familyList)
//        val listView: ListView = findViewById<View>(R.id.list_view_demo) as ListView
//        listView.adapter = adapter

//        //android.R.layout.simple_list_item_1 作为ListView子项布局的id, 这是一个android内置的布局文件, 里面只有一个textview
//        //可用于简单的显示一段文本.
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView)findViewById(R.id.list_view_demo);
//        listView.setAdapter(adapter);

        // Retrieves data from datasource
        val flowerList = Datasource(this).getFlowerList()

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val adapter = FlowerAdapter(familyList)
        recyclerView.adapter = adapter
        findViewById<Button>(R.id.test).setOnClickListener {
            val index = familyList.size
            val list = addList()
            familyList.addAll(list)
            adapter.notifyItemRangeInserted(index-1,list.size)
        }
//        ImageView(this).setTag()
        thread {
            while (true){
                Log.d("wyx","s")
            }
        }
    }
    val familyList = mutableListOf<Family>()
    private fun initFamilys() {
        for (i in 0..20) {
            val family1 = Family("爸爸", R.mipmap.family_1, "13813813888")
            familyList.add(family1)
            val family2 = Family("妈妈", R.mipmap.family_2, "13813813888")
            familyList.add(family2)
            val family3 = Family("姐姐", R.mipmap.family_1, "13813813888")
            familyList.add(family3)
            val family4 = Family("三姑", R.mipmap.family_2, "13813813888")
            familyList.add(family4)
            val family5 = Family("妹妹", R.mipmap.family_1, "13813813888")
            familyList.add(family5)
            val family6 = Family("二姑", R.mipmap.family_1, "13813813888")
            familyList.add(family6)
            val family7 = Family("三姑", R.mipmap.family_2, "13813813888")
            familyList.add(family7)
            val family8 = Family("四舅", R.mipmap.family_1, "13813813888")
            familyList.add(family8)
            val family9 = Family("三姑", R.mipmap.family_2, "13813813888")
            familyList.add(family9)
            val family10 = Family("哥哥", R.mipmap.family_1, "13813813888")
            familyList.add(family10)
            val family11 = Family("嫂嫂", R.mipmap.family_1, "13813813888")
            familyList.add(family11)
            val family12 = Family("爷爷", R.mipmap.family_2, "13813813888")
            familyList.add(family12)
            val family13 = Family("奶奶", R.mipmap.family_1, "13813813888")
            familyList.add(family13)
            val family14 = Family("姥姥", R.mipmap.family_2, "13813813888")
            familyList.add(family14)
            val family15 = Family("姥爷", R.mipmap.family_1, "13813813888")
            familyList.add(family15)
        }
    }
    private fun addList() : List<Family> {
        val list = mutableListOf<Family>()
            val family1 = Family("爸爸", R.mipmap.family_1, "13813813888")
            list.add(family1)
            val family2 = Family("妈妈", R.mipmap.family_2, "13813813888")
            list.add(family2)
            val family3 = Family("姐姐", R.mipmap.family_1, "13813813888")
            list.add(family3)
            val family4 = Family("三姑", R.mipmap.family_2, "13813813888")
            list.add(family4)
            val family5 = Family("妹妹", R.mipmap.family_1, "13813813888")
            list.add(family5)
            val family6 = Family("二姑", R.mipmap.family_1, "13813813888")
            list.add(family6)
            val family7 = Family("三姑", R.mipmap.family_2, "13813813888")
            list.add(family7)
            val family8 = Family("四舅", R.mipmap.family_1, "13813813888")
            list.add(family8)
            val family9 = Family("三姑", R.mipmap.family_2, "13813813888")
            list.add(family9)
            val family10 = Family("哥哥", R.mipmap.family_1, "13813813888")
            list.add(family10)
            val family11 = Family("嫂嫂", R.mipmap.family_1, "13813813888")
            list.add(family11)
            val family12 = Family("爷爷", R.mipmap.family_2, "13813813888")
            list.add(family12)
            val family13 = Family("奶奶", R.mipmap.family_1, "13813813888")
            list.add(family13)
            val family14 = Family("姥姥", R.mipmap.family_2, "13813813888")
            list.add(family14)
            val family15 = Family("姥爷", R.mipmap.family_1, "13813813888")
            list.add(family15)
        return list
    }


    private fun testCoroutines() = runBlocking {
        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope { // Creates a coroutine scope
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope") // This line will be printed before the nested launch
        }

        println("Coroutine scope is over") // This line is not printed until the nested launch completes

    }
}