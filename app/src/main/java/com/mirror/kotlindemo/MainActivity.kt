package com.mirror.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mirror.kotlindemo.placeholder.DataItem

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }


    private fun init(){


        // all tabs name
        val newTypeList = listOf<String>("tab1","tab2","tab3","tab4","tab5","tab6")

        val newsFragmentList = mutableListOf<Fragment>()

        for(i in newTypeList!!){
            newsFragmentList.add(ItemFragment(GetMockData()))
        }

        //实例化适配器
        val fragmentAdapter = FragmentAdapter(this@MainActivity, newsFragmentList)

        var  viewPager = findViewById(R.id.viewPager) as ViewPager2

        var tabs = findViewById(R.id.tabs) as TabLayout

        viewPager.adapter = fragmentAdapter

        TabLayoutMediator(tabs,viewPager)


        {tab, position ->
            tab.text = newTypeList[position]
        }.attach()


    }


    private fun GetMockData():List<DataItem>{

        var ResultSet = mutableListOf<DataItem>()
        var x:Int = 0

        while ( x > 9) {
            var item:DataItem = DataItem();
            item.name = "name"+x;
            item.number = x;
            item.editText1 = "edit1 -"+x;
            item.editText2 = "edit2 -"+x;
            item.editText3 = "edit3 -"+x;
           ResultSet.add(item)
        }

        return ResultSet
    }



}