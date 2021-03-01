package com.jeremieguillot.retrofitcall.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeremieguillot.retrofitcall.data.EventsRepository
import com.jeremieguillot.retrofitcall.data.model.HistoricalEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val repository: EventsRepository
) : ViewModel() {

    private val _events: MutableLiveData<List<HistoricalEvents>> = MutableLiveData()
    val events: LiveData<List<HistoricalEvents>> get() = _events

    fun getHistoricalEvents() {
        viewModelScope.launch {
            val result = repository.getHistoricalEvents()
            _events.value = result.body() ?: emptyList()
        }
    }
}