package abika.sinau.myfoodyapplication.util

import abika.sinau.myfoodyapplication.R
import android.app.Activity
import android.util.Log
import android.view.View
import androidx.annotation.IdRes
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * Created by Abika Chairul Yusri on 19/03/2021
 * Bismillahirrahmanirrahim
 */

fun <T> Fragment.getNavigationResult(key: String = "result") =
    findNavController().currentBackStackEntry?.savedStateHandle?.get<T>(key)

fun <T> Fragment.getNavigationResultLiveData(key: String = "result") =
    findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<T>(key)

fun <T> Fragment.setNavigationResult(result: T, key: String = "result") {
    findNavController().previousBackStackEntry?.savedStateHandle?.set(key, result)
}

inline fun <reified T : Fragment> newInstance(vararg params: Pair<String, Any>) =
    T::class.java.newInstance().apply {
        arguments = bundleOf(*params)
    }

/**
 * Navigate To [NavDirections] with null safety or crash issue, it also give Default Animation on
 * It's Navigation
 * @param direction is Direction to other page
 * @param clearTask will clear previous backStack when navigated, same functionality as [Activity.finish]
 */
fun NavController.navigateOrNull(direction: NavDirections?, clearTask: Boolean = false) {
    try {
        val options = NavOptions.Builder().apply {
            setEnterAnim(R.anim.nav_default_enter_anim)
            setExitAnim(R.anim.nav_default_exit_anim)
            setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            setPopExitAnim(R.anim.nav_default_pop_exit_anim)

            if (clearTask) {
                currentDestination?.id?.let { currentDest ->
                    setPopUpTo(currentDest, clearTask)
                }
            }
        }.build()

        direction?.let { navigate(it, options) }
    } catch (e: Exception) {
        Log.e("$e", "$e")
    }
}

val Fragment.navController get() = findNavController()

val View.navController get() = findNavController()

/**
 * @author Iga Noviyanti Rohman
 * @param key for key of data you save on saveState
 * @param value for storing value of key
 * @param clearLastFragment set true if you want to pass data to clear stack of previous fragment
 * @param fragmentDestination is not null if you set clearLastFragment is true
 */
fun <T> Fragment.setNavigationResult(
    key: String, value: T, clearLastFragment: Boolean = false, @IdRes fragmentDestination: Int? =
        null
) {
    if (clearLastFragment) {
        val navBackStackEntry =
            fragmentDestination?.let { findNavController().getBackStackEntry(it) }
        navBackStackEntry?.savedStateHandle?.set(
            key,
            value
        )
    } else {
        findNavController().previousBackStackEntry?.savedStateHandle?.set(
            key,
            value
        )
    }
}

fun <T> Fragment.getNavigationResult(@IdRes id: Int, key: String, onResult: (result: T) -> Unit) {
    val navBackStackEntry = findNavController().getBackStackEntry(id)

    val observer = LifecycleEventObserver { _, event ->
        if (event == Lifecycle.Event.ON_RESUME
            && navBackStackEntry.savedStateHandle.contains(key)
        ) {
            val result = navBackStackEntry.savedStateHandle.get<T>(key)
            result?.let(onResult)
            navBackStackEntry.savedStateHandle.remove<T>(key)
        }
    }
    navBackStackEntry.lifecycle.addObserver(observer)

    viewLifecycleOwner.lifecycle.addObserver(LifecycleEventObserver { _, event ->
        if (event == Lifecycle.Event.ON_DESTROY) {
            navBackStackEntry.lifecycle.removeObserver(observer)
        }
    })
}

//fun <T> Fragment.saveStateOfFragment(@IdRes id: Int, key: String, onResult: (result: T) -> Unit){
//    navController.currentBackStackEntry?.savedStateHandle?.get<T>()
//}