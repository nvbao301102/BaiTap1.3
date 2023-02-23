package com.example.baitap13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentViewModel2.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentViewModel2 : ViewModel() {
    val data2 = MutableLiveData<String>()

    fun setData(newData2 : String){
        data2.value = newData2
    }
}