package abika.sinau.myfoodyapplication.models

import abika.sinau.myfoodyapplication.models.Result
import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)