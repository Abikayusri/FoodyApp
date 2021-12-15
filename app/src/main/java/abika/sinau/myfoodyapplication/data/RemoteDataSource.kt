package abika.sinau.myfoodyapplication.data

import abika.sinau.myfoodyapplication.data.network.FoodRecipesApi
import abika.sinau.myfoodyapplication.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject


class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }
}