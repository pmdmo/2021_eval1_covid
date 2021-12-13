package es.iessaladillo.pedrojoya.tipcalculator.ui.main

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService
import es.iessaladillo.pedrojoya.tipcalculator.R
import es.iessaladillo.pedrojoya.tipcalculator.utils.addMenuProvider

private const val TIP_RESULT: String = "TIP_RESULT"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        setupMenu()
    }

    private fun setupMenu() {
        addMenuProvider(R.menu.main_activity) { menuItem ->
            when (menuItem.itemId) {
                R.id.mnuTips -> navigateToTips().let { true }
                else -> false
            }
        }
    }

    private fun navigateToTips() {
        // ...
    }

    private fun copyToClipBoard(text: String) {
        getSystemService<ClipboardManager>()?.setPrimaryClip(ClipData.newPlainText(TIP_RESULT, text))
    }

}