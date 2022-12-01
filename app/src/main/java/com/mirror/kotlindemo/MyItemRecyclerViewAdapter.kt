package com.mirror.kotlindemo

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

import com.mirror.kotlindemo.placeholder.PlaceholderContent.PlaceholderItem
import com.mirror.kotlindemo.databinding.FragmentItemBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
    private val values: List<DataItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.nameView.text= item.name

        if(null != item.editText1){
            holder.editTextView1.hint = item.editText1;
        }else{
            holder.editTextView1.visibility = View.GONE;
        }

        if(null != item.editText2){
            holder.editTextView2.hint = item.editText2;
        }else{
            holder.editTextView2.visibility = View.GONE;
        }

        if(null != item.editText3){
            holder.editTextView3.hint = item.editText3;
        }else{
            holder.editTextView3.visibility = View.GONE;
        }

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameView: TextView = binding.itemName
        val editTextView1:EditText = binding.editText1;
        val editTextView2:EditText = binding.editText2;
        val editTextView3:EditText = binding.editText3;
        val resultView: TextView = binding.resultView;
        val confirmButton : TextView = binding.confirm;


        override fun toString(): String {
            return super.toString() + " '"
        }
    }

}