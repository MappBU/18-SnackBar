package com.example.materialbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.materialbutton.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var binding:ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.containedIconButton?.setOnClickListener(this)



    }

    override fun onClick(view: View) {
        // Показывает всплывающее сообщение снизу
        Snackbar.make(view, R.string.badBoys, Snackbar.LENGTH_LONG)

                // создает кнопку Play на сообщении снизу, и навешивает слушатель нажатий
            .setAction(R.string.play){

                binding?.result?.text = getString(R.string.startMovies)

            }

            .setBackgroundTint(ContextCompat.getColor (this, R.color.black))
            .setTextColor(ContextCompat.getColor (this, R.color.white))
            .setActionTextColor(ContextCompat.getColor (this, R.color.orange))
            .show()
    }

}