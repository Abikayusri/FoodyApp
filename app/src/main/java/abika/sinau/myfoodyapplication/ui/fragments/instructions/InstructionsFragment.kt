package abika.sinau.myfoodyapplication.ui.fragments.instructions

import abika.sinau.myfoodyapplication.R
import abika.sinau.myfoodyapplication.models.NewModel
import abika.sinau.myfoodyapplication.util.Constants.Companion.RECIPE_RESULT_KEY
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_instructions.view.*

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_instructions, container, false)

        val args = arguments
        val myBundle: NewModel.Result? = args?.getParcelable(RECIPE_RESULT_KEY)

        view.instructions_webView.webViewClient = object : WebViewClient() {}
        val websiteUrl: String = myBundle!!.sourceUrl.toString()
        view.instructions_webView.loadUrl(websiteUrl)

        return view
    }

}