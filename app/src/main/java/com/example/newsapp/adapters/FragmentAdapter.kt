package com.example.newsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsapp.MainActivity
import com.example.newsapp.fragmentClasses.*
import com.example.newsapp.utils.Constants.TOTAL_NEWS_TAB

class FragmentAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle){

    override fun getItemCount(): Int = TOTAL_NEWS_TAB

    override fun createFragment(position: Int): Fragment {

        when (position) {
            0 -> {
                return GeneralFragment("General")
            }
            1 -> {
                return GeneralFragment("Business")
            }
            2 -> {
                return GeneralFragment("Entertainment")
            }
            3 -> {
                return GeneralFragment("Science")
            }
            4 -> {
                return GeneralFragment("Sports")
            }
            5 -> {
                return GeneralFragment("Tech")
            }
            6 -> {
                return GeneralFragment("Health")
            }

            else -> return GeneralFragment("General")

        }
    }
}