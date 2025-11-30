package ar.arstan.pixelmaterialcalculatorpl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ar.arstan.pixelmaterialcalculatorpl.presentation.CalculatorScreen
import ar.arstan.pixelmaterialcalculatorpl.ui.theme.PixelMaterialCalculatorPLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixelMaterialCalculatorPLTheme {
                CalculatorScreen()
            }
        }
    }
}