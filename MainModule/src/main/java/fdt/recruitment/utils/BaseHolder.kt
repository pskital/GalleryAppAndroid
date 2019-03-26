package fdt.recruitment.utils

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseHolder<in Model>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    internal abstract fun onBind(model: Model)

}