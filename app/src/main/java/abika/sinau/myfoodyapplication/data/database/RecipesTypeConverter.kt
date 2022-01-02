package abika.sinau.myfoodyapplication.data.database

import abika.sinau.myfoodyapplication.models.NewModel
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecipesTypeConverter {

    var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: NewModel): String {
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): NewModel {
        val listType = object : TypeToken<NewModel>() {}.type
        return gson.fromJson(data, listType)
    }

}