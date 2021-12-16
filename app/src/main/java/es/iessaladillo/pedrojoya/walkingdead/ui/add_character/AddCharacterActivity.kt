package es.iessaladillo.pedrojoya.walkingdead.ui.add_character

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.tipcalculator.R
import es.iessaladillo.pedrojoya.walkingdead.utils.addMenuProvider

class AddCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.add_character_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuSave -> save().let { true }
                else -> false
            }
        }
    }

    private fun save() {
        // ...
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}