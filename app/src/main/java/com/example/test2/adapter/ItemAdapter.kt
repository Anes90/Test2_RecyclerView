package com.example.test2.adapter



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.R
import com.example.test2.model.TestItemModel

class ItemAdapter(
    private val context: Context,
    private val dataset: List<TestItemModel>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textViewTitle: TextView = view.findViewById(R.id.item_title)
        val textViewCount: TextView = view.findViewById(R.id.item_count)
        val textViewDescription: TextView = view.findViewById(R.id.item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textViewTitle.text =  context.resources.getString(item.stringTitleResourceId)
        holder.textViewCount.text =  (position + 1).toString()
        holder.textViewDescription.text =  context.resources.getString(item.stringDescriptionResourceId)
    }

    override fun getItemCount() = dataset.size
}