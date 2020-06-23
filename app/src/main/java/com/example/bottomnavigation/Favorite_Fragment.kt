package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Favorite_Fragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,saveInstnceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.favorite_fragment, container, false)
    }

}