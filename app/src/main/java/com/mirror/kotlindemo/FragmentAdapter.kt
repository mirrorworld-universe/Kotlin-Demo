package com.mirror.kotlindemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/*** @author Pu
 * @createTime 2022/12/1 10:31
 * @projectName KotlinDemo
 * @className
 * @description TODO
 */
class FragmentAdapter(fragment: FragmentActivity, val datas: List<Fragment>) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int {
        return datas.size
    }

    override fun createFragment(position: Int): Fragment {
        return datas[position]
    }



}