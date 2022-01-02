package abika.sinau.myfoodyapplication.util

import abika.sinau.myfoodyapplication.models.NewModel
import androidx.recyclerview.widget.DiffUtil

class RecipesDiffUtil(
    private val oldList: List<NewModel.Result?>?,
    private val newList: List<NewModel.Result?>?
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList?.size!!
    }

    override fun getNewListSize(): Int {
        return newList?.size!!
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList?.get(oldItemPosition) === newList?.get(newItemPosition)
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList?.get(oldItemPosition) == newList?.get(newItemPosition)
    }
}