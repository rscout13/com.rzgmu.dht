package com.bene_gesserit.fragtest

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bene_gesserit.fragtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val dataModel: DataModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        manageFragments()
    }

    private fun manageFragments() {

        openFragment(R.id.frame, BlankFragment_1.newInstance())

        dataModel.message.observe(this) {

            when (it) {
                STATE.BLANK_FRAGMENT_1 -> {
                    openFragment(R.id.frame, BlankFragment_1.newInstance())
                }
                STATE.BLANK_FRAGMENT_2 -> {
                    openFragment(R.id.frame, BlankFragment_2.newInstance())
                }
                STATE.BLANK_FRAGMENT_3 -> {
                    openFragment(R.id.frame, BlankFragment_3.newInstance())
                }
                STATE.BLANK_FRAGMENT_4 -> {
                    openFragment(R.id.frame, BlankFragment_4.newInstance())
                }
                STATE.BLANK_FRAGMENT_5 -> {
                    openFragment(R.id.frame, BlankFragment_5.newInstance())
                }
                STATE.BLANK_FRAGMENT_6 -> {
                    openFragment(R.id.frame, BlankFragment_6.newInstance())
                }
                STATE.BLANK_FRAGMENT_7 -> {
                    openFragment(R.id.frame, BlankFragment_7.newInstance())
                }
            }
        }

    }

    private fun openFragment(idHolder: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, fragment)
            .addToBackStack(null)
            .commit()
    }

}
