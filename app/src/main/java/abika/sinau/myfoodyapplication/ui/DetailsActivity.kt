package abika.sinau.myfoodyapplication.ui

import abika.sinau.myfoodyapplication.R
import abika.sinau.myfoodyapplication.adapters.PagerAdapter
import abika.sinau.myfoodyapplication.ui.fragments.ingredients.IngredientsFragment
import abika.sinau.myfoodyapplication.ui.fragments.instructions.InstructionsFragment
import abika.sinau.myfoodyapplication.ui.fragments.overview.OverviewFragment
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.navArgs
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_details.*

@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {

    private val args by navArgs<DetailsActivityArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val fragments = ArrayList<Fragment>()
        fragments.add(OverviewFragment())
        fragments.add(IngredientsFragment())
        fragments.add(InstructionsFragment())

        val titles = ArrayList<String>()
        titles.add("Overview")
        titles.add("Ingredients")
        titles.add("Instructions")

        if (args.newResult == null) {
            Toast.makeText(this, "Result null", Toast.LENGTH_SHORT).show()
        } else {
            val resultBundle = Bundle()
            resultBundle.putParcelable("recipeBundle", args.newResult)

            val adapter = PagerAdapter(
                resultBundle,
                fragments,
                titles,
                supportFragmentManager
            )

            viewPager.adapter = adapter
            tabLayout.setupWithViewPager(viewPager)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}