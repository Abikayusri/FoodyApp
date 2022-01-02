package abika.sinau.myfoodyapplication.data.database

import abika.sinau.myfoodyapplication.models.NewModel
import abika.sinau.myfoodyapplication.util.Constants.Companion.RECIPES_TABLE
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: NewModel
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}