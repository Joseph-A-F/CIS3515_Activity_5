package edu.temple.inclassuiacvitivity

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlin.coroutines.CoroutineContext

class TextSizeAdapter(private val items: Array<String>,private val context: Context) : BaseAdapter() {

    override fun getCount(): Int = items.size
    override fun getItem(position: Int)= items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return TextView(context).apply {
            text = items[position];
            setTextSize(TypedValue.COMPLEX_UNIT_SP,items[position].toFloat());
        }
    }

}