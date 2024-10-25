package com.asyifafahra.utsmobile.model

import com.asyifafahra.utsmobile.R

data class ModelFavorites(
    val gambarMakanan : Int,
    val namaMakanan : String,
    val detailMakanan : String
)

object FavoritesList {
    fun getModel() : List<ModelFavorites> {
        val item1 = ModelFavorites(
            R.drawable.makanan,
            "Mexican Appetizer Cups",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item2 = ModelFavorites(
            R.drawable.makan2,
            "Healthy Food",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item3 = ModelFavorites(
            R.drawable.makan5,
            "Mini Taco Bowls",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item4 = ModelFavorites(
            R.drawable.img2,
            "Bibimpap",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item5 = ModelFavorites(
            R.drawable.img1,
            "Asian Food",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemList : ArrayList<ModelFavorites> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)

        return itemList
    }
}