package es.iessaladillo.pedrojoya.walkingdead.ui.characters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.tipcalculator.R
import es.iessaladillo.pedrojoya.walkingdead.utils.addMenuProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.characters_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuAdd -> navigateToAddCharacter().let { true }
                else -> false
            }
        }
    }

    private fun navigateToAddCharacter() {
        // ...
    }

}