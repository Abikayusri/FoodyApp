package abika.sinau.myfoodyapplication.data

import abika.sinau.myfoodyapplication.data.network.FoodRecipesApi
import abika.sinau.myfoodyapplication.models.NewModel
import retrofit2.Response
import javax.inject.Inject


class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<NewModel> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<NewModel> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }
}