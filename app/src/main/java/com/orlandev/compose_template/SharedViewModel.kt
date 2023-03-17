package com.orlandev.compose_template

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel() {
    private val _a = MutableStateFlow("")
    val a = _a.asStateFlow()

    fun onChangeA(newA: String) {
        _a.value = newA
    }

}