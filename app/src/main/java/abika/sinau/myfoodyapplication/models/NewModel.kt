package abika.sinau.myfoodyapplication.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class NewModel(
    @SerializedName("results")
    val results: List<Result?>? = null
) : Parcelable {
    @Parcelize
    data class Result(
        @SerializedName("aggregateLikes")
        val aggregateLikes: Int? = null,
        @SerializedName("analyzedInstructions")
        val analyzedInstructions: List<AnalyzedInstruction?>? = null,
        @SerializedName("cheap")
        val cheap: Boolean? = null,
        @SerializedName("cookingMinutes")
        val cookingMinutes: Int? = null,
        @SerializedName("creditsText")
        val creditsText: String? = null,
        @SerializedName("cuisines")
        val cuisines: List<String?>? = null,
        @SerializedName("dairyFree")
        val dairyFree: Boolean? = null,
        @SerializedName("diets")
        val diets: List<String?>? = null,
        @SerializedName("dishTypes")
        val dishTypes: List<String?>? = null,
        @SerializedName("extendedIngredients")
        val extendedIngredients: List<ExtendedIngredient?>? = null,
        @SerializedName("gaps")
        val gaps: String? = null,
        @SerializedName("glutenFree")
        val glutenFree: Boolean? = null,
        @SerializedName("healthScore")
        val healthScore: Double? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("image")
        val image: String? = null,
        @SerializedName("imageType")
        val imageType: String? = null,
        @SerializedName("license")
        val license: String? = null,
        @SerializedName("likes")
        val likes: Int? = null,
        @SerializedName("lowFodmap")
        val lowFodmap: Boolean? = null,
        @SerializedName("missedIngredientCount")
        val missedIngredientCount: Int? = null,
        @SerializedName("missedIngredients")
        val missedIngredients: List<MissedIngredient?>? = null,
        @SerializedName("occasions")
        val occasions: List<String?>? = null,
        @SerializedName("preparationMinutes")
        val preparationMinutes: Int? = null,
        @SerializedName("pricePerServing")
        val pricePerServing: Double? = null,
        @SerializedName("readyInMinutes")
        val readyInMinutes: Int? = null,
        @SerializedName("servings")
        val servings: Int? = null,
        @SerializedName("sourceName")
        val sourceName: String? = null,
        @SerializedName("sourceUrl")
        val sourceUrl: String? = null,
        @SerializedName("spoonacularScore")
        val spoonacularScore: Double? = null,
        @SerializedName("spoonacularSourceUrl")
        val spoonacularSourceUrl: String? = null,
        @SerializedName("summary")
        val summary: String? = null,
        @SerializedName("sustainable")
        val sustainable: Boolean? = null,
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("unusedIngredients")
        val unusedIngredients: @RawValue List<Any?>? = null,
        @SerializedName("usedIngredientCount")
        val usedIngredientCount: Int? = null,
        @SerializedName("usedIngredients")
        val usedIngredients: @RawValue List<Any?>? = null,
        @SerializedName("vegan")
        val vegan: Boolean? = null,
        @SerializedName("vegetarian")
        val vegetarian: Boolean? = null,
        @SerializedName("veryHealthy")
        val veryHealthy: Boolean? = null,
        @SerializedName("veryPopular")
        val veryPopular: Boolean? = null,
        @SerializedName("weightWatcherSmartPoints")
        val weightWatcherSmartPoints: Int? = null
    ) : Parcelable {
        @Parcelize
        data class AnalyzedInstruction(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("steps")
            val steps: List<Step?>? = null
        ) : Parcelable {
            @Parcelize
            data class Step(
                @SerializedName("equipment")
                val equipment: List<Equipment?>? = null,
                @SerializedName("ingredients")
                val ingredients: List<Ingredient?>? = null,
                @SerializedName("length")
                val length: Length? = null,
                @SerializedName("number")
                val number: Int? = null,
                @SerializedName("step")
                val step: String? = null
            ) : Parcelable {
                @Parcelize
                data class Equipment(
                    @SerializedName("id")
                    val id: Int? = null,
                    @SerializedName("image")
                    val image: String? = null,
                    @SerializedName("localizedName")
                    val localizedName: String? = null,
                    @SerializedName("name")
                    val name: String? = null,
                    @SerializedName("temperature")
                    val temperature: Temperature? = null
                ) : Parcelable {
                    @Parcelize
                    data class Temperature(
                        @SerializedName("number")
                        val number: Double? = null,
                        @SerializedName("unit")
                        val unit: String? = null
                    ) : Parcelable
                }

                @Parcelize
                data class Ingredient(
                    @SerializedName("id")
                    val id: Int? = null,
                    @SerializedName("image")
                    val image: String? = null,
                    @SerializedName("localizedName")
                    val localizedName: String? = null,
                    @SerializedName("name")
                    val name: String? = null
                ) : Parcelable

                @Parcelize
                data class Length(
                    @SerializedName("number")
                    val number: Int? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                ) : Parcelable
            }
        }

        @Parcelize
        data class ExtendedIngredient(
            @SerializedName("aisle")
            val aisle: String? = null,
            @SerializedName("amount")
            val amount: Double? = null,
            @SerializedName("consistency")
            val consistency: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("image")
            val image: String? = null,
            @SerializedName("measures")
            val measures: Measures? = null,
            @SerializedName("meta")
            val meta: List<String?>? = null,
            @SerializedName("metaInformation")
            val metaInformation: List<String?>? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("nameClean")
            val nameClean: String? = null,
            @SerializedName("original")
            val original: String? = null,
            @SerializedName("originalName")
            val originalName: String? = null,
            @SerializedName("originalString")
            val originalString: String? = null,
            @SerializedName("unit")
            val unit: String? = null
        ) : Parcelable {
            @Parcelize
            data class Measures(
                @SerializedName("metric")
                val metric: Metric? = null,
                @SerializedName("us")
                val us: Us? = null
            ) : Parcelable {
                @Parcelize
                data class Metric(
                    @SerializedName("amount")
                    val amount: Double? = null,
                    @SerializedName("unitLong")
                    val unitLong: String? = null,
                    @SerializedName("unitShort")
                    val unitShort: String? = null
                ) : Parcelable

                @Parcelize
                data class Us(
                    @SerializedName("amount")
                    val amount: Double? = null,
                    @SerializedName("unitLong")
                    val unitLong: String? = null,
                    @SerializedName("unitShort")
                    val unitShort: String? = null
                ) : Parcelable
            }
        }

        @Parcelize
        data class MissedIngredient(
            @SerializedName("aisle")
            val aisle: String? = null,
            @SerializedName("amount")
            val amount: Double? = null,
            @SerializedName("extendedName")
            val extendedName: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("image")
            val image: String? = null,
            @SerializedName("meta")
            val meta: List<String?>? = null,
            @SerializedName("metaInformation")
            val metaInformation: List<String?>? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("original")
            val original: String? = null,
            @SerializedName("originalName")
            val originalName: String? = null,
            @SerializedName("originalString")
            val originalString: String? = null,
            @SerializedName("unit")
            val unit: String? = null,
            @SerializedName("unitLong")
            val unitLong: String? = null,
            @SerializedName("unitShort")
            val unitShort: String? = null
        ) : Parcelable
    }
}