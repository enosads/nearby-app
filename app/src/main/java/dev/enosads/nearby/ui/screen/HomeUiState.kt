package dev.enosads.nearby.ui.screen

import com.google.android.gms.maps.model.LatLng
import dev.enosads.nearby.data.model.Category
import dev.enosads.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null,
)
