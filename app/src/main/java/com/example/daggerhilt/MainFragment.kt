package com.example.daggerhilt

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import javax.inject.Inject


@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var toastHelper: com.example.mylibrary.ToastHelper


//    @Inject
//    lateinit var viewModel: WallpaperViewModel<Int>


    @Inject
    lateinit var toast: Toast
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        toastHelper = com.example.mylibrary.ToastHelper(requireActivity())
//        viewModel = ViewModelProvider(this).get(WallpaperViewModel::class.java) as WallpaperViewModel<Int>

        toast.showToast("Hello")


//        showToastMessage()
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        lifecycleScope.launchWhenStarted {
//            viewModel.getWallpaperListFlow().collect { itemImageList ->
////                waSetAdapters(itemImageList)
//                Log.d("itemImageList", "itemImageList: $itemImageList")
//            }
//        }
        showToastMessage()
    }

    // Example method to show toast
    private fun showToastMessage() {
//        lifecycleScope.launchWhenStarted {
//            viewModel.getWallpaperListFlow().collect { itemImageList ->
////                waSetAdapters(itemImageList)
//                Log.d("itemImageList", "itemImageList: $itemImageList")
//                toastHelper.showToast("itemImageList: $itemImageList")
                toastHelper.showToast("itemImageList: ")
//            }
//        }
        }
}