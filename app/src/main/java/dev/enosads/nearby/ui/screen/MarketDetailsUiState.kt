package dev.enosads.nearby.ui.screen

import dev.enosads.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)
