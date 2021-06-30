package com.nwanneka.tabs

import android.app.FragmentManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nwanneka.tabs.views.CallsFragment
import com.nwanneka.tabs.views.ChatsFragment
import com.nwanneka.tabs.views.StatusFragment

class WhatsappAdapter(fm: androidx.fragment.app.FragmentManager): FragmentStatePagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return  "Chats"
            1 -> return  "Status"
            2 -> return  "Calls"
            else -> return "Chats"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatsFragment()
            1 ->  return StatusFragment()
            2 ->  return CallsFragment()
            else ->return ChatsFragment()
        }
    }
}