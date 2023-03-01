package com.exb67.recylxor

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(
    var persons: List<Person>
): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
inner class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}