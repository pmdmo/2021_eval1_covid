package es.iessaladillo.pedrojoya.tipcalculator.ui.tips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.tipcalculator.R
import es.iessaladillo.pedrojoya.tipcalculator.utils.addMenuProvider

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.tips_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuDeleteAll -> deleteAll().let { true }
                R.id.mnuSearch -> toggleSearchVisible().let { true }
                else -> false
            }
        }
    }

    private fun deleteAll() {
        // ...
    }

    private fun toggleSearchVisible() {
        // ...
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}