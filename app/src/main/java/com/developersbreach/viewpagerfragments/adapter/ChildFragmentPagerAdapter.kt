package com.developersbreach.viewpagerfragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.developersbreach.viewpagerfragments.fragment.FirstFragment
import com.developersbreach.viewpagerfragments.fragment.SecondFragment


class ChildFragmentPagerAdapter(
    fragmentActivity: FragmentActivity?
) : FragmentStateAdapter(fragmentActivity!!) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
        }
        return FirstFragment()
    }

    override fun getItemCount(): Int {
        return 2
    }
}