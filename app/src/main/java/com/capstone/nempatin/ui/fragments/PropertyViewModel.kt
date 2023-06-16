package com.capstone.nempatin.ui.fragments

import androidx.lifecycle.*
import androidx.paging.cachedIn
import com.capstone.nempatin.data.PropertyRepository



class PropertyViewModel(repository: PropertyRepository) : ViewModel() {

    val pagedProperties = repository.fetchProperties().cachedIn(viewModelScope)
}








