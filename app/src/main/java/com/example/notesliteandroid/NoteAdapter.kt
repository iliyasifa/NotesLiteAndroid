//package com.example.notesliteandroid
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.recyclerview.widget.RecyclerView
//
//class NoteAdapter(private val items: MutableList<String>) : RecyclerView.Adapter<NoteAdapter.VH>() {
//    inner class VH(val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root)
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
//        val b = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return VH(b)
//    }
//    override fun onBindViewHolder(holder: VH, position: Int) {
//        holder.binding.tvText.text = items[position]
//        holder.binding.root.setOnClickListener {
//            Toast.makeText(holder.binding.root.context, "Clicked: ${items[position]}", Toast.LENGTH_SHORT).show()
//        }
//    }
//    override fun getItemCount() = items.size
//    fun add(text: String) { items.add(0, text); notifyItemInserted(0) }
//}
